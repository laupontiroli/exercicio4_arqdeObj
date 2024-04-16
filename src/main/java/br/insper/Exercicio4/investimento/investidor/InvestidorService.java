package br.insper.Exercicio4.investimento.investidor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestidorService {

    @Autowired
    private InvestidorRepository investidorRepository;

    public Investidor cadastraInvestidor(Investidor investidor){
        return investidorRepository.save(investidor);
    }

    public void deletaInvestidor(Investidor investidor){
        investidorRepository.delete(investidor);
    }

    public List<Investidor> listarInvestidores(String perfil){
        if(perfil != null){
            return investidorRepository.findByPerfil(perfil);
        }
        return investidorRepository.findAll();
    }
}
