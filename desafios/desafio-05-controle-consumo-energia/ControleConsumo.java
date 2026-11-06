import java.util.Scanner;

public class ControleConsumo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Estipule um limite de consumo diário: ");
        double limite = limiteValido(input);
        
        System.out.println("Digite a quantidade de dias a serem analisados: ");
        int qdias = diaValido(input);
        
        double[] consumos = new double[qdias];
        
        for(int i = 0; i < qdias; i++) {
            System.out.println("Qual foi o consumo em kWh do dia " + (i + 1) + "?");
            consumos[i] = consumoValido(input);
        }
        
        double soma = 0;
        for (int i = 0; i < consumos.length; i++) {
        soma += consumos[i];
        }
        
        double media = calcularMedia(soma, qdias);
        
        if(media <= limite) {
            System.out.printf("Consumo total: %1$.2f kWh | Média diária: %2$.2f kWh \nParabéns: consumo médio diário DENTRO do limite.", soma, media);
        } else System.out.printf("Consumo total durante %1$d dias: %2$.2f kWh | Média diária: %3$.2f kWh \nO consumo médio diário ficou ACIMA do limite estipulado (%4$.2f kWh).", qdias, soma, media, limite);

    }
    
    public static int diaValido (Scanner input) {
        int dias;
        do {
            while (!input.hasNextInt()) {
                System.out.println("Valor inválido. Tente novamente: ");
                input.next();
            }
            dias = input.nextInt();
            
            if(dias <= 0) {
                System.out.println("Entrada inválida! Informe dias maiores que 0 e consumos não negativos.\nTente novamente: ");
            }
        } while (dias <= 0);
        
        return dias;
    }
    
    public static double limiteValido (Scanner input) {
        double limiteValido;
        do {
            while (!input.hasNextDouble()) {
                System.out.println("Valor inválido. Tente novamente: ");
                input.nextLine();
            }
            limiteValido = input.nextDouble();
            
            if(limiteValido <= 0) {
                System.out.println("Entrada inválida! Informe um limite de consumo maior que 0.\nTente novamente: ");
            }
        } while (limiteValido <= 0);
        
        return limiteValido;
  
    }
    
    public static double consumoValido (Scanner input) {
        double consumo;
        do {
        while (!input.hasNextDouble()) {
            System.out.println("Digite um número válido:");
            input.next();
        }

        consumo = input.nextDouble();

        if (consumo < 0) {
            System.out.println("O consumo não pode ser negativo. Tente novamente:");
         }

        } while (consumo < 0);
        
        return consumo;
    }
    
    public static double calcularMedia(double soma, int dias) {
    return soma / dias;
    }
    
}