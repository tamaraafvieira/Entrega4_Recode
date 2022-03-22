package com.example.projeto_final_sq58.model;

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
@Table(name = "users")
public class User {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;

    private String img;

    private String job;

    private String location;
    private String telephone;
    private String graduate;
    @Column(columnDefinition = "TEXT")
    private String about;

    //experience
    private String local1;
    private String funcao1;
    private String atividade1;

    private String local2;
    private String funcao2;
    private String atividade2;

    //cursos
    private String instituicao1;
    private String carga_horaria1;
    private String aprendeu1;

    private String instituicao2;
    private String carga_horaria2;
    private String aprendeu2;

    private String habilidades;

    public User(String name, String email, String password,
                String job, String location, String telephone,
                String graduate, String about, String local1,
                String funcao1, String atividade1, String local2,
                String funcao2, String atividade2, String instituicao1,
                String carga_horaria1, String aprendeu1, String instituicao2,
                String carga_horaria2, String aprendeu2, String habilidades) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.job = job;
        this.location = location;
        this.telephone = telephone;
        this.graduate = graduate;
        this.about = about;
        this.local1 = local1;
        this.funcao1 = funcao1;
        this.atividade1 = atividade1;
        this.local2 = local2;
        this.funcao2 = funcao2;
        this.atividade2 = atividade2;
        this.instituicao1 = instituicao1;
        this.carga_horaria1 = carga_horaria1;
        this.aprendeu1 = aprendeu1;
        this.instituicao2 = instituicao2;
        this.carga_horaria2 = carga_horaria2;
        this.aprendeu2 = aprendeu2;
        this.habilidades = habilidades;
    }
}
