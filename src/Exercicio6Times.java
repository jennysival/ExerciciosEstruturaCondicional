import java.util.Scanner;

public class Exercicio6Times {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro Time: ");
        String time1 = leitor.nextLine();

        System.out.println("Digite o segundo Time: ");
        String time2 = leitor.nextLine();

        System.out.println("Quantos gols o "+time1+" fez?");
        int golsTime1 = leitor.nextInt();

        System.out.println("Quantos gols o "+time2+" fez?");
        int golsTime2 = leitor.nextInt();

        if (golsTime1 > golsTime2){
            System.out.println(time1+" é o vencedor!");
        }
        else if (golsTime1 < golsTime2){
            System.out.println(time2+" é o vencedor!");
        }
        else{
            System.out.println("Houve um empate entre "+time1+" e "+time2+"!");
        }
    }
}
