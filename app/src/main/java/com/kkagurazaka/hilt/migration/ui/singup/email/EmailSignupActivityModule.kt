package com.kkagurazaka.hilt.migration.ui.singup.email

import androidx.lifecycle.ViewModelProvider
import com.kkagurazaka.hilt.migration.di.ActivityScope
import com.kkagurazaka.hilt.migration.ui.common.ActivityViewModelFactory
import com.kkagurazaka.hilt.migration.ui.singup.registration.EmailSignupUserRegistrationFragmentModule
import com.kkagurazaka.hilt.migration.ui.singup.SignupViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Provider

@Module
interface EmailSignupActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            ViewModelModule::class,
            EmailSignupUserRegistrationFragmentModule::class,
        ]
    )
    fun contributesEmailSignupActivity(): EmailSignupActivity

    @Module
    class ViewModelModule {
        @Provides
        fun providesSignupViewModel(
            activity: EmailSignupActivity,
            viewModelProvider: Provider<EmailSignupViewModel>
        ): SignupViewModel =
            ViewModelProvider(
                activity,
                ActivityViewModelFactory<EmailSignupViewModel>(activity) {
                    viewModelProvider.get()
                }
            ).get(EmailSignupViewModel::class.java)
    }
}
