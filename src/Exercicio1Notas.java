import java.util.Scanner;

public class Exercicio1Notas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int n1 = leitor.nextInt();

        System.out.println("Digite a segunda nota:");
        int n2 = leitor.nextInt();

        System.out.println("Digite a terceira nota:");
        int n3 = leitor.nextInt();

        System.out.println("Digite a quarta nota:");
        int n4 = leitor.nextInt();

        int media = (n1+n2+n3+n4)/4;

        if (media >=7) {
            System.out.println("Aluno(a) Aprovado(a)");
        }
        else {
            System.out.println("Aluno(a) Reprovado(a)");
        }
    }
}
