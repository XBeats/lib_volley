package com.aitangba.volley.http.error;

import com.aitangba.volley.NetworkResponse;
import com.aitangba.volley.VolleyError;

/**
 * Indicates that there was a redirection.
 */
public class RedirectError extends VolleyError {

    public RedirectError() {
    }

    public RedirectError(final Throwable cause) {
        super(cause);
    }

    public RedirectError(final NetworkResponse response) {
        super(response);
    }
}
