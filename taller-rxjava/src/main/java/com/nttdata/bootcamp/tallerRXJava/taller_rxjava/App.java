package com.nttdata.bootcamp.tallerRXJava.taller_rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Observable<String> messageSender = Observable.just("mensaje1", "mensaje2", "Mensaje3");
        
        messageSender.subscribe(new Observer(){
			
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				System.out.println("Observer1. Subscribed.");
			}

			public void onNext(Object t) {
				// TODO Auto-generated method stub
				System.out.println("Observer1. Received");
				
			}
			
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("Observer1. Error: "+e.getMessage());
			}			
			
			public void onComplete() {
				// TODO Auto-generated method stub
				System.out.println("Completed");
			}
        	
        });
        
        messageSender.subscribe(new Observer(){

			
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				System.out.println("Observer2. Subscribed.");
			}

			
			public void onNext(Object t) {
				// TODO Auto-generated method stub
				System.out.println("Observer2. Received");
				
			}

			
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("Observer2. Error: "+e.getMessage());
			}
			
			
			public void onComplete() {
				// TODO Auto-generated method stub
				System.out.println("Completed");
			}
        	
        });

		messageSender.subscribe(new Observer(){
		
			
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				System.out.println("Observer3. Subscribed.");
			}
		
			
			public void onNext(Object t) {
				// TODO Auto-generated method stub
				System.out.println("Observer3. Received");
				
			}
		
			
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("Observer3. Error: "+e.getMessage());
			}
			
			
			public void onComplete() {
				// TODO Auto-generated method stub
				System.out.println("Completed");
			}
			
		});
    }
}
