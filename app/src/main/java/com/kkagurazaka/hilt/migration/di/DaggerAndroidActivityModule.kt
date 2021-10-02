package com.kkagurazaka.hilt.migration.di

import com.kkagurazaka.hilt.migration.ui.main.MainFragmentModule
import com.kkagurazaka.hilt.migration.ui.singup.email.EmailSignupViewModelModule
import com.kkagurazaka.hilt.migration.ui.singup.registration.EmailSignupUserRegistrationFragmentModule
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module(
    includes = [
        MainFragmentModule::class,

        EmailSignupViewModelModule::class,
        EmailSignupUserRegistrationFragmentModule::class,
    ]
)
interface DaggerAndroidActivityModule
