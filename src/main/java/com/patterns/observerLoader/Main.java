package com.patterns.observerLoader;

import java.util.ServiceLoader;

public class Main {
    private Main() {
    }

    public static void main(String[] args){
        final ServiceLoader<Observable> loader = ServiceLoader.load(Observable.class);
        loader.reload();
        loader.forEach(Observable::saludar);
        loader.forEach(Observable::charlar);
        loader.forEach(Observable::despedir);

    }
}
