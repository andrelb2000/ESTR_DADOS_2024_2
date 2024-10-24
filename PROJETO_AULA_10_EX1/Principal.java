/**
 * Principal
 */
public class Principal {
      
      public static void main(String[] args) {
        //Inicio da lista
        Nave inicioComboioNaves = null;
        // Criei minhas naves //
        Nave nave1 = new Nave("DeltaFlyer");
        Nave nave2 = new Nave("Farragut");
        Nave nave3 = new Nave("StarGazer");

        // Inicializar a lista com a primeira
        inicioComboioNaves = nave1;
        nave1.proxima = nave2;
        nave2.proxima = nave3;
        nave3.proxima = null;


        
        Nave percorre = inicioComboioNaves;
        System.out.println("Lista Inicial de Naves");
        while(percorre!=null){
            System.out.println("NAVE: "+percorre.nomeNave);
            percorre = percorre.proxima;
        }         
        System.out.println("---------------");



        Nave novaNave = new Nave("Enterprise");
        percorre = inicioComboioNaves;
        while (percorre.proxima.nomeNave.compareTo(novaNave.nomeNave) < 0) {
            percorre = percorre.proxima;
        }
        // Achou o ponto de inserção
        novaNave.proxima = percorre.proxima;
        percorre.proxima = novaNave; 
        
        System.out.println("Lista Final de Naves");
        percorre = inicioComboioNaves;
        while(percorre!=null){
            System.out.println("NAVE: "+percorre.nomeNave);
            percorre = percorre.proxima;
        } 
    }
}