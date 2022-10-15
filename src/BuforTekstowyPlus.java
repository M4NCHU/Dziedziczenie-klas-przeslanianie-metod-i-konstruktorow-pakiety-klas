import packageplus.*;

public class BuforTekstowyPlus extends BuforTekstowy {

    BuforTekstowyPlus(){
        super();
    }

    BuforTekstowyPlus(String a){
        super(a);
    }

    public int buforLength(){
        super.pokazBufor();
        return bufor.length();
    }

    public String addToBufor(String a){
        return super.bufor += a;
    }
}
