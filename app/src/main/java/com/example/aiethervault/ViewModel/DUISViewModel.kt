package com.example.aiethervault.ViewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DUISViewModel : ViewModel() {

    private val _fullName = MutableStateFlow("")
    val fullName: StateFlow<String> get() = _fullName

    private val _email = MutableStateFlow("")
    val email: StateFlow<String> get() = _email

    private val _username = MutableStateFlow("")
    val username: StateFlow<String> get() = _username

    private val _password = MutableStateFlow("")
    val password: StateFlow<String> get() = _password

    private val _confirmPassword = MutableStateFlow("")
    val confirmPassword: StateFlow<String> get() = _confirmPassword

    private val _emailVerificationChecked = MutableStateFlow(false)
    val emailVerificationChecked: StateFlow<Boolean> get() = _emailVerificationChecked

    private val _phoneVerificationChecked = MutableStateFlow(false)
    val phoneVerificationChecked: StateFlow<Boolean> get() = _phoneVerificationChecked

    fun updateFullName(newValue: String) {
        _fullName.value = newValue
    }

    fun updateEmail(newValue: String) {
        _email.value = newValue
    }

    fun updateUsername(newValue: String) {
        _username.value = newValue
    }

    fun updatePassword(newValue: String) {
        _password.value = newValue
    }

    fun updateConfirmPassword(newValue: String) {
        _confirmPassword.value = newValue
    }

    fun toggleEmailVerification() {
        _emailVerificationChecked.value = !_emailVerificationChecked.value
    }

    fun togglePhoneVerification() {
        _phoneVerificationChecked.value = !_phoneVerificationChecked.value
    }
}
