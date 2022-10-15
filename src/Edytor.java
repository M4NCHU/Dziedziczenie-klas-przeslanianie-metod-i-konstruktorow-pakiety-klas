public class Edytor {
    public static void main(String[] args) {
        BuforTekstowyPlus zdanie =  new BuforTekstowyPlus("witam");
        // showing bufor value and bufor length;
        System.out.println(zdanie.buforLength());
        String a = " Dzień dobry";
        System.out.println(zdanie.addToBufor(a));
    }
}