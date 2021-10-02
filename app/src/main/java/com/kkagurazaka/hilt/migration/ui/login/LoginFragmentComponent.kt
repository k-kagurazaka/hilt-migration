package com.kkagurazaka.hilt.migration.ui.login

import dagger.BindsInstance
import dagger.Subcomponent
import dagger.hilt.android.scopes.FragmentScoped

@FragmentScoped
@Subcomponent
interface LoginFragmentComponent {
    fun inject(fragment: LoginFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance fragment: LoginFragment): LoginFragmentComponent
    }
}
