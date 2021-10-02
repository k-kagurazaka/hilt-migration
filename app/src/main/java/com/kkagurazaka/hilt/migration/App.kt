package com.kkagurazaka.hilt.migration

import com.kkagurazaka.hilt.migration.di.ApplicationComponent
import com.kkagurazaka.hilt.migration.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {
    val component: ApplicationComponent =
        DaggerApplicationComponent.factory().create(this)

    override fun onCreate() {
        component.inject(this)
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        component
}
