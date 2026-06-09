package Atividade_Dia_a_Dia07.aplicativo;

import Atividade_Dia_a_Dia07.entidades.ContaStreaming;
import Atividade_Dia_a_Dia07.entidades.PlanoPadrao;
import Atividade_Dia_a_Dia07.entidades.PlanoPremium;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ContaStreaming contaStreaming = new ContaStreaming(nome);
        System.out.println("Digite seu nome de usuario");
        String nome = (sc.nextLine());
        System.out.println("Digite o seu email");
        String email= (sc.nextLine());
        System.out.println("Qual plano deseja assinar? Padrão/Premium");
        String tipoPlano=(sc.nextLine());
        ContaStreaming contaStreaming = new ContaStreaming(nome, email, tipoPlano);

        PlanoPremium planoPremium = new PlanoPremium(nome, email, tipoPlano);

        PlanoPadrao planoPadrao = new PlanoPadrao(nome, email, tipoPlano);


        if (tipoPlano.equalsIgnoreCase("Padrão")) {
            System.out.println(planoPadrao.Recibo());
        }
        else if (tipoPlano.equalsIgnoreCase("Premium")) {
            System.out.println(planoPremium.Recibo());
        }
        else {
            System.out.println("Plano inválido.");
        }

    }
}

