package Atividade_Dia_a_Dia08.Aplicativo;

import Atividade_Dia_a_Dia08.Entidades.ClasseEconomica;
import Atividade_Dia_a_Dia08.Entidades.ClasseExecutiva;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do passageiro:");
        String nome = sc.nextLine();

        System.out.println("Digite o número do voo:");
        String numeroVoo = sc.nextLine();

        System.out.println("Digite o preço original da passagem:");
        double preco = sc.nextDouble();

        System.out.println("\nEscolha a classe:");
        System.out.println("1 - Econômica");
        System.out.println("2 - Executiva");
        int opcao = sc.nextInt();

        if (opcao == 1) {

            System.out.println("Deseja despachar mala? (true/false)");
            boolean despacharMala = sc.nextBoolean();

            ClasseEconomica economica =
                    new ClasseEconomica(
                            nome,
                            numeroVoo,
                            preco,
                            despacharMala);

            System.out.println("\n=== BILHETE DE EMBARQUE ===");
            System.out.println(economica);

        } else if (opcao == 2) {

            ClasseExecutiva executiva =
                    new ClasseExecutiva(
                            nome,
                            numeroVoo,
                            preco);

            System.out.println("\n=== BILHETE DE EMBARQUE ===");
            System.out.println(executiva);

        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
