package com.kkagurazaka.hilt.migration.ui.singup.email

import androidx.lifecycle.ViewModel
import com.kkagurazaka.hilt.migration.ui.singup.SignupViewModel
import javax.inject.Inject

class EmailSignupViewModel @Inject constructor() : ViewModel(), SignupViewModel {
    override val label: String = "EmailSignupViewModel"
}
