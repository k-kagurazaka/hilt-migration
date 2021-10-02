package com.kkagurazaka.hilt.migration.ui.main

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.hilt.android.scopes.FragmentScoped

@Module
interface MainFragmentModule {
    @FragmentScoped
    @ContributesAndroidInjector
    fun contributesMainFragment(): MainFragment
}
