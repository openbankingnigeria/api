package com.openbanking.api.ng.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.openbanking.api.ng.definition.ErrorCode;
import com.openbanking.api.ng.payload.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.provider.error.OAuth2AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class RestAuthenticationFailureHandler extends OAuth2AuthenticationEntryPoint {

    public RestAuthenticationFailureHandler() {
        super();
    }

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
        httpServletResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage("Access Denied");
        errorResponse.setCode(ErrorCode.UNAUTHORIZED.name());

        OutputStream out = httpServletResponse.getOutputStream();
        com.fasterxml.jackson.databind.ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(out, errorResponse);
        out.flush();
    }
}
