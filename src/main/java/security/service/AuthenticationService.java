package main.java.security.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import main.java.security.model.AuthenticationRequest;
import org.springframework.security.core.Authentication;

public interface AuthenticationService {

    Authentication getAuthentication(Jws<Claims> request);

    Authentication authenticate(AuthenticationRequest authenticationRequest);

}
