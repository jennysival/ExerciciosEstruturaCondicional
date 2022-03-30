import java.util.Scanner;

public class Exercicio2Imc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu peso em kg (ex: 70,5)");
        double peso = leitor.nextDouble();

        System.out.println("Digite sua altura em metros (ex: 1,70)");
        double altura = leitor.nextDouble();

        double imc = peso/(altura*altura);

        if (imc < 18.5){
            System.out.println("Você está abaixo do seu peso ideal: Magreza");
        }

        else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Você está em seu peso ideal: Normal");
        }

        else if (imc >= 25 && imc <= 29.9){
            System.out.println("Você está acima do seu peso ideal: Sobrepeso");
        }

        else if (imc >= 30 && imc <= 39.9){
            System.out.println("Você está acima do seu peso ideal: Obesidade");
        }

        else {
            System.out.println("Você está acima do seu peso ideal: Obesidade Grave");
        }
    }
}
