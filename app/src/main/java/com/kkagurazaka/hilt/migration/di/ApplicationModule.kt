package com.kkagurazaka.hilt.migration.di

import com.thirdparty.ThirdPartyLibrary
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {
    @Singleton
    @Provides
    fun providesThirdPartyLibrary(): ThirdPartyLibrary =
        ThirdPartyLibrary.Builder.build()
}
