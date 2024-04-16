package br.insper.Exercicio4.investimento.investimento;

import br.insper.Exercicio4.investimento.investidor.Investidor;
import br.insper.Exercicio4.investimento.titulo.Titulo;
import jakarta.persistence.*;

import javax.swing.*;
import java.time.LocalDateTime;

@Entity
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    Investidor investidor;

    @ManyToOne
    Titulo titulo;

    Float valor;

    LocalDateTime data;


    public Investimento(Investidor investidor, Titulo titulo, Float valor) {
        this.investidor = investidor;
        this.titulo = titulo;
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
