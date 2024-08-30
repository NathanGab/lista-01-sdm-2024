package Exercicio1;
import java.util.Scanner;

public class Universidade {
    private String nome, endereço, CNPJ;
    private int qtde_salas;
    private Scanner sc = new Scanner(System.in);

    public int getQtde_salas() {
        return qtde_salas;
    }

    public void setQtde_salas(int qtde_salas) {
        this.qtde_salas = qtde_salas;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        do {
            System.out.println("Este CNPJ não é valido");
            System.out.print("Informe o CNPJ: ");
            cNPJ = sc.nextLine();
        } while (cNPJ.length() != 14);

        CNPJ = cNPJ;

    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void impressao() {
        System.out.printf(
                "\n\n - Nome: %s \n - Endereço: %s \n - CNPJ: %s \n - Quantidade de Salas: %d",
                nome, endereço, CNPJ, qtde_salas);
    }
}
