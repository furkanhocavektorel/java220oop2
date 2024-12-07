public class Guvercin extends Hayvan {

    public int kanatAcikligi;
    public int yukseklik;

    //Override
    public void hareketEt(){
        System.out.println(ad+" adına sahip hayvan ucuyor");
        super.hareketEt();
    }

}
