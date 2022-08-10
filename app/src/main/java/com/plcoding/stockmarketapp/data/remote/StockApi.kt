package com.plcoding.stockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")

    suspend fun getListings(
        @Query("apikey") apiKey : String = API_KEY
    ): ResponseBody

    companion object {
        // This is a free API key with heavy limitations
        // For the purposes of demonstration, I did not hide this
        const val API_KEY = "5HWWW2VIAFBM5BIA"
        const val BASE_URL = "https://www.alphavantage.co"
    }
}