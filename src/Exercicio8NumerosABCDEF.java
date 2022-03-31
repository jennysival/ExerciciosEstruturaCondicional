import java.util.Scanner;

public class Exercicio8NumerosABCDEF {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int nA = leitor.nextInt();

        System.out.println("Digite o segundo número:");
        int nB = leitor.nextInt();

        System.out.println("Digite o terceiro número:");
        int nC = leitor.nextInt();

        System.out.println("Digite o quarto número:");
        int nD = leitor.nextInt();

        System.out.println("Digite o quinto número:");
        int nE = leitor.nextInt();

        System.out.println("Digite o sexto número:");
        int nF = leitor.nextInt();

        if (nA == nB){
            System.out.println("Correto: O primeiro e segundo números são iguais");
        }else{
            System.out.println("Errado: O primeiro e segundo números são diferentes");
        }


        if (nC != nD){
            System.out.println("Correto: O terceiro e quarto números são diferentes");
        }else{
            System.out.println("Errado: O terceiro e quarto números são iguais");
        }


        if (nE > nF){
            System.out.println("Correto: O quinto número é maior que o sexto número");
        }else{
            System.out.println("Errado: O quinto número é menor que o sexto número");
        }
    }
}
