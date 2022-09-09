package com.psahexagonal;

import com.psahexagonal.infraestrutura.adaptadores.repositories.SpringTarefaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = SpringTarefaRepository.class)
public class PsaHexagonalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsaHexagonalApplication.class, args);
    }

}
