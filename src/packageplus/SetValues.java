package packageplus;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SetValues {
    protected int v1, v2;
    Scanner scan = new Scanner(System.in);
    Scanner scan2;

    protected String operator;

    public SetValues(){
        this.v1 = 0;
        this.v2 = 0;
        this.operator = "";
    }

    public int setX(){
        System.out.println("Wprowadz liczbę 1: ");
        return v1 = scan.nextInt();
    }

    public int setY(){
        System.out.println("Wprowadz liczbę 1: ");
        return v2 = scan.nextInt();
    }

    public String setOperator(){

        scan2 = new Scanner(System.in);
        try {
            System.out.println("Wprowadz operator (+, -, *, /): ");
            operator = scan2.nextLine();
        }catch(NullPointerException e) {
            System.out.println(e);
        }
        return operator;
    }


}
