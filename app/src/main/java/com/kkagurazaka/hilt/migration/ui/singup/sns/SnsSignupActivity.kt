package com.kkagurazaka.hilt.migration.ui.singup.sns

import android.os.Bundle
import com.kkagurazaka.hilt.migration.R
import com.kkagurazaka.hilt.migration.ui.singup.registration.UserRegistrationFragment
import dagger.android.support.DaggerAppCompatActivity

class SnsSignupActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.content, UserRegistrationFragment())
                .commit()
        }
    }
}
