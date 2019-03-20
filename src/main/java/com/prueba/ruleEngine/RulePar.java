package com.prueba.ruleEngine;

public class RulePar implements Rule{
    @Override
    public Boolean validate(Integer i) {
        return i % 2 == 0;
    }

    @Override
    public void doAction() {
        System.out.println("Es nro par");
    }
}
