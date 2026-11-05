//Uma loja permite parcelar em 5 vezes compras com o valor total menor ou igual a R$ 250,00. Uma pessoa comprou 2 produtos e gostaria de saber se consegue parcelar a sua compra. Peça à pessoa para informar os valores dos produtos e depois informe se será possível parcelar em 5 vezes a compra. Caso seja possível parcelar, informe o valor de cada parcela.

import java.util.Scanner;

public class CompraParcelada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro produto: ");
        double produtoX = valorValido(input);
        
        System.out.println("Digite o valor do segundo produto: ");
        double produtoY = valorValido(input);
        
        double soma = (produtoX + produtoY);
        double valorParcelado = soma / 5;
        
        if(soma <= 250) {
            System.out.printf("Compra aprovada para parcelamento! 5x de R$ %.2f.", valorParcelado);
        } else System.out.printf("O valor total da compra foi de R$ %.2f, excedendo o limite de R$250,00 para parcelamento de 5x.", soma);
        
        
    }
    
    public static double valorValido (Scanner input) {
        while (!input.hasNextDouble()) {
            System.out.println("Valor inválido. Tente novamente: ");
            input.next();
        }
        double valor = input.nextDouble();
        return valor;
    }
    
}