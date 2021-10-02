package com.kkagurazaka.hilt.migration.di

import com.kkagurazaka.hilt.migration.ui.login.LoginActivityComponent
import com.kkagurazaka.hilt.migration.ui.singup.email.EmailSignupActivityModule
import com.kkagurazaka.hilt.migration.ui.singup.sns.SnsSignupActivityModule
import dagger.Module

@Module(
    includes = [
        EmailSignupActivityModule::class,
        SnsSignupActivityModule::class,
    ],
    subcomponents = [
        LoginActivityComponent::class
    ]
)
interface ActivityModule
