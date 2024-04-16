package br.insper.Exercicio4.investimento.investimento;

import br.insper.Exercicio4.investimento.investidor.Investidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestimentoRepository extends JpaRepository<Investimento,Integer> {
    public List<Investimento> findByInvestidor(Investidor investidor);
}
