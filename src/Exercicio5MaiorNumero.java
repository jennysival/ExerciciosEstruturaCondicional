import java.util.Scanner;

public class Exercicio5MaiorNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        double n1 = leitor.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = leitor.nextDouble();

        if (n1 > n2){
            System.out.println("O maior número digitado foi: "+n1);
        }
        else{
            System.out.println("O maior número digitado foi: "+n2);
        }
    }
}
