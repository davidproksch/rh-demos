package com.redhat.proksch.demo.warehouseaccess;

/**
 * Service interface for name service.
 * 
 */
public interface GreetingsService {

    /**
     * Generate Greetings
     *
     * @return a string greetings
     */
    Greetings getGreetings( String name);

}
