package com.valemobi.pocspringreactorwithreactivefeign.usecase.faker;

import com.github.javafaker.Address;
import com.github.javafaker.DragonBall;
import com.github.javafaker.Pokemon;
import com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.io.Rapper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface FakerUseCase {

    Mono<Rapper> getRapper();

    Rapper getRapperBlocking();

//    Mono<DragonBall> getDbz();
//
//    Mono<Address> getAddress();
//
//    Mono<Pokemon> getPokemon();

}
