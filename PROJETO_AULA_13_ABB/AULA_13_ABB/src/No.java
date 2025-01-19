public class No {
    private No esq = null;
    private No dir = null;
    private String valor;

    public No(String v,No e, No d){
        valor = v;
        esq = e;
        dir = d;
    }
    
    public void printNo(){
        System.out.println("No ==> "+valor);
    }
    
    public No getEsq() {
        return esq;
    }
    public No getDir() {
        return dir;
    }
    public boolean existeEsq(){
        if (esq == null){
            return false;
        }else{
            return true;
        }
    }
    public boolean existeDir(){
        if (dir == null){
            return false;
        }else{
            return true;
        }
    }
}
