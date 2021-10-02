package com.kkagurazaka.hilt.migration.ui.singup.registration

import androidx.lifecycle.ViewModelProvider
import com.kkagurazaka.hilt.migration.di.FragmentScope
import com.kkagurazaka.hilt.migration.ui.common.FragmentViewModelFactory
import com.kkagurazaka.hilt.migration.ui.singup.email.EmailUserRegistrationViewModel
import com.kkagurazaka.hilt.migration.ui.singup.sns.SnsUserRegistrationViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Provider

@Module
interface EmailSignupUserRegistrationFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    fun contributesUserRegistrationFragment(): UserRegistrationFragment

    @Module
    class ViewModelModule {
        @Provides
        fun providesUserRegistrationViewModel(
            fragment: UserRegistrationFragment,
            viewModelProvider: Provider<EmailUserRegistrationViewModel>
        ): UserRegistrationViewModel =
            ViewModelProvider(
                fragment,
                FragmentViewModelFactory<EmailUserRegistrationViewModel>(fragment) {
                    viewModelProvider.get()
                }
            ).get(EmailUserRegistrationViewModel::class.java)
    }
}

@Module
interface SnsSignupUserRegistrationFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    fun contributesUserRegistrationFragment(): UserRegistrationFragment

    @Module
    class ViewModelModule {
        @Provides
        fun providesUserRegistrationViewModel(
            fragment: UserRegistrationFragment,
            viewModelProvider: Provider<SnsUserRegistrationViewModel>
        ): UserRegistrationViewModel =
            ViewModelProvider(
                fragment,
                FragmentViewModelFactory<SnsUserRegistrationViewModel>(fragment) {
                    viewModelProvider.get()
                }
            ).get(SnsUserRegistrationViewModel::class.java)
    }
}
