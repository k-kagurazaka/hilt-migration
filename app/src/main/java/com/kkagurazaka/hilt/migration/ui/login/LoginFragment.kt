package com.kkagurazaka.hilt.migration.ui.login

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kkagurazaka.hilt.migration.R
import com.thirdparty.ThirdPartyLibrary
import javax.inject.Inject

class LoginFragment: Fragment(R.layout.label_fragment) {
    lateinit var component: LoginFragmentComponent

    @Inject
    lateinit var checkInjectionSuccess: ThirdPartyLibrary

    override fun onAttach(context: Context) {
        super.onAttach(context)
        component = (requireActivity() as LoginActivity).component
            .loginFragmentComponent().create(this)
        component.inject(this)

        checkInjectionSuccess.run()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.label).text = "LoginFragment"
    }
}
