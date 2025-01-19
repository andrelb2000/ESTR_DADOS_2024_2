public class App {

    public static void percorreNo(No no){
     
        if(no.existeEsq()){
            percorreNo(no.getEsq());
        }

        no.printNo();
        if(no.existeDir()){
            percorreNo(no.getDir());
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        No n1 = new No("A",null,null);
        No n2 = new No("B",n1,null);
        No n3 = new No("D",null,null);
        No n4 = new No("C", n2, n3);
        percorreNo(n4);
    }
}
