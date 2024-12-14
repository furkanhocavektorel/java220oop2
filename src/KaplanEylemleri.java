public class KaplanEylemleri implements HayvanEylemleri{


    @Override
    public void hareketEt() {
        System.out.println("et yiyor");
    }

    @Override
    public void yemekYe() {
        System.out.println("koşuyor");
    }
}
