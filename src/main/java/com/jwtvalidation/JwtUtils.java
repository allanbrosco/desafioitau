package com.jwtvalidation;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

/**
 * Utilitário para geração de JSON Web Tokens (JWTs).
 * <p>
 * Esta classe fornece métodos para criar JWTs com claims personalizadas
 * utilizando o algoritmo HMAC256.
 * </p>
 */
public class JwtUtils {

    /**
     * Gera um JWT com as claims fornecidas.
     *
     * @param name  Nome do usuário, sem números e com no máximo 256 caracteres.
     * @param role  Papel do usuário (Admin, Member, External).
     * @param seed  Um número longo utilizado como "Seed". Deve ser um número primo.
     * @param secret Chave secreta usada para assinar o token.
     * @return Um token JWT assinado contendo as claims especificadas.
     * @throws IllegalArgumentException Se qualquer claim for inválida ou nula.
     */
    public static String generateJwt(String name, String role, long seed, String secret) {
        return JWT.create()
                .withClaim("Name", name)
                .withClaim("Role", role)
                .withClaim("Seed", seed)
                .sign(Algorithm.HMAC256(secret));
    }
}
