package br.com.gerenciador.repository;

import java.util.ArrayList;
import java.util.List;

public class BauGenerico<T> {
    private List<T> itens = new ArrayList<>();

    //Criando metodo Salvar item

    public void salvar(T item) {
        itens.add(item);
    }
     // Criando metodo para buscar todos os itens
    public List<T> buscarTodos(){

        return itens;
    }

}
