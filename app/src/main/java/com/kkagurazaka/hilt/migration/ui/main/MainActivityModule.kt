package com.kkagurazaka.hilt.migration.ui.main

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.hilt.android.scopes.ActivityScoped

@Module
interface MainActivityModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    fun contributesMainActivity(): MainActivity
}
