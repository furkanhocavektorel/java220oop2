import ozellikler.Guvercin;

public class Main {
    // 1_ kapsülleme
    // 2_ kalıtım
    // 3_ polimorfizm-> çok biçimlilik
    public static void main(String[] args) {

        KaplanEylemleri kaplanEylemleri= new KaplanEylemleri();
        kaplanEylemleri.hareketEt();
        kaplanEylemleri.yemekYe();
        kaplanEylemleri.hareketEt();

        YunusEylemleri yunusEylemleri= new YunusEylemleri();
        yunusEylemleri.yemekYe();


    }

}