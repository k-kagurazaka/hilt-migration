package com.kkagurazaka.hilt.migration.ui.login

import com.kkagurazaka.hilt.migration.di.ActivityScope
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginActivityComponent {
    fun inject(activity: LoginActivity)

    fun loginFragmentComponent(): LoginFragmentComponent.Factory

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance activity: LoginActivity): LoginActivityComponent
    }
}
