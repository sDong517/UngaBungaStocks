package com.plcoding.stockmarketapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CompanyListingEntity(

    // We only want these three fields from the returned CSV file, annotated by the id as the primary key
    val name: String,
    val symbol: String,
    val exchange: String,
    @PrimaryKey val id: Int? = null

)
