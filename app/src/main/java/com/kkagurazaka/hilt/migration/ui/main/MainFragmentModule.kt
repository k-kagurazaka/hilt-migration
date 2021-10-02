package com.kkagurazaka.hilt.migration.ui.main

import com.kkagurazaka.hilt.migration.di.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector
    fun contributesMainFragment(): MainFragment
}
