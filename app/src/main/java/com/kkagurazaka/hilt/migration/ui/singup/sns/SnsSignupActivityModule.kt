package com.kkagurazaka.hilt.migration.ui.singup.sns

import androidx.lifecycle.ViewModelProvider
import com.kkagurazaka.hilt.migration.di.ActivityScope
import com.kkagurazaka.hilt.migration.ui.common.ActivityViewModelFactory
import com.kkagurazaka.hilt.migration.ui.singup.SignupViewModel
import com.kkagurazaka.hilt.migration.ui.singup.registration.SnsSignupUserRegistrationFragmentModule
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Provider

@Module
interface SnsSignupActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            ViewModelModule::class,
            SnsSignupUserRegistrationFragmentModule::class,
        ]
    )
    fun contributesSnsSignupActivity(): SnsSignupActivity

    @Module
    class ViewModelModule {
        @Provides
        fun providesSignupViewModel(
            activity: SnsSignupActivity,
            viewModelProvider: Provider<SnsSignupViewModel>
        ): SignupViewModel =
            ViewModelProvider(
                activity,
                ActivityViewModelFactory<SnsSignupViewModel>(activity) {
                    viewModelProvider.get()
                }
            ).get(SnsSignupViewModel::class.java)
    }
}
