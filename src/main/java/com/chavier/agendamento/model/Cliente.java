package com.chavier.agendamento.model;

import jakarta.persistence.*;
import lombok.*; // Importe tudo de lombok para facilitar

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor // Adicionado
@AllArgsConstructor // Adicionado
@EqualsAndHashCode(of = "id") // Adicionado
public class Cliente {
    // ... (o resto do código continua igual)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 20)
    private String telefone;

    @Column(unique = true, length = 100)
    private String email;
}
