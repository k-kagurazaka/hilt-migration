package com.kkagurazaka.hilt.migration.ui.login

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kkagurazaka.hilt.migration.R
import com.thirdparty.ThirdPartyLibrary
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.label_fragment) {
    @Inject
    lateinit var checkInjectionSuccess: ThirdPartyLibrary

    @JvmField
    @field:Inject
    var activity: LoginActivity? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        checkInjectionSuccess.run()
        requireNotNull(activity)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.label).text = "LoginFragment"
    }
}
