package com.kkagurazaka.hilt.migration

import android.app.Application
import com.kkagurazaka.hilt.migration.di.ApplicationComponent
import dagger.hilt.EntryPoints
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    val component: ApplicationComponent by lazy {
        EntryPoints.get(this, ApplicationComponent::class.java)
    }
}
