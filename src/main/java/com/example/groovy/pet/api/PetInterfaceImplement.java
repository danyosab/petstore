//package com.example.groovy.aepenergy02.api;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.NativeWebRequest;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class PetInterfaceImplement implements PetApiDelegate {
//
//    @Override
//    public Mono<ResponseEntity<Flux<Pet>>> findPetsByStatus(String status, ServerWebExchange exchange) {
//        return Mono.just(Flux.defer(() -> {
//            for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
//                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
//                    return Flux.just(new Pet().photoUrls(List.of("photoUrls", "photoUrls")).name("doggie02").id(50L)
//                            .category(Category.builder().id(1L).name("Cats").build())
//                            .tags(List.of(new Tag(1L,"Diego"))));
//                }
//            }
//            return Flux.just(new Pet());
//        })).map(petDTO -> new ResponseEntity<>(petDTO, HttpStatus.OK));
//    }
//
//    @Override
//    public Mono<ResponseEntity<Pet>> getPetById(Long petId, ServerWebExchange exchange) {
//        return PetApiDelegate.super.getPetById(petId, exchange);
//    }
//
//}
