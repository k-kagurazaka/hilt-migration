package com.kkagurazaka.hilt.migration.ui.singup.email

import androidx.lifecycle.ViewModelProvider
import com.kkagurazaka.hilt.migration.ui.common.ActivityViewModelFactory
import com.kkagurazaka.hilt.migration.ui.singup.SignupViewModel
import com.kkagurazaka.hilt.migration.ui.singup.registration.EmailSignupUserRegistrationFragmentModule
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Provider

@Module
interface EmailSignupActivityModule {
    @ActivityScoped
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
