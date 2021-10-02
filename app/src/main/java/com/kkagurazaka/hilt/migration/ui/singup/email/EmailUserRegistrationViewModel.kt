package com.kkagurazaka.hilt.migration.ui.singup.email

import androidx.lifecycle.ViewModel
import com.kkagurazaka.hilt.migration.ui.singup.registration.UserRegistrationViewModel
import javax.inject.Inject

class EmailUserRegistrationViewModel @Inject constructor(
): ViewModel(), UserRegistrationViewModel {
    override val label: String = "EmailUserRegistrationViewModel"
}
