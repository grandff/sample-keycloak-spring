# Spring Boot Auth Server Embedded Keycloak

## What is it

keycloak을 embedded 한 spring auth server이다.

## Pre-Configuration

realm을 구성할 수 있는 json 형식의 설정 파일이 필요하다. Keycloak 관리 콘솔을 사용해서 구성할 수 있는 모든 내용은 이 JSON에 유지된다.

권한 부여 서버는 sample-realm.json으로 사전 구성된다. 이 파일에서 몇가지 구성이 확인 가능하다.

- users : 기본 사용자는 <john@test.com> 및 <mike@other.com> 이고, 자격 증명도 포함되어 있다.
- clients : id가 newClient인 클라이언트를 정의한다.
- standardFlowEnabled : true로 설정하여, newClient에 대한 인증 코드 흐름을 활성화한다.
- redirectUris : 인증 성공 후 서버가 리다이렉션할 newClient의 URl이 나열된다.
- webOrigins : redirectUris로 나열된 모든 URL에 대해 CORS 지원을 허용하려면 "+"로 설정한다.

Keycloak 서버는 기본적으로 JWT 토큰을 발급하므로 이를 위한 별도 구성이 필요하진 않는다.

## Maven Configuration

## How To Use and Run

## TO DO

[ ] keycloak embedded server
" <https://github.com/Baeldung/spring-security-oauth/tree/master/oauth-rest/oauth-authorization-server>

## Refrences

[keycloak embedded](https://www.baeldung.com/keycloak-embedded-in-spring-boot-app) </br>
[keycloak embedded source code](https://github.com/suchorski/springboot-keycloak-server) </br>
[keycloak](https://github.com/Baeldung/spring-security-oauth/blob/master/oauth-rest/oauth-authorization-server/src/main/java/com/baeldung/auth/config/EmbeddedKeycloakConfig.java)
