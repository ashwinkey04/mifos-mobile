package org.mifos.mobile.models.payload

import com.google.gson.annotations.SerializedName

/**
 * Created by Ashwin on 23rd June 2020
 */

data class LoginPayload(

        @SerializedName("username")
        var username: String? = null,

        @SerializedName("password")
        var password: String? = null
)