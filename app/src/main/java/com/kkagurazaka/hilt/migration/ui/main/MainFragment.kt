package com.kkagurazaka.hilt.migration.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.kkagurazaka.hilt.migration.R
import com.kkagurazaka.hilt.migration.ui.login.LoginActivity
import com.kkagurazaka.hilt.migration.ui.singup.email.EmailSignupActivity
import com.kkagurazaka.hilt.migration.ui.singup.sns.SnsSignupActivity
import com.thirdparty.ThirdPartyLibrary
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.main_fragment) {
    @Inject
    lateinit var checkInjectionSuccess: ThirdPartyLibrary

    override fun onAttach(context: Context) {
        super.onAttach(context)
        checkInjectionSuccess.run()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.login_button).setOnClickListener {
            startActivity(Intent(requireContext(), LoginActivity::class.java))
        }

        view.findViewById<Button>(R.id.email_signup_button).setOnClickListener {
            startActivity(Intent(requireContext(), EmailSignupActivity::class.java))
        }

        view.findViewById<Button>(R.id.sns_signup_button).setOnClickListener {
            startActivity(Intent(requireContext(), SnsSignupActivity::class.java))
        }
    }
}
