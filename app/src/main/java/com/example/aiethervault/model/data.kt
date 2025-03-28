package com.example.aiethervault.model


data class TransactionRequest(
    val from: String,
    val to: String,
    val amount: Double
)

data class TransactionResponse(
    val transactionId: String,
    val status: String,
    val timestamp: String
)

data class BlockResponse(
    val blockNumber: Int,
    val previousHash: String,
    val hash: String,
    val transactions: List<TransactionResponse>
)
