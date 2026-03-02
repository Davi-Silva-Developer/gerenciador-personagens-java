package br.com.gerenciador.service;

import br.com.gerenciador.model.Personagem;

import java.util.Comparator;
import java.util.List;


public class FiltroService {
    public void listarPorCategoria(List<Personagem>lista, String categoriaDesejada){
        List<Personagem> resultado =  lista.stream()
                .filter(p->p.categoria().equalsIgnoreCase(categoriaDesejada))
                .toList();


        //Verificaando se a lista esta vazia
        if (resultado.isEmpty()){
            System.out.println("Nenhum personagem encontrado na categoria: " + categoriaDesejada);
        }else{
            //Se não estiver vazia, aí  imprimir os nomes
            resultado.forEach(p-> System.out.println(p.nome()));
        }


    }

    public void listarPorPontuacaoMinima(List<Personagem> lista, int pontuacaoMinima){
        List<Personagem> resultado = lista.stream()
                .filter(p ->p.pontuacao() >= pontuacaoMinima)
                .sorted(Comparator.comparing(Personagem::pontuacao).reversed())
                .toList();
        //Verificaando se a lista esta vazia
        if (resultado.isEmpty()){
            System.out.println("Nenhum personagem encontrado com essa pontuação minima: " + pontuacaoMinima);
        }else{
            //Se não estiver vazia, aí  imprimir os nomes
            resultado.forEach(p-> System.out.println(p.nome()));
        }


    }










}
