package com.aitangba.volley;

import java.io.InputStream;

/**
 * Created by fhf11991 on 2016/8/24.
 */

public abstract class HttpEntity {

    public abstract void setContent(InputStream inputStream);

    public abstract InputStream getContent() throws IllegalStateException;

    public abstract void setContentLength(long length);

    public abstract long getContentLength();

    public abstract void setContentEncoding(String encoding);

    public abstract void setContentType(String getContentType);
}
