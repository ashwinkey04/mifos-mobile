package org.mifos.mobile.api.services;

import org.mifos.mobile.api.ApiEndPoints;
import org.mifos.mobile.models.payload.LoginPayload;
import org.mifos.mobile.models.User;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @author Vishwajeet
 * @since 09/06/16
 */

public interface AuthenticationService {

    @POST(ApiEndPoints.AUTHENTICATION)
    Observable<User> authenticate(@Body LoginPayload loginPayload);

}
