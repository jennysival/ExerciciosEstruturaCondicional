import java.util.Scanner;

public class Exercicio4AreaRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a dimensão da base do retângulo:");
        double base = leitor.nextDouble();

        System.out.println("Digite a dimensão da altura do retângulo:");
        double altura = leitor.nextDouble();

        double area = base*altura;
        System.out.println("A área do retângulo é: "+area);
    }
}
