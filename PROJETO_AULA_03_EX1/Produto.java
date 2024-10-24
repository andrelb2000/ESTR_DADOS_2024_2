public class Produto {
    public static int somatorioPares(int param){
            if(param==     )
                return ();
            else{
                int p = ...
                int soma =      + somatorioPares(p);
                return(soma);
            }
    }
    public static int somatorio(int param){
        if(param == 1){
            return (1);
        }else{
            int p = param -1;
            int soma = param * somatorio(p);
            return(soma);
        }
    }
    public static void main(String[] args) {
        int numero = 10;
        int soma = somatorio(numero);
        System.out.println("A soma de todos os numeros de "+
                          numero + " até 1 é "+soma);
    }    
}
