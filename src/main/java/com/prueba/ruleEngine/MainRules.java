package com.prueba.ruleEngine;

public class MainRules {
    private MainRules() { }

    public static void main(String[] args){
        final RuleEngine rules = new RuleEngine();
        System.out.println("Numero: " + 1);
        rules.execute(1);
        System.out.println("Numero: " + 2);
        rules.execute(2);
        System.out.println("Numero: " + -1);
        rules.execute(-1);
        System.out.println("Numero: " + -5);
        rules.execute(-5);
        System.out.println("Numero: " + 13);
        rules.execute(13);
        System.out.println("Numero: " + 4);
        rules.execute(4);
    }
}
