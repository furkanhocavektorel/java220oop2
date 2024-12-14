import ozellikler.Guvercin;

public class Main {
    // 1_ kapsülleme
    // 2_ kalıtım
    // 3_ polimorfizm-> çok biçimlilik
    public static void main(String[] args) {

        YunusEylemleri y=new YunusEylemleri();
       KaplanEylemleri k= new KaplanEylemleri();

        test(y);

    }

    public static void test(HayvanEylemleri he){
        he.hareketEt();
    }

}