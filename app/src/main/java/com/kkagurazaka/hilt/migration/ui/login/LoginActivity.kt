package com.kkagurazaka.hilt.migration.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kkagurazaka.hilt.migration.App
import com.kkagurazaka.hilt.migration.R

class LoginActivity : AppCompatActivity() {
    lateinit var component: LoginActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        component = (applicationContext as App).component
            .loginActivityComponent().create(this)
        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.content, LoginFragment())
                .commit()
        }
    }
}
