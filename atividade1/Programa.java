package Exercicio1;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Universidade universidade = new Universidade();

        System.out.print("\n Escreva o nome da universidade: ");
        String nome = sc.nextLine();
        universidade.setNome(nome);


        System.out.print(" Escreva o endereço: ");
        String endereco = sc.nextLine();
        universidade.setEndereço(endereco);
        

        System.out.print(" Escreva o CNPJ: ");
        String cnpj = sc.nextLine();
        universidade.setCNPJ(cnpj);

        System.out.print(" Escreva a quantidade de salas: ");
        int qtde_salas = sc.nextInt();
        universidade.setQtde_salas(qtde_salas);

        universidade.impressao();

        sc.close();

    }
}
