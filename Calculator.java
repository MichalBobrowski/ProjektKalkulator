public class Calculator {
    public double sum (double a, double b){
        return a + b;
    }

    public double substraction (double a, double b){
        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator1 = new Calculator();

         System.out.println(calculcator1.sum(1.0 , 2.2));
        System.out.println(calculcator1.substracion(10.0 , 2.2));

    }

}
