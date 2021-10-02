package com.kkagurazaka.hilt.migration.di

import com.kkagurazaka.hilt.migration.App
import com.kkagurazaka.hilt.migration.ui.login.LoginActivityComponent
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@EntryPoint
interface ApplicationComponent : AndroidInjector<App> {
    fun loginActivityComponent(): LoginActivityComponent.Factory
}

@InstallIn(SingletonComponent::class)
@Module(
    includes = [
        AndroidInjectionModule::class,
        ApplicationModule::class,
        RepositoryModule::class,
        ActivityModule::class,
    ]
)
interface AggregatorModule
