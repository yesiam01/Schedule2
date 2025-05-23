package com.example.schedule_second.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Filter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 로그인 및 회원가입은 예외로 처리
        String uri = request.getRequestURI();
        if (uri.equals("/api/users/login") || uri.equals("/api/users")) {
            filterChain.doFilter(request, response);
            return;
        }

        // 세션에 userId가 없으면 인증 실패
        if (request.getSession(false) == null || request.getSession(false).getAttribute("userId") == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("인증이 필요합니다.");
            return;
        }

        filterChain.doFilter(request, response); // 인증 통과
    }
}
