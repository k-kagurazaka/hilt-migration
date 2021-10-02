package com.kkagurazaka.hilt.migration.di

import com.kkagurazaka.hilt.migration.domain.UserRepository
import com.kkagurazaka.hilt.migration.infra.UserRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {
    @Binds
    fun bindsUserRepository(impl: UserRepositoryImpl): UserRepository
}
