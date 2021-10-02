package com.kkagurazaka.hilt.migration.ui.singup.sns

import androidx.lifecycle.ViewModel
import com.kkagurazaka.hilt.migration.ui.singup.SignupViewModel
import javax.inject.Inject

class SnsSignupViewModel @Inject constructor() : ViewModel(), SignupViewModel {
    override val label: String = "SnsSignupViewModel"
}
