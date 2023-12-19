package br.com.claro.flex.crm.service.impl;

import br.com.claro.flex.crm.service.IServiceOne;
import org.springframework.stereotype.Service;

@Service
public class ServiceOne implements IServiceOne {
    @Override
    public String getFirstService() {
        System.out.printf("first service");
        return "first service";
    }
}
