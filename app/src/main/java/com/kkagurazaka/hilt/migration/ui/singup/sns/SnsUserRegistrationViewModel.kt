package com.kkagurazaka.hilt.migration.ui.singup.sns

import androidx.lifecycle.ViewModel
import com.kkagurazaka.hilt.migration.ui.singup.registration.UserRegistrationViewModel
import javax.inject.Inject

class SnsUserRegistrationViewModel @Inject constructor(
) : ViewModel(), UserRegistrationViewModel {
    override val label: String = "SnsUserRegistrationViewModel"
}
