package com.kkagurazaka.hilt.migration.ui.login

import android.app.Activity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
class LoginActivityModule {
    @Provides
    fun providesLoginActivity(activity: Activity): LoginActivity? =
        activity as? LoginActivity?
}
