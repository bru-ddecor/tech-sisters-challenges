import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá, sister! Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Qual a sua idade?: ");
        int idade = input.nextInt();
        while (idade < 0) {
            System.out.println("Idade inválida!");
            idade = input.nextInt();
        }

        System.out.println("Qual a sua altura?: ");
        double altura = input.nextDouble();

        input.nextLine();

        System.out.println("Nos conte qual é a sua cidade?: ");
        String cidade = input.nextLine();

        System.out.println("PERFIL: \n Nome: " + nome + " | Tipo: " + nome.getClass().getSimpleName() + "\n Idade: " + idade + " | Tipo: int \n Altura: " + altura + " | Tipo double \n Cidade: " + cidade + " | Tipo: " + cidade.getClass().getSimpleName());

        System.out.printf("É um prazer te conhecer, %1$s! Anotado: você tem %2$d anos, mede %3$s m e mora em %4$s. Obrigada por participar desse desafio.", nome, idade, altura, cidade);
    }
}
