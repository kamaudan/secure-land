package io.github.kamaudan.SecureLand.security;

//
//import io.github.kamaudan.SecureLand.users.User;
//import org.springframework.security.web.reactive.result.view.CsrfRequestDataValueProcessor;
//import org.springframework.security.web.server.csrf.CsrfToken;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@RestControllerAdvice
//public class ControllerAdvice {
//    @ModelAttribute
//    Mono<CsrfToken> csrfToken(ServerWebExchange exchange) {
//        Mono<CsrfToken> csrfToken = exchange.getAttribute(CsrfToken.class.getName());
//        return csrfToken.doOnSuccess(token -> exchange.getAttributes()
//                .put(CsrfRequestDataValueProcessor.DEFAULT_CSRF_ATTR_NAME, token));
//    }
//
//    @ModelAttribute("currentUser")
//    User  currentUser(@CurrentUser User currentUser){
//        return currentUser;
//    }
//
//}
