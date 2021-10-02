package com.kkagurazaka.hilt.migration

import android.app.Application
import com.kkagurazaka.hilt.migration.di.ApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.hilt.EntryPoints
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App : Application(), HasAndroidInjector {
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    val component: ApplicationComponent by lazy {
        EntryPoints.get(this, ApplicationComponent::class.java)
    }

    override fun androidInjector(): AndroidInjector<Any> =
        androidInjector
}
