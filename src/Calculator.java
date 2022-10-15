public class Calculator {
    public static int result;

    public static void main(String[] args) {
        Count c1 = new Count();

        

        switch (c1.operator){
            case "+":
                result = c1.sum();
                break;
            case "-":
                result = c1.sub();
                break;
            case "*":
                result = c1.mult();
                break;
            case "/":
                result = c1.div();
                break;
            default:
                break;
        }
        System.out.println(result);

    }
}
