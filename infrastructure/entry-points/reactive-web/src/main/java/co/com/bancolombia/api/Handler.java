package co.com.bancolombia.api;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    //private  final UseCase useCase;

    public Mono<ServerResponse> listenGETUseCase(ServerRequest serverRequest) {
        return serverRequest.principal()
                .flatMap(principal -> {
                    if (principal instanceof Authentication authentication) {
                        System.out.println(authentication.getAuthorities());
                    }

                    return ServerResponse.ok().bodyValue(principal.getName());
                });
    }

    public Mono<ServerResponse> listenGETOtherUseCase(ServerRequest serverRequest) {
        // useCase.logic();
        return ServerResponse.ok().bodyValue("");
    }
}
