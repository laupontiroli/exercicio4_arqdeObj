package br.insper.Exercicio4.investimento.investimento;

import br.insper.Exercicio4.investimento.investidor.InvestidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestimentoService {

    @Autowired
    InvestimentoRepository investimentoRepository;

    @Autowired
    InvestidorRepository investidorRepository;

    public Investimento cadastraInvestimento(Investimento investimento) {
        String tipoUsuario = investimento.getInvestidor().getPerfil();
        if (tipoUsuario.equals("CONSERVADOR") && !(investimento.getTitulo().getTipo().equals("Ação"))) {
            return investimentoRepository.save(investimento);
        }
        if (tipoUsuario.equals("MODERADO")) {
            List<Investimento> investimentos = investimentoRepository.findByInvestidor(investimento.getInvestidor());
            Integer count = 0;
            for (Investimento investimentoUsuario : investimentos) {
                if (investimentoUsuario.getTitulo().getTipo().equals("Ação")) {
                    count++;
                }
            }
            if ( (count + 1) / investimentos.size() <= 0.5) {
                return investimentoRepository.save(investimento);
            }
        }
        return null;
    }

    public List<Investimento> listarInvestimentos(String cpf){
        if (!cpf.isEmpty()){
            return investimentoRepository.findByInvestidor(investidorRepository.findByCpf(cpf));
        }
        return investimentoRepository.findAll();
    }

}
