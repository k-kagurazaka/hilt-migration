package com.kkagurazaka.hilt.migration.ui.singup.email

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kkagurazaka.hilt.migration.ui.common.ActivityViewModelFactory
import com.kkagurazaka.hilt.migration.ui.singup.SignupViewModel
import com.kkagurazaka.hilt.migration.ui.singup.sns.SnsSignupActivity
import com.kkagurazaka.hilt.migration.ui.singup.sns.SnsSignupViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Provider

@InstallIn(ActivityComponent::class)
@Module
class SignupViewModelModule {
    @Provides
    fun providesSignupViewModel(
        activity: Activity,
        emailProvider: Provider<EmailSignupViewModel>,
        snsProvider: Provider<SnsSignupViewModel>
    ): SignupViewModel =
        when (activity) {
            is EmailSignupActivity -> getViewModel(activity, emailProvider)
            is SnsSignupActivity -> getViewModel(activity, snsProvider)
            else -> throw IllegalArgumentException()
        }

    private inline fun <reified T> getViewModel(
        activity: ComponentActivity,
        viewModelProvider: Provider<T>
    ): T where T : SignupViewModel, T : ViewModel =
        ViewModelProvider(
            activity,
            ActivityViewModelFactory<T>(activity) {
                viewModelProvider.get()
            }
        ).get(T::class.java)
}
