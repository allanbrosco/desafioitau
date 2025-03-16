package com.jwtvalidation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JwtValidatorTest {

    @Test
    void testValidJwt_Caso1() {
        String validJwt_Caso1 = "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJTZWVkIjoiNzg0MSIsIk5hbWUiOiJUb25pbmhvIEFyYXVqbyJ9.QY05sIjtrcJnP533kQNk8QXcaleJ1Q01jWY_ZzIZuAg";
        assertTrue(JwtValidator.isValidJwt(validJwt_Caso1), "O JWT válido deveria retornar verdadeiro.");
    }

    @Test
    void testJwtWithInvalidRole_Caso2() {
        //String jwtWithInvalidRole = "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiSW52YWxpZCIsIlNlZWQiOiI3ODQxIiwiTmFtZSI6IlRvbmLuaG8gQXJhdWpvIn0.ABC123";
        String jwtWithInvalidRole_Caso2 ="eyJhbGciOiJzI1NiJ9.dfsdfsfryJSr2xrIjoiQWRtaW4iLCJTZrkIjoiNzg0MSIsIk5hbrUiOiJUb25pbmhvIEFyYXVqbyJ9.QY05fsdfsIjtrcJnP533kQNk8QXcaleJ1Q01jWY_ZzIZuAg";
        assertFalse(JwtValidator.isValidJwt(jwtWithInvalidRole_Caso2), "O JWT com Role inválido deveria retornar falso.");
    }

    @Test
    void testJwtWithInvalidSeed_Caso3() {
        //String jwtWithInvalidSeed = "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJTZWVkIjoiNCIsIk5hbWUiOiJUb25pbmhvIEFyYXVqbyJ9.Def456";
        String jwtWithInvalidSeed_Caso3 = "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiRXh0ZXJuYWwiLCJTZWVkIjoiODgwMzciLCJOYW1lIjoiTTRyaWEgT2xpdmlhIn0.6YD73XWZYQSSMDf6H0i3-kylz1-TY_Yt6h1cV2Ku-Qs";
        assertFalse(JwtValidator.isValidJwt(jwtWithInvalidSeed_Caso3), "O JWT com Seed não primo deveria retornar falso.");
    }

    @Test
    void testJwtWithNumberInName_Caso3() {
        String jwtWithNumberInName_Caso3 = "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiTWVtYmVyIiwiU2VlZCI6IjciLCJOYW1lIjoiVG9uaW5obzEyMyJ9.GHI789";
        assertFalse(JwtValidator.isValidJwt(jwtWithNumberInName_Caso3), "O JWT com números no Name deveria retornar falso.");
    }

    @Test
    void testInvalidJwtFormat_Caso4() {
        String invalidJwt_Caso4 = "invalid-jwt";
        assertFalse(JwtValidator.isValidJwt(invalidJwt_Caso4), "JWT inválido no formato deveria retornar falso.");
    }
}

