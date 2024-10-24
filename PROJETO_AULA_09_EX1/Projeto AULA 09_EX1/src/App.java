import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oi Aeroporto!");
        // Criacao da FILA ///
       int [] filaBagagens = new int[100];
       int inicioFila = 0;
       int fimFila = 10;
        ////////////////

        // Fazendo a pilha //
       int [] pilhaBagagens = new int[100];
       int fimPilhaBagagens = 0;
       //////////////////
  
       // Preenchendo a fila ///
       filaBagagens[0] = 12;
       filaBagagens[1] = 45;
       filaBagagens[2] = 23;
       filaBagagens[3] = 100;
       filaBagagens[4] = 34;
       filaBagagens[5] = 122;
       filaBagagens[6] = 1;
       filaBagagens[7] = 5;
       filaBagagens[8] = 2;
       filaBagagens[9] = 38;
       filaBagagens[10] = 27;
       ///////////////////////
    
       while(inicioFila < fimFila){
            /// Mostrar a fila
            for(int i=inicioFila; i <= fimFila; i++){
                System.out.print(filaBagagens[i]+",");
            }
            System.out.println("|");
            /// Mostrar a pilha
            for(int i=0; i < fimPilhaBagagens; i++){
                System.out.print(pilhaBagagens[i]+",");
            }
            System.out.println("|");
            /// Parada a cada ciclo

            String x = scanner.nextLine();



            if( filaBagagens[inicioFila] < filaBagagens[inicioFila+1]    ){
                filaBagagens[fimFila+1] = filaBagagens[inicioFila];

                inicioFila++;
                fimFila++;
            } else {
                if(fimPilhaBagagens > 0){
                    if(pilhaBagagens[fimPilhaBagagens] < filaBagagens[inicioFila] ){
                        filaBagagens[fimFila+1] = pilhaBagagens[fimPilhaBagagens];
                        fimFila++;
                    }
                }
                pilhaBagagens[fimPilhaBagagens] = filaBagagens[inicioFila];
                fimPilhaBagagens++;
                inicioFila++;
         
            }


       }
   
       scanner.close();
    }

}
