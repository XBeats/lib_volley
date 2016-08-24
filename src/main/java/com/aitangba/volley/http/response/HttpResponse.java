package com.aitangba.volley.http.response;

import com.aitangba.volley.HttpEntity;

import java.util.Map;


/**
 * Created by fhf11991 on 2016/8/24.
 */

public abstract class HttpResponse {

    public abstract void setEntity(HttpEntity httpEntity);

    public abstract HttpEntity getEntity();

    public abstract void addHeader(String key, String value);

    public abstract void setStatusCode(int code);

    public abstract int getStatusCode();

    public abstract Map<String, String> getAllHeaders();
}
