package com.security.security.security;

import com.security.security.entity.UserDetailsImpl;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JWTCore {

    @Value("${security.app.secret}")

    private String secret;
    @Value("${security.app.expirationMm}")
    private String leftTime;

    public String generateToken(Authentication authentication){
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        return Jwts.builder();
    }
}
