package br.com.cgtecnologia.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "br.com.cgtecnologia",
        "br.com.cgtecnologia.infrastructure.web.api",
        "br.com.cgtecnologia.infrastructure.persistence.jpa"
})
public class InfrastructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfrastructureApplication.class, args);
    }

}
