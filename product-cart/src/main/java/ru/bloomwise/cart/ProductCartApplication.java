package ru.bloomwise.cart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Slf4j
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableConfigurationProperties
public class ProductCartApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProductCartApplication.class, args);
    log.info("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
        + "::                        SERVICE STARTED                      ::     \n"
        + ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
  }
}
