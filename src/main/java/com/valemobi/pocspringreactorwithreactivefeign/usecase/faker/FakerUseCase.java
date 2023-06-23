package com.valemobi.pocspringreactorwithreactivefeign.usecase.faker;

import com.github.javafaker.Address;
import com.github.javafaker.Avatar;
import com.github.javafaker.DragonBall;
import com.github.javafaker.Pokemon;
import reactor.core.publisher.Mono;

public interface FakerUseCase {

    Mono<Avatar> getAvatar();

    Avatar getAvatarBlocking();

    Mono<DragonBall> getDbz();

    Mono<Address> getAddress();

    Mono<Pokemon> getPokemon();

}
