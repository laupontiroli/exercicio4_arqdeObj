package br.insper.Exercicio4.investimento.titulo;

import jakarta.persistence.*;

@Entity
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false,unique = true)
    private String indentificador;
    @Column(nullable = false)
    private String tipo;

    public Titulo(String nome, String indentificador, String tipo) {
        this.nome = nome;
        this.indentificador = indentificador;
        this.tipo = tipo;
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

    public String getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(String indentificador) {
        this.indentificador = indentificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
