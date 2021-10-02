package com.kkagurazaka.hilt.migration.ui.singup.registration

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.kkagurazaka.hilt.migration.R
import com.kkagurazaka.hilt.migration.ui.singup.SignupViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject
import javax.inject.Provider

class UserRegistrationFragment : DaggerFragment(R.layout.label_fragment) {
    @Inject
    lateinit var parentViewModel: SignupViewModel

    @Inject
    lateinit var viewModelProvider: Provider<UserRegistrationViewModel>
    private val viewModel by lazy { viewModelProvider.get() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.label).text =
            "${parentViewModel.label}\n${viewModel.label}"
    }
}
