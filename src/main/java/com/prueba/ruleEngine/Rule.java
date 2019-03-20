package com.prueba.ruleEngine;

public interface Rule {
    Boolean validate(Integer i);

    void doAction();
}
