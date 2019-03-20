package com.prueba.ruleEngine;

public class RulePrimo implements Rule{
    @Override
    public Boolean validate(Integer i) {
        return esPrimo(i);
    }

    private Boolean esPrimo(final Integer i) {
        if(i == 1) return true;
        if(i == 0) return false;
        return esPrimo(i, 2);
    }

    private Boolean esPrimo(final int i, Integer cont) {
        if(i == cont) return true;
        if(i % cont == 0) return false;
        else
            return esPrimo(i, i < 0 ? cont - 1 : cont + 1);
    }

    @Override
    public void doAction() {
        System.out.println("Numero primo");
    }
}
