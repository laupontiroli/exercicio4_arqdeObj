package br.insper.Exercicio4.investimento.titulo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TituloRepository extends JpaRepository<Titulo,Integer> {

    public List<Titulo> findByTipo(String tipo);
}
