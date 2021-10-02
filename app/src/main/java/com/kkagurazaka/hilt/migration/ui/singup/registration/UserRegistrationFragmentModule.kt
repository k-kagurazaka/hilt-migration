package com.kkagurazaka.hilt.migration.ui.singup.registration

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kkagurazaka.hilt.migration.ui.common.FragmentViewModelFactory
import com.kkagurazaka.hilt.migration.ui.singup.email.EmailSignupActivity
import com.kkagurazaka.hilt.migration.ui.singup.email.EmailUserRegistrationViewModel
import com.kkagurazaka.hilt.migration.ui.singup.sns.SnsSignupActivity
import com.kkagurazaka.hilt.migration.ui.singup.sns.SnsUserRegistrationViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Provider

@Module
interface UserRegistrationFragmentModule {
    @FragmentScoped
    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    fun contributesUserRegistrationFragment(): UserRegistrationFragment

    @Module
    class ViewModelModule {
        @Provides
        fun providesUserRegistrationViewModel(
            activity: Activity,
            fragment: UserRegistrationFragment,
            emailProvider: Provider<EmailUserRegistrationViewModel>,
            snsProvider: Provider<SnsUserRegistrationViewModel>
        ): UserRegistrationViewModel =
            when (activity) {
                is EmailSignupActivity -> getViewModel(fragment, emailProvider)
                is SnsSignupActivity -> getViewModel(fragment, snsProvider)
                else -> throw IllegalArgumentException()
            }

        private inline fun <reified T> getViewModel(
            fragment: Fragment,
            viewModelProvider: Provider<T>
        ): T where T : UserRegistrationViewModel, T : ViewModel =
            ViewModelProvider(
                fragment,
                FragmentViewModelFactory<T>(fragment) {
                    viewModelProvider.get()
                }
            ).get(T::class.java)
    }
}
