package com.chavier.agendamento.model;

import jakarta.persistence.Column; // Importe a anotação Column
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; // Importe a anotação Table
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes") // Boa prática: nomear a tabela no plural
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100) // Não pode ser nulo, tamanho máximo de 100 caracteres
    private String nome;

    @Column(nullable = false, unique = true, length = 20) // Não pode ser nulo, deve ser único, tamanho máximo de 20
    private String telefone;

    @Column(unique = true, length = 100) // Deve ser único (se preenchido), tamanho máximo de 100
    private String email;
}
