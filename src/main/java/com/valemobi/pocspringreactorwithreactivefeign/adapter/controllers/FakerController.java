package com.valemobi.pocspringreactorwithreactivefeign.adapter.controllers;

import com.github.javafaker.Avatar;
import com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.FakerUseCase;
import com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.io.ProductsOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webflux")
@SuppressWarnings("unused")
public class FakerController {

    private final FakerUseCase useCase;

    public FakerController(FakerUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping("/avatar")
    public Mono<Avatar> getAvatar() {
        return useCase.getAvatar();
    }


}
