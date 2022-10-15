package packageplus;

public class BuforTekstowy {
    protected String bufor;

    public BuforTekstowy(){
        this.bufor = "bufor pusty";
    }
    public BuforTekstowy(String bu){
        this.bufor = bu;
    }


    public void przypisz(String a){
        this.bufor = a;
    }

    // method prints value of bufor variable
    public void pokazBufor(){
        System.out.println(bufor);
    }
}
