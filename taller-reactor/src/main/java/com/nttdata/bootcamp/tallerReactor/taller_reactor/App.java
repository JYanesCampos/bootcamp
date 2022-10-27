package com.nttdata.bootcamp.tallerReactor.taller_reactor;


import java.util.function.Consumer;

import io.reactivex.Observable;
import reactor.core.publisher.Flux;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Flux<String> messageSender = Flux.just("mensaje1", "mensaje2", "Mensaje3");

        messageSender.subscribe(subscribe -> System.out.println("Observer 1. Subscribe"),
        		next -> System.out.println("Observer 1. received"),
        		error -> System.out.println("Observer 1. Error"),
        		completed -> System.out.println("Observer 1. Completed"));
    }
}
