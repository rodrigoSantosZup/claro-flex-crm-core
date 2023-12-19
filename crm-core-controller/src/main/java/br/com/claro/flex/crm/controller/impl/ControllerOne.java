package br.com.claro.flex.crm.controller.impl;

import br.com.claro.flex.crm.controller.IControllerOne;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOne implements IControllerOne {
    @Override
    public String getFirstController() {
        System.out.printf("first controller");
        return "first controller";
    }
}
