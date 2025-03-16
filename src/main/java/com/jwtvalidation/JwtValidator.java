package com.jwtvalidation;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Claim;

import java.util.Map;

public class JwtValidator {
    public static boolean isValidJwt(String token) {
        try {
            var decodedJwt = JWT.decode(token);
            Map<String, Claim> claims = decodedJwt.getClaims();

            // Valida o número de claims
            if (claims.size() != 3) return false;

            // Valida a claim "Name" (não pode conter números e máximo de 256 caracteres)
            String name = claims.get("Name").asString();
            if (name == null || name.matches(".*\\d.*") || name.length() > 256) return false;

            // Valida a claim "Role" (Admin, Member ou External)
            String role = claims.get("Role").asString();
            if (role == null || (!role.equals("Admin") && !role.equals("Member") && !role.equals("External"))) return false;

            // Valida a claim "Seed" (número primo)
            String seedStr = claims.get("Seed").asString();
            if (seedStr == null || !PrimeNumberUtil.isPrime(Long.parseLong(seedStr))) return false;

            return true;
        } catch (JWTDecodeException | NumberFormatException e) {
            return false;
        }
    }
}
