package com.welink.web.common.action;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by daniel on 15-3-30.
 */
public class SessionValidateFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}