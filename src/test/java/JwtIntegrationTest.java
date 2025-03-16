package com.jwtvalidation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JwtIntegrationTest {

    private static final String SECRET = "superSecretKey123";

    @Test
    void testGenerateAndValidateValidJwt() {
        // Gerar um JWT com claims válidas
        String name = "Toninho Araújo";
        String role = "Admin";
        long seed = 7841; // Número primo válido

        String generatedJwt = JwtUtils.generateJwt(name, role, seed, SECRET);

        // Validar o JWT gerado
        boolean isValid = JwtValidator.isValidJwt(generatedJwt);
        assertFalse(isValid, "O JWT gerado deveria ser válido.");
    }

    @Test
    void testGenerateAndValidateJwtWithInvalidRole() {
        // Gerar um JWT com uma role inválida
        String name = "João da Silva";
        String role = "InvalidRole";
        long seed = 7841L;

        String generatedJwt = JwtUtils.generateJwt(name, role, seed, SECRET);

        // Validar o JWT gerado
        boolean isValid = JwtValidator.isValidJwt(generatedJwt);
        assertFalse(isValid, "O JWT com role inválida deveria ser considerado inválido.");
    }

    @Test
    void testGenerateAndValidateJwtWithInvalidSeed() {
        // Gerar um JWT com um seed não primo
        String name = "Maria Oliveira";
        String role = "Member";
        long seed = 4L; // Não é primo

        String generatedJwt = JwtUtils.generateJwt(name, role, seed, SECRET);

        // Validar o JWT gerado
        boolean isValid = JwtValidator.isValidJwt(generatedJwt);
        assertFalse(isValid, "O JWT com seed não primo deveria ser considerado inválido.");
    }

    @Test
    void testGenerateAndValidateJwtWithInvalidName() {
        // Gerar um JWT com um nome contendo números
        String name = "Carlos123";
        String role = "External";
        long seed = 11L; // Número primo válido

        String generatedJwt = JwtUtils.generateJwt(name, role, seed, SECRET);

        // Validar o JWT gerado
        boolean isValid = JwtValidator.isValidJwt(generatedJwt);
        assertFalse(isValid, "O JWT com nome inválido (contendo números) deveria ser considerado inválido.");
    }
}
