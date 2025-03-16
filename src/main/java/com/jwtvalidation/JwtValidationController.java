package com.jwtvalidation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jwt")
public class JwtValidationController {

    @PostMapping("/validate")
    public ResponseEntity<String> validateJwt(@RequestBody JwtRequest jwtRequest) {
        boolean isValid = JwtValidator.isValidJwt(jwtRequest.getToken());

        if (isValid) {
            return ResponseEntity.ok("JWT é válido.");
        } else {
            return ResponseEntity.badRequest().body("JWT é inválido.");
        }
    }
}