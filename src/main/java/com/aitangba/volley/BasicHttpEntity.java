package com.aitangba.volley;

import java.io.InputStream;

/**
 * Created by fhf11991 on 2016/8/24.
 */
public class BasicHttpEntity extends HttpEntity {

    private InputStream content;
    private long length;

    protected Header contentType;
    protected Header contentEncoding;

    public BasicHttpEntity()
    {
        this.length = -1L;
    }

    @Override
    public void setContent(InputStream inputStream) {
        this.content = inputStream;
    }

    public InputStream getContent() throws IllegalStateException
    {
        if (this.content == null) {
            throw new IllegalStateException("Content has not been provided");
        }
        return this.content;
    }

    @Override
    public void setContentLength(long length) {
        this.length = length;
    }

    @Override
    public long getContentLength() {
        return this.length;
    }

    public void setContentEncoding(Header contentEncoding)
    {
        this.contentEncoding = contentEncoding;
    }

    @Override
    public void setContentEncoding(String ceString)
    {
        Header h = null;
        if (ceString != null) {
            h = new Header("Content-Encoding", ceString);
        }
        setContentEncoding(h);
    }

    public void setContentType(Header contentType)
    {
        this.contentType = contentType;
    }

    @Override
    public void setContentType(String ctString)
    {
        Header h = null;
        if (ctString != null) {
            h = new Header("Content-Type", ctString);
        }
        setContentType(h);
    }
}
