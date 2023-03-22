package com.example.groovy.pet.api;

import reactor.core.publisher.Mono;

public class Dummy {

    Mono<String> getClassMono(){
        return Mono.just("value");
    }
}
