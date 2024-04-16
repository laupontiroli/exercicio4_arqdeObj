package br.insper.Exercicio4.investimento.investidor;

import jakarta.persistence.*;
@Entity
public class Investidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true,nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String perfil;

    public Investidor(String nome, String cpf, String perfil) {
        this.nome = nome;
        this.cpf = cpf;
        this.perfil = perfil;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
