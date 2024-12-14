import ozellikler.Kaplan;

public class YunusEylemleri implements HayvanEylemleri {

    @Override
    public void hareketEt() {
        System.out.println("yunus dibe daliyor");
    }

    @Override
    public void yemekYe() {
        System.out.println("balik yiyor");
    }

}
