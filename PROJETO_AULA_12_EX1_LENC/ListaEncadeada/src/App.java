public class App {

    static Vagao fiscalVagao;
    static Vagao thomasESeusAmigos = null;
    static Vagao caixaoVelaPreta = null;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //// Criar trem ////
        Vagao v1 = new Vagao("Locomotiva");
        Vagao v2 = new Vagao("Restaurante");
        Vagao v3 = new Vagao("Taylor Swift");

        thomasESeusAmigos = v1;
        v1.portaProxVagao = v2;
        v2.portaProxVagao = v3;
        v3.portaProxVagao = caixaoVelaPreta;

        ///// Percorrer trem (Lista) /////
        fiscalVagao = thomasESeusAmigos;
        while ( fiscalVagao != null) {
            System.out.println("Vagao: " + fiscalVagao.nomeVagao);
            fiscalVagao = fiscalVagao.portaProxVagao;
        }
        /////////////////////////////////
        String suspeito = "Gordon";
        boolean naoAchou = true;
        fiscalVagao  = thomasESeusAmigos;
        while (fiscalVagao!=null && naoAchou) {
            if(suspeito == fiscalVagao.nomeVagao){
                naoAchou = false;
            }else{
                fiscalVagao = fiscalVagao.portaProxVagao;
            }            
        }
        if(naoAchou){
            System.out.println("Nao achei o vagao: " + suspeito + " e o fiscal morreu!!!");
        }else{
            System.out.println("O fiscal achou o vagao ");
        }






    }





}
