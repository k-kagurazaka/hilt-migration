package com.kkagurazaka.hilt.migration.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kkagurazaka.hilt.migration.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
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
