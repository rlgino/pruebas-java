package com.prueba.ruleEngine;

public class RulePositivo implements Rule{
    @Override
    public Boolean validate(Integer i) {
        return i > 0;
    }

    @Override
    public void doAction() {
        System.out.println("Es numero postitivo");
    }
}
