package com.aitangba.volley.http.response;

import com.aitangba.volley.HttpEntity;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by fhf11991 on 2016/8/24.
 */

public class BasicHttpResponse extends HttpResponse {

    private String protocolVersion;
    private int responseCode;
    private String responseMessage;
    private Map<String, String> mHeads;
    private HttpEntity mHttpEntity;

    public BasicHttpResponse(String protocolVersion, int responseCode, String responseMessage) {
        this.protocolVersion = protocolVersion;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        mHeads = new HashMap<>();
    }

    @Override
    public void setEntity(HttpEntity httpEntity) {
        mHttpEntity = httpEntity;
    }

    @Override
    public HttpEntity getEntity() {
        return mHttpEntity;
    }

    @Override
    public void addHeader(String key, String value) {
        mHeads.put(key, value);
    }

    @Override
    public void setStatusCode(int code) {
        responseCode = code;
    }

    @Override
    public int getStatusCode() {
        return responseCode;
    }

    @Override
    public Map<String, String> getAllHeaders() {
        if(mHeads == null) {
            mHeads = new HashMap<>();
        }
        return mHeads;
    }
}
