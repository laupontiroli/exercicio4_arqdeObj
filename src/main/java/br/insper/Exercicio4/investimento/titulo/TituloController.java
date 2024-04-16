package br.insper.Exercicio4.investimento.titulo;

import br.insper.Exercicio4.investimento.investidor.Investidor;
import br.insper.Exercicio4.investimento.investidor.InvestidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TituloController {
    @Autowired
    private TituloService tituloService;

    @PostMapping("/titulo")
    public Titulo criarTitulo(@RequestBody Titulo titulo) {
        return tituloService.criaTitulo(titulo);
    }

    @GetMapping("/titulo")
    public List<Titulo> listarTitulos(@RequestParam(required = false) String tipo){
        return tituloService.listarTitulos(tipo);
    }

    @DeleteMapping("/titulo")
    public void DeletarTitulo(@RequestBody Titulo titulo){
        tituloService.deletaTitulo(titulo);
    }
}
