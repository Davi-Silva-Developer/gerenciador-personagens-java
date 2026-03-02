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
        int menu = -1;

        Scanner scanner = new Scanner(System.in);

        FiltroService servico = new FiltroService();

        //Inicializando e criando "bau" e personagem
        BauGenerico<Personagem> meuBau = new BauGenerico<>();

        Personagem p1 = new Personagem("Lion", "S.T.A.R.S", 1000);
        Personagem p2 = new Personagem("Adan", "AGENTE DUPLO", 750);
        Personagem p3 = new Personagem("Salazhar", "SANDLER", 600);
        Personagem p4= new Personagem("Krauzer", "UMBRELLA", 800);
        // salvando no "bau"
        meuBau.salvar(p1);
        meuBau.salvar(p2);
        meuBau.salvar(p3);
        meuBau.salvar(p4);



        while(menu != 0) {

            System.out.println("--- MENU DA BIBLIOTECA ---");
            System.out.println("1 - Buscar por Categoria");
            System.out.println("2 - Buscar por Pontuação Minima");
            System.out.println("0 - Sair");

            try{
                menu = scanner.nextInt();
                scanner.nextLine(); //limpando o teclado

                if(menu == 1){
                    System.out.println("Digite o nome da categoria do personagem:");
                    escolha = scanner.nextLine();


                    System.out.println("--- Buscando personagens  ---");

                    servico.listarPorCategoria(meuBau.buscarTodos(), escolha);
                }

                else if (menu == 2){

                    try {
                        System.out.println("Digite o valor de pontuação que deseja mínimo:");
                        pontuacao = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("--- Buscando Por Pontuações  ---");
                        servico.listarPorPontuacaoMinima(meuBau.buscarTodos(), pontuacao);
                    } catch (InputMismatchException erroDigitacao) {
                        System.out.println("Ops! Você deve digitar apenas números.");
                        scanner.nextLine();
                    }

                } else if (menu == 0) {
                    System.out.println("Saindo do sistema... Até logo!");
                }else{
                    System.out.println("Opção inválida! Tente novamente");
                }
            }catch (InputMismatchException erroDigitacao){
                System.out.println("Ops! Você deve digitar apenas números. Tente novamente");
                scanner.nextLine();
            }



        }


    }


}