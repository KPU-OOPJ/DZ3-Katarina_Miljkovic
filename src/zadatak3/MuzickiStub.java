
package zadatak3;


public class MuzickiStub extends MuzickiUredjaj implements RadioKomponenta,CDKomponenta {
    double frekvencija = 87.5;
    int brojPesme ;
    boolean ukljucenRadio;
    boolean ukljucenCD;

    public MuzickiStub(boolean ukljucen, int jacinaTona) {
        super(ukljucen, jacinaTona);
    }

   

    
    public void ispisi() {
       
       if(ukljucen){
           System.out.println("Muzicki stub je ukljucen");
           System.out.println("Jacina tona je: "+ jacinaTona);
           if (ukljucenRadio)
               System.out.println("Frekvencija radio stanice je: "+ frekvencija);
           if (ukljucenCD)
               System.out.println("Broj pesme koja se trenutno pusta je:" + brojPesme);
       }
       else System.out.println("Muzicki stub je iskljucen.");
    }

    
    public void promeniStranicu(double frekvencija) {
       ukljucenRadio = true;
       ukljucenCD = false;
       if (frekvencija>=87.5 && frekvencija<=108.0)
           this.frekvencija = frekvencija;
       else this.frekvencija = 87.5;
    }

    
    public void pustiPesmu(int brojPesme) {
       ukljucenCD = true;
       ukljucenRadio = false;
      if (brojPesme>=1 && brojPesme<=21)
          this.brojPesme = brojPesme;
      else this.brojPesme = 1;
    }
}
