package com.pramati;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    private final static Logger APP_LOGGER= LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        APP_LOGGER.info("Application Started ");
        SpringApplication.run(App.class,args);
        APP_LOGGER.info("Application Bootstarp is DONE !! ");
    }
}
