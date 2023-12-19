package br.com.claro.flex.crm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface IControllerOne {

    @GetMapping("/controller/one")
    @ResponseStatus(HttpStatus.OK)
    String getFirstController();
}
