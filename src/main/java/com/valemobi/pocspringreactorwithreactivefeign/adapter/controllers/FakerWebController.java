package com.valemobi.pocspringreactorwithreactivefeign.adapter.controllers;

import com.github.javafaker.Avatar;
import com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.FakerUseCase;
import com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.io.ProductsOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class FakerWebController {

    private final FakerUseCase useCase;

    public FakerWebController(FakerUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping("avatar")
    public Avatar getProducts() {
        return useCase.getAvatarBlocking();
    }

}
