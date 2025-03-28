package com.example.aiethervault.api

interface FacebookApi {
    @GET("search")
    suspend fun searchAccounts(
        @Query("q") name: String,
        @Query("type") type: String = "user",
        @Query("fields") fields: String = "id,name,picture",
        @Query("access_token") accessToken: String
    ): FacebookResponse
}

data class FacebookResponse(val data: List<FacebookUser>)
data class FacebookUser(val id: String, val name: String, val picture: PictureData)
data class PictureData(val data: PictureUrl)
data class PictureUrl(val url: String)
