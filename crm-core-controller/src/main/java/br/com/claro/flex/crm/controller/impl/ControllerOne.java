package br.com.claro.flex.crm.controller.impl;

import br.com.claro.flex.crm.controller.IControllerOne;
import br.com.claro.flex.crm.service.IServiceOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOne implements IControllerOne {

    @Autowired
    private IServiceOne iServiceOne;
    @Override
    public String getFirstController() {
        System.out.printf("first controller");
        return iServiceOne.getFirstService();
    }
}
