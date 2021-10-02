package com.kkagurazaka.hilt.migration.ui.main

import android.os.Bundle
import com.kkagurazaka.hilt.migration.R
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.content, MainFragment())
                .commit()
        }
    }
}
