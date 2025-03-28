package com.example.aiethervault.ViewModel



import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LandRegistrationViewModel : ViewModel() {
    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery

    private val _propertyMessage = MutableStateFlow("")
    val propertyMessage: StateFlow<String> = _propertyMessage

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun registerProperty(propertyDetails: Map<String, String>) {
        viewModelScope.launch {
            // Simulate registration process
            _propertyMessage.value = "Property successfully registered on the blockchain."
        }
    }
}
