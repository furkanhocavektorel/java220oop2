import ozellikler.Kaplan;

public class KaplanEylemleri implements HayvanEylemleri{

    Kaplan kaplan;

    public KaplanEylemleri(Kaplan kaplan){
        this.kaplan=kaplan;
    }

    @Override
    public void hareketEt() {
        System.out.println(kaplan.ad+"koşuyor");
    }

    @Override
    public void yemekYe() {
        System.out.println("et yiyor");
    }
}
