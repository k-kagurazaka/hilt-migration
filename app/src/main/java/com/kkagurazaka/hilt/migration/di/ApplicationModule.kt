package com.kkagurazaka.hilt.migration.di

import com.thirdparty.ThirdPartyLibrary
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ApplicationModule {
    @Singleton
    @Provides
    fun providesThirdPartyLibrary(): ThirdPartyLibrary =
        ThirdPartyLibrary.Builder.build()
}
