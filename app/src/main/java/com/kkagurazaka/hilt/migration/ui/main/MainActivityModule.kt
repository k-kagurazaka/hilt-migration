package com.kkagurazaka.hilt.migration.ui.main

import com.kkagurazaka.hilt.migration.di.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    fun contributesMainActivity(): MainActivity
}
