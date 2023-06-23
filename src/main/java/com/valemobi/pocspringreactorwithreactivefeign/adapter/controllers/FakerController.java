package com.valemobi.pocspringreactorwithreactivefeign.adapter.controllers;

import com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.FakerUseCase;
import com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.io.Rapper;
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

    @GetMapping("/products")
    public Mono<Rapper> getRapper() {
        return useCase.getRapper();
    }


}
