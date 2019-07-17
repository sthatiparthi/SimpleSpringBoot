package com.sudhakar;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootstrapApplication
{
    private final static Logger APP_LOGGER= LoggerFactory.getLogger(BootstrapApplication.class);
    public static void main( String[] args )
    {
        APP_LOGGER.info("Application Started ");
        SpringApplication.run(BootstrapApplication.class,args);
        APP_LOGGER.info("Application Bootstarp is DONE !! ");
    }
}
