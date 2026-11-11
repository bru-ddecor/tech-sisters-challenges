import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma senha para validar: ");
        String senha = input.nextLine();

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);

            if (caractere >= 'A' && caractere <= 'Z') {
                temMaiuscula = true;
            }

            if (caractere >= 'a' && caractere <= 'z') {
                temMinuscula = true;
            }

            if (caractere >= '0' && caractere <= '9') {
                temNumero = true;
            }

            if (!Character.isLetterOrDigit(caractere)
                    && !Character.isWhitespace(caractere)) {
                temEspecial = true;
            }
        }

        if (senha.length() >= 8 && temMaiuscula &&
                temMinuscula && temNumero && temEspecial) {

            System.out.println("VALIDA -> A senha atende a todos os requisitos de seguranca!");

        } else {
            System.out.println("INVALIDA -> Motivos:");

            if (senha.length() < 8) {
                System.out.println("- A senha deve conter no minimo 8 caracteres.");
            }

            if (!temMaiuscula) {
                System.out.println("- Nao contem letra maiuscula.");
            }

            if (!temMinuscula) {
                System.out.println("- Nao contem letra minuscula.");
            }

            if (!temNumero) {
                System.out.println("- Nao contem numero.");
            }

            if (!temEspecial) {
                System.out.println("- Nao contem caractere especial.");
            }
        }

        input.close();
    }
}
