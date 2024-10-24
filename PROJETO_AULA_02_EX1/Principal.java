import java.util.Scanner;

/**
 * Principal
 */
public class Principal {

   public static void main(String[] args) {
        double[] listaPedagios = new double[5];
        Scanner meuleitor = new Scanner(System.in);
        // Ler os dados //
        for(int i=0 ; i < listaPedagios.length; i++){
            System.out.println("Digite o valor do pedagio "+(i+1));
            listaPedagios[i] = meuleitor.nextDouble();
        }
        for(int i=0 ; i < listaPedagios.length; i++){
            System.out.println("Valor do pedagio "+i+ " = R$ "+
                                listaPedagios[i]);
        }
        
        double total = 0;
        for(int i=0 ; i < listaPedagios.length; i++){
            total += listaPedagios[i];
        }
        System.out.println("O total que a besta gastou essa semana foi: R$ "+total1);



   }



}