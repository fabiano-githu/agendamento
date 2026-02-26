package com.chavier.agendamento.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity // Anotação que informa ao JPA que esta classe é uma entidade do banco de dados
@Getter   // Lombok: Gera os getters para todos os campos
@Setter   // Lombok: Gera os setters para todos os campos
public class Cliente {

    @Id // Define que este campo é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia de geração da chave (autoincremento)
    private Long id;

    private String nome;
    private String telefone;
    private String email;
}
