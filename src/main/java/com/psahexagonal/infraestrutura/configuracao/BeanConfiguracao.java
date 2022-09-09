package com.psahexagonal.infraestrutura.configuracao;

import com.psahexagonal.dominio.adaptadores.services.TarefaServiceImp;
import com.psahexagonal.dominio.portas.interfaces.TarefaServicePort;
import com.psahexagonal.dominio.portas.repositories.TarefaRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracao {

    @Bean
    TarefaServicePort tarefaService(TarefaRepositoryPort tarefaRepositoryPort) {
        return new TarefaServiceImp(tarefaRepositoryPort);
    }
}
