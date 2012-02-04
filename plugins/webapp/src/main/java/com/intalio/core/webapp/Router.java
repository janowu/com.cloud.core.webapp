/**
 * Copyright (C) 1999-2011, Intalio Inc.
 *
 * The program(s) herein may be used and/or copied only with
 * the written permission of Intalio Inc. or in accordance with
 * the terms and conditions stipulated in the agreement/contract
 * under which the program(s) have been supplied.
 */
package com.intalio.core.webapp;

import javax.servlet.http.HttpServletRequest;

/**
 * The router to map requests coming in to object operations.
 */
public class Router {

    /**
     * The system property to use a default user when the auth principal is not
     * known. When it is null, we use 'Ghalimi' for now. When it is false. We
     * return null. Once everyone uses the auth app we should turn this to
     * false.
     */
    public static final String SYS_PROP_KEY_DEFAULT_USER_NAME_WHEN_NO_AUTH = "com.intalio.core.webapp.defaultusername";

    /**
     * Error code that will be read by the servlet page error handler when
     * calling ServletResponse.sendError
     * 
     * See org.eclipse.jetty.server Dispatcher for more constants.
     */
    private static final String ERROR_EXCEPTION = "javax.servlet.error.exception";
    private static final String ERROR_EXCEPTION_TYPE = "javax.servlet.error.exception_type";
    private static final String ERROR_STATUS_CODE = "javax.servlet.error.status_code";
    private volatile boolean _initialized = false;

    protected Object getHandlerInternal(HttpServletRequest request)
            throws Exception {
        return this;
    }

}
