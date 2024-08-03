package com.kupreychik.chuck_berry_jakarta.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
@WebFilter("/*")
public class LoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        log.info("Request received: {} {}", request.getRemoteAddr(), request.getRemotePort());
        chain.doFilter(request, response);
        log.info("Response sent to: {} {}", request.getRemoteAddr(), request.getRemotePort());
    }
}
