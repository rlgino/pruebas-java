package com.patterns.observerLoader;

import java.util.ServiceLoader;

public class ObserversLoader {
    private static final ServiceLoader<Observable> serviceLoader = ServiceLoader.load(Observable.class);

    public static void runSaludar(){
        for (Observable obs : serviceLoader) {
            obs.saludar();
        }
    }

    public static void runCharlar(){
        for (Observable obs : serviceLoader) {
            obs.saludar();
        }
    }

    public static void runDespedir(){
        for (Observable obs : serviceLoader) {
            obs.saludar();
        }
    }
}
