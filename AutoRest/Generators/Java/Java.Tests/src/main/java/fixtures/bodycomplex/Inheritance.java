// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodycomplex;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;
import fixtures.bodycomplex.models.Siamese;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

public interface Inheritance {
    @GET("/complex/inheritance/valid")
    Siamese getValid() throws ServiceException;

    @GET("/complex/inheritance/valid")
    void getValidAsync(Callback<Siamese> cb);

    @PUT("/complex/inheritance/valid")
    Response putValid(@Body Siamese complexBody) throws ServiceException;

    @PUT("/complex/inheritance/valid")
    void putValidAsync(@Body Siamese complexBody, Callback<Response> cb);

}
