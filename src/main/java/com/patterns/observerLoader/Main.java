package com.patterns.observerLoader;

import java.util.ServiceLoader;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args){
        ServiceLoader<Observable> loader = ServiceLoader.load(Observable.class);
        Iterable<Observable> iterable = () -> loader.iterator();
        Stream<Observable> stream = StreamSupport.stream(iterable.spliterator(), false);
        stream.forEach(Observable::saludar);

    }
}
