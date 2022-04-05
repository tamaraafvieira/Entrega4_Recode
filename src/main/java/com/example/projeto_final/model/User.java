package com.example.projeto_final.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")

public class User {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer id;
    private String name;

    @Column(unique = true)
    private String cpf;
    private String email;

    @Column(columnDefinition = "TEXT")
    private String rua;
    private String numero;
    private String complemento;
    private String cep;
    private String situacao;


    public User(String name, String cpf, String email,
                String rua, String numero, String complemento,
                String cep, String situacao) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.situacao = situacao;

    }
}
