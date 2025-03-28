package com.example.aiethervault.api


import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

data class PropertyRegistrationRequest(
    val propertyName: String,
    val propertyId: String,
    val ownerName: String,
    val ownerId: String,
    val uniqueIdentifier: String
)

data class ApiResponse(
    val status: String,
    val message: String
)

interface BlockchainApiService {
    @POST("registerProperty")
    suspend fun registerProperty(
        @Body request: PropertyRegistrationRequest
    ): Response<ApiResponse>
}
