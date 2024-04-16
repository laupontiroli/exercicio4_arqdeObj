package br.insper.Exercicio4.investimento.investimento;

import br.insper.Exercicio4.investimento.investidor.Investidor;
import br.insper.Exercicio4.investimento.investidor.InvestidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;

    @PostMapping("/investimento")
    public Investimento salvarInvestimento(@RequestBody Investimento investimento) {
        return investimentoService.cadastraInvestimento(investimento);
    }

    @GetMapping("/investimento")
    public List<Investimento> listarInvestimentos(@RequestParam(required = false) String cpf){
        return investimentoService.listarInvestimentos(cpf);
    }
}
