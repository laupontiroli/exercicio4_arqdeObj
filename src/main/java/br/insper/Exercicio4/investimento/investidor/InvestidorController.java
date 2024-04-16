package br.insper.Exercicio4.investimento.investidor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvestidorController {

    @Autowired
    private InvestidorService investidorService;

    @PostMapping("/investidor")
    public Investidor salvarInvestidor(@RequestBody Investidor investidor) {
        return investidorService.cadastraInvestidor(investidor);
    }

    @GetMapping("/investidor")
    public List<Investidor> listarInvestidores(@RequestParam(required = false) String perfil){
        return investidorService.listarInvestidores(perfil);
    }

    @DeleteMapping("/investidor")
    public void DeletarInvestidor(@RequestBody Investidor investidor){
        investidorService.deletaInvestidor(investidor);
    }
}
