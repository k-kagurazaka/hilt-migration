package com.kkagurazaka.hilt.migration.ui.singup.email

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kkagurazaka.hilt.migration.R
import com.kkagurazaka.hilt.migration.ui.singup.registration.UserRegistrationFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EmailSignupActivity : AppCompatActivity() {
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
