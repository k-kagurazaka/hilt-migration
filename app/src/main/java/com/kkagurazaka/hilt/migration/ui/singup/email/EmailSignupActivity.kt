package com.kkagurazaka.hilt.migration.ui.singup.email

import android.os.Bundle
import com.kkagurazaka.hilt.migration.R
import com.kkagurazaka.hilt.migration.ui.singup.registration.UserRegistrationFragment
import dagger.android.support.DaggerAppCompatActivity

class EmailSignupActivity : DaggerAppCompatActivity() {
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
