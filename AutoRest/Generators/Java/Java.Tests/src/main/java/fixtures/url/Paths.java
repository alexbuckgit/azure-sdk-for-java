// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.url;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;
import fixtures.url.models.UriColor;
import java.util.Date;
import retrofit.http.GET;
import retrofit.http.Path;

public interface Paths {
    @GET("/paths/bool/true/{boolPath}")
    Response getBooleanTrue(@Path("boolPath") boolean boolPath) throws ServiceException;

    @GET("/paths/bool/true/{boolPath}")
    void getBooleanTrueAsync(@Path("boolPath") boolean boolPath, Callback<Response> cb);

    @GET("/paths/bool/false/{boolPath}")
    Response getBooleanFalse(@Path("boolPath") boolean boolPath) throws ServiceException;

    @GET("/paths/bool/false/{boolPath}")
    void getBooleanFalseAsync(@Path("boolPath") boolean boolPath, Callback<Response> cb);

    @GET("/paths/int/1000000/{intPath}")
    Response getIntOneMillion(@Path("intPath") int intPath) throws ServiceException;

    @GET("/paths/int/1000000/{intPath}")
    void getIntOneMillionAsync(@Path("intPath") int intPath, Callback<Response> cb);

    @GET("/paths/int/-1000000/{intPath}")
    Response getIntNegativeOneMillion(@Path("intPath") int intPath) throws ServiceException;

    @GET("/paths/int/-1000000/{intPath}")
    void getIntNegativeOneMillionAsync(@Path("intPath") int intPath, Callback<Response> cb);

    @GET("/paths/long/10000000000/{longPath}")
    Response getTenBillion(@Path("longPath") long longPath) throws ServiceException;

    @GET("/paths/long/10000000000/{longPath}")
    void getTenBillionAsync(@Path("longPath") long longPath, Callback<Response> cb);

    @GET("/paths/long/-10000000000/{longPath}")
    Response getNegativeTenBillion(@Path("longPath") long longPath) throws ServiceException;

    @GET("/paths/long/-10000000000/{longPath}")
    void getNegativeTenBillionAsync(@Path("longPath") long longPath, Callback<Response> cb);

    @GET("/paths/float/1.034E+20/{floatPath}")
    Response floatScientificPositive(@Path("floatPath") double floatPath) throws ServiceException;

    @GET("/paths/float/1.034E+20/{floatPath}")
    void floatScientificPositiveAsync(@Path("floatPath") double floatPath, Callback<Response> cb);

    @GET("/paths/float/-1.034E-20/{floatPath}")
    Response floatScientificNegative(@Path("floatPath") double floatPath) throws ServiceException;

    @GET("/paths/float/-1.034E-20/{floatPath}")
    void floatScientificNegativeAsync(@Path("floatPath") double floatPath, Callback<Response> cb);

    @GET("/paths/double/9999999.999/{doublePath}")
    Response doubleDecimalPositive(@Path("doublePath") double doublePath) throws ServiceException;

    @GET("/paths/double/9999999.999/{doublePath}")
    void doubleDecimalPositiveAsync(@Path("doublePath") double doublePath, Callback<Response> cb);

    @GET("/paths/double/-9999999.999/{doublePath}")
    Response doubleDecimalNegative(@Path("doublePath") double doublePath) throws ServiceException;

    @GET("/paths/double/-9999999.999/{doublePath}")
    void doubleDecimalNegativeAsync(@Path("doublePath") double doublePath, Callback<Response> cb);

    @GET("/paths/string/unicode/{stringPath}")
    Response stringUnicode(@Path("stringPath") String stringPath) throws ServiceException;

    @GET("/paths/string/unicode/{stringPath}")
    void stringUnicodeAsync(@Path("stringPath") String stringPath, Callback<Response> cb);

    @GET("/paths/string/begin%21%2A%27%28%29%3B%3A%40%20%26%3D%2B%24%2C%2F%3F%23%5B%5Dend/{stringPath}")
    Response stringUrlEncoded(@Path("stringPath") String stringPath) throws ServiceException;

    @GET("/paths/string/begin%21%2A%27%28%29%3B%3A%40%20%26%3D%2B%24%2C%2F%3F%23%5B%5Dend/{stringPath}")
    void stringUrlEncodedAsync(@Path("stringPath") String stringPath, Callback<Response> cb);

    @GET("/paths/string/empty/{stringPath}")
    Response stringEmpty(@Path("stringPath") String stringPath) throws ServiceException;

    @GET("/paths/string/empty/{stringPath}")
    void stringEmptyAsync(@Path("stringPath") String stringPath, Callback<Response> cb);

    @GET("/paths/string/null/{stringPath}")
    Response stringNull(@Path("stringPath") String stringPath) throws ServiceException;

    @GET("/paths/string/null/{stringPath}")
    void stringNullAsync(@Path("stringPath") String stringPath, Callback<Response> cb);

    @GET("/paths/enum/green%20color/{enumPath}")
    Response enumValid(@Path("enumPath") UriColor enumPath) throws ServiceException;

    @GET("/paths/enum/green%20color/{enumPath}")
    void enumValidAsync(@Path("enumPath") UriColor enumPath, Callback<Response> cb);

    @GET("/paths/string/null/{enumPath}")
    Response enumNull(@Path("enumPath") UriColor enumPath) throws ServiceException;

    @GET("/paths/string/null/{enumPath}")
    void enumNullAsync(@Path("enumPath") UriColor enumPath, Callback<Response> cb);

    @GET("/paths/byte/multibyte/{bytePath}")
    Response byteMultiByte(@Path("bytePath") byte[] bytePath) throws ServiceException;

    @GET("/paths/byte/multibyte/{bytePath}")
    void byteMultiByteAsync(@Path("bytePath") byte[] bytePath, Callback<Response> cb);

    @GET("/paths/byte/empty/{bytePath}")
    Response byteEmpty(@Path("bytePath") byte[] bytePath) throws ServiceException;

    @GET("/paths/byte/empty/{bytePath}")
    void byteEmptyAsync(@Path("bytePath") byte[] bytePath, Callback<Response> cb);

    @GET("/paths/byte/null/{bytePath}")
    Response byteNull(@Path("bytePath") byte[] bytePath) throws ServiceException;

    @GET("/paths/byte/null/{bytePath}")
    void byteNullAsync(@Path("bytePath") byte[] bytePath, Callback<Response> cb);

    @GET("/paths/date/2012-01-01/{datePath}")
    Response dateValid(@Path("datePath") Date datePath) throws ServiceException;

    @GET("/paths/date/2012-01-01/{datePath}")
    void dateValidAsync(@Path("datePath") Date datePath, Callback<Response> cb);

    @GET("/paths/date/null/{datePath}")
    Response dateNull(@Path("datePath") Date datePath) throws ServiceException;

    @GET("/paths/date/null/{datePath}")
    void dateNullAsync(@Path("datePath") Date datePath, Callback<Response> cb);

    @GET("/paths/datetime/2012-01-01T01%3A01%3A01Z/{dateTimePath}")
    Response dateTimeValid(@Path("dateTimePath") Date dateTimePath) throws ServiceException;

    @GET("/paths/datetime/2012-01-01T01%3A01%3A01Z/{dateTimePath}")
    void dateTimeValidAsync(@Path("dateTimePath") Date dateTimePath, Callback<Response> cb);

    @GET("/paths/datetime/null/{dateTimePath}")
    Response dateTimeNull(@Path("dateTimePath") Date dateTimePath) throws ServiceException;

    @GET("/paths/datetime/null/{dateTimePath}")
    void dateTimeNullAsync(@Path("dateTimePath") Date dateTimePath, Callback<Response> cb);

}
