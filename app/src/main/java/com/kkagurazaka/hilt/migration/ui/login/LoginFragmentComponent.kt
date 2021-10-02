package com.kkagurazaka.hilt.migration.ui.login

import com.kkagurazaka.hilt.migration.di.FragmentScope
import dagger.BindsInstance
import dagger.Subcomponent

@FragmentScope
@Subcomponent
interface LoginFragmentComponent {
    fun inject(fragment: LoginFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance fragment: LoginFragment): LoginFragmentComponent
    }
}
