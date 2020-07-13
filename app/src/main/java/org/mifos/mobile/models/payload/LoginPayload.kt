package org.mifos.mobile.models.payload

import com.google.gson.annotations.SerializedName

/**
 * Created by Ashwin on 23rd June 2020
 */

data class LoginPayload(

        var username: String? = null,

        var password: String? = null
)