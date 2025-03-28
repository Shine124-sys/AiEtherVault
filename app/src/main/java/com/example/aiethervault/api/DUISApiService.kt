package com.example.aiethervault.api


import com.example.aiethervault.model.BlockResponse
import com.example.aiethervault.model.TransactionRequest
import com.example.aiethervault.model.TransactionResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface DUISApiService {

    // Example: Get blockchain transaction by ID
    @GET("transactions/{id}")
    suspend fun getTransactionById(@Path("id") transactionId: String): Response<TransactionResponse>

    // Example: Create a new blockchain transaction
    @POST("transactions")
    suspend fun createTransaction(@Body request: TransactionRequest): Response<TransactionResponse>

    // Example: Get the blockchain's latest block
    @GET("blocks/latest")
    suspend fun getLatestBlock(): Response<BlockResponse>




}
