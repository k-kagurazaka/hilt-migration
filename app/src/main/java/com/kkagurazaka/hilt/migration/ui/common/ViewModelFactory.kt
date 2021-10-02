package com.kkagurazaka.hilt.migration.ui.common

import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class ActivityViewModelFactory<VM : ViewModel>(
    activity: ComponentActivity,
    private val factory: (SavedStateHandle) -> VM
) : AbstractSavedStateViewModelFactory(activity, activity.intent?.extras) {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T = factory(handle) as T
}

class FragmentViewModelFactory<VM : ViewModel>(
    fragment: Fragment,
    private val factory: (SavedStateHandle) -> VM
) : AbstractSavedStateViewModelFactory(fragment, fragment.arguments) {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T = factory(handle) as T
}
