import ozellikler.Guvercin;
import ozellikler.Kaplan;

public class Main {
    // 1_ kapsülleme
    // 2_ kalıtım
    // 3_ polimorfizm-> çok biçimlilik
    public static void main(String[] args) {


        Kaplan kaplan= new Kaplan();
        kaplan.ad="diego2";
        KaplanEylemleri k= new KaplanEylemleri(kaplan);
        test(k);

    }

    public static void test(HayvanEylemleri he){
        he.hareketEt();
    }

}