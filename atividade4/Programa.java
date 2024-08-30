import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PessoaFisica pf = new PessoaFisica("Carlos Freitas de Andrade", "089.675.431.98, "10-06-1995");

        pf.impressao();

        sc.close();

        
    }
    
}
