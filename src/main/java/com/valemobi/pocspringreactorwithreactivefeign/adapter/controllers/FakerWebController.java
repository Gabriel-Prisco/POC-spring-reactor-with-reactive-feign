package com.valemobi.pocspringreactorwithreactivefeign.adapter.controllers;

import com.valemobi.pocspringreactorwithreactivefeign.domain.marketplace.Product;
import com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.FakerUseCase;
import com.valemobi.pocspringreactorwithreactivefeign.usecase.faker.io.Rapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/web")
public class FakerWebController {

    private final FakerUseCase useCase;

    public FakerWebController(FakerUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping("/rapper")
    public Rapper getRapper() {
        return useCase.getRapperBlocking();
    }

}
