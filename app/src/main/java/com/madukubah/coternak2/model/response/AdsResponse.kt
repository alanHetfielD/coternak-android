package com.madukubah.coternak2.model.response

import com.google.gson.annotations.SerializedName
import com.madukubah.coternak2.model.Ad

data class AdsResponse (
        @field:SerializedName("value")
        val Ads : List<Ad>
)