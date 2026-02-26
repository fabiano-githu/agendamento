package com.chavier.agendamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AgendamentoApplication {

    public static void main(String[] args) {
        // A linha abaixo foi corrigida para remover o nome do pacote desnecessário
        SpringApplication.run(AgendamentoApplication.class, args);
    }
}
