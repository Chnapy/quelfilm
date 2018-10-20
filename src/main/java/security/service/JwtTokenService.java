package main.java.security.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import main.java.model.dto.UserDto;
import main.java.security.model.JwtTokens;
import org.springframework.security.core.Authentication;

public interface JwtTokenService {

    JwtTokens createTokens(Authentication authentication);

    String createToken(UserDto user);

    String createRefreshToken(UserDto user);

    JwtTokens refreshJwtToken(String token);

    Jws<Claims> validateJwtToken(String token);

}