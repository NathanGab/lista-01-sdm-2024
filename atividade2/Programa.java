package Exercicio2;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Atleta atleta = new Atleta();

        System.out.print(" Diga o nome do atleta: ");
        String nome = sc.nextLine();
        atleta.setNome(nome);

        System.out.print("Diga o país de origem: ");
        String pais = sc.nextLine();
        atleta.setPais(pais);

        System.out.print("Diga a quantidade de medalhas: ");
        int qtdeMedalhas = sc.nextInt();
        atleta.setQtdeMedalhas(qtdeMedalhas);
        
        atleta.impressao();

        sc.close();
   
    }
}
