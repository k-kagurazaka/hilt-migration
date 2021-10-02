package com.kkagurazaka.hilt.migration.di

import com.kkagurazaka.hilt.migration.ui.singup.sns.SnsSignupActivityModule
import dagger.Module

@Module(
    includes = [
        SnsSignupActivityModule::class,
    ]
)
interface ActivityModule
