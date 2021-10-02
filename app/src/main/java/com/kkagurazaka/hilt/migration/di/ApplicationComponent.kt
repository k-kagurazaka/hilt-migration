package com.kkagurazaka.hilt.migration.di

import dagger.Module
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@EntryPoint
interface ApplicationComponent

@InstallIn(SingletonComponent::class)
@Module(
    includes = [
        ApplicationModule::class,
        RepositoryModule::class,
    ]
)
interface AggregatorModule
