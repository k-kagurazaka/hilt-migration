package com.kkagurazaka.hilt.migration.di

import com.kkagurazaka.hilt.migration.App
import com.kkagurazaka.hilt.migration.ui.login.LoginActivityComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ApplicationModule::class,
        RepositoryModule::class,
        ActivityModule::class,
    ]
)
interface ApplicationComponent : AndroidInjector<App> {
    fun loginActivityComponent(): LoginActivityComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: App): ApplicationComponent
    }
}
