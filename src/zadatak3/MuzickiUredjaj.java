
package zadatak3;


public abstract class MuzickiUredjaj {
    boolean ukljucen;
    int jacinaTona = 0;

    public MuzickiUredjaj(boolean ukljucen, int jacinaTona) {
        if (jacinaTona>=0 && jacinaTona<=40  ){
            this.ukljucen = ukljucen;
            this.jacinaTona = jacinaTona;
        }
            
    }
    
    
    
    public void ukljuci(){
        ukljucen = true;
    }
    
    public void iskljuci(){
        ukljucen = false;
    }
    
    public int pojacajTon(){
        if (jacinaTona<40)
            return jacinaTona++;
        return jacinaTona ;
    }
    
    public int smanjiTon(){
        if (jacinaTona>0)
            return jacinaTona--;
        return jacinaTona;
    }
    public abstract void ispisi();
    
    
}


