import java.util.Scanner;

public class MetaDePassos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Olá! Pronta para conferir sua meta de passos hoje?");
        System.out.println("Quantos passos você realizou?");
        while (!input.hasNextInt()) {
            System.out.println("Ops! o que você digitou não é um número! Tente de novo: ");
            input.next();
        }
        int stepCount = input.nextInt();
        
        int missedSteps = (8000 - stepCount);
        int bonus = (stepCount - 8000);
        
        if (stepCount > 8000) {
            System.out.printf("Parabéns! Você ultrapassou sua meta diária! + %d passos de bônus.", bonus);
        } else if (stepCount == 8000) {
            System.out.println("Parabéns! Você atingiu sua meta diária! Parabéns!");
        } else System.out.printf("Você não atingiu sua meta hoje. Faltaram %d passos.", missedSteps);
    
    }
}