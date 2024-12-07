public class Main {
    // 2_ kalıtım
    // 3_ polimorfizm-> çok biçimlilik
    public static void main(String[] args) {

        Kaplan k= new Kaplan();
        k.ad="bengal";
        k.hareketEt();
        k.yemekYe();


        Guvercin g= new Guvercin();
        g.ad="taklaci";
        g.hareketEt();


    }
}