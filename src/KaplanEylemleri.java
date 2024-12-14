public class KaplanEylemleri implements HayvanEylemleri{


    @Override
    public void hareketEt() {
        System.out.println("koşuyor");
    }

    @Override
    public void yemekYe() {
        System.out.println("et yiyor");
    }
}
