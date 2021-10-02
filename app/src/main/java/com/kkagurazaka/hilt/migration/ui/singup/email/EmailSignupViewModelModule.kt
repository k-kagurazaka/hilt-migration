package com.kkagurazaka.hilt.migration.ui.singup.email

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.kkagurazaka.hilt.migration.ui.common.ActivityViewModelFactory
import com.kkagurazaka.hilt.migration.ui.singup.SignupViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Provider

@Module
class EmailSignupViewModelModule {
    @Provides
    fun providesSignupViewModel(
        activity: Activity,
        viewModelProvider: Provider<EmailSignupViewModel>
    ): SignupViewModel =
        ViewModelProvider(
            activity as ComponentActivity,
            ActivityViewModelFactory<EmailSignupViewModel>(activity) {
                viewModelProvider.get()
            }
        ).get(EmailSignupViewModel::class.java)
}
