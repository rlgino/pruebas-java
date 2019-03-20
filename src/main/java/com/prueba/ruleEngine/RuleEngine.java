package com.prueba.ruleEngine;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
    private final List<Rule> rules;

    public RuleEngine() {
        rules = new ArrayList<Rule>();
        rules.add(new RulePositivo());
        rules.add(new RulePar());
        rules.add(new RulePrimo());
    }

    void execute(int i){
        for (final Rule rule : rules) {
            if (rule.validate(i)) rule.doAction();
        }
    }
}
