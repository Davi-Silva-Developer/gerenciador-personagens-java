package br.com.gerenciador;

import br.com.gerenciador.model.Personagem;
import br.com.gerenciador.repository.BauGenerico;
import br.com.gerenciador.service.FiltroService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String escolha;
        int pontuacao;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome da categoria do personagem:");
        escolha = scanner.nextLine();


        BauGenerico<Personagem> meuBau = new BauGenerico<>();
        Personagem p1 = new Personagem("Lion", "S.T.A.R.S", 1000);
        Personagem p2 = new Personagem("Adan", "AGENTE DUPLO", 750);
        Personagem p3 = new Personagem("Salazhar", "SANDLER", 600);
        Personagem p4= new Personagem("Krauzer", "UMBRELLA", 800);

        meuBau.salvar(p1);
        meuBau.salvar(p2);
        meuBau.salvar(p3);
        meuBau.salvar(p4);

        FiltroService servico = new FiltroService();
        System.out.println("--- Buscando personagens  ---");

        servico.listarPorCategoria(meuBau.buscarTodos(), escolha);


        try {
            System.out.println("Digite o valor de pontuação que deseja mínimo:");
            pontuacao = scanner.nextInt();

            System.out.println("--- Buscando Por Pontuações  ---");
            servico.listarPorPontuacaoMinima(meuBau.buscarTodos(), pontuacao);
        }catch(InputMismatchException erroDigitacao){
            System.out.println("Ops! Você deve digitar apenas números.");
        } ;




    }
}