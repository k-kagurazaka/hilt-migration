package com.kkagurazaka.hilt.migration.ui.login

import dagger.BindsInstance
import dagger.Subcomponent
import dagger.hilt.android.scopes.ActivityScoped

@ActivityScoped
@Subcomponent
interface LoginActivityComponent {
    fun inject(activity: LoginActivity)

    fun loginFragmentComponent(): LoginFragmentComponent.Factory

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance activity: LoginActivity): LoginActivityComponent
    }
}
