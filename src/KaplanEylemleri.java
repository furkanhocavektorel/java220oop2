import ozellikler.Kaplan;

public class KaplanEylemleri implements HayvanEylemleri{

    Kaplan kaplan;

    public KaplanEylemleri(Kaplan kaplan){
        this.kaplan=kaplan;
    }

    /*
    * git init
    * git add .
    * git commit -m "first"
    * github da bir repo olusturup committen sonra ki adımlar
    * */
    @Override
    public void hareketEt() {
        System.out.println(kaplan.ad+"koşuyor");
    }

    @Override
    public void yemekYe() {
        System.out.println("et yiyor");
    }
}
