package br.insper.Exercicio4.investimento.titulo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TituloService {

    @Autowired
    TituloRepository tituloRepository;

    public Titulo criaTitulo (Titulo titulo){
        return tituloRepository.save(titulo);
    }
    public void deletaTitulo (Titulo titulo){
        tituloRepository.delete(titulo);
    }

    public List<Titulo> listarTitulos(String tipo){
        if (tipo != null){
            return tituloRepository.findByTipo(tipo);
        }
        return tituloRepository.findAll();
    }
}
