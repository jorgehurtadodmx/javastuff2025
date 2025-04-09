public class CalculadoraBasica {
    public static void main(String[] args) {

        //numeros 10 y 5
        System.out.println("hola");


        //output 10 + 5 = 15, para todas las operaciones + - * /  %

        int a = 10;
        int b = 5;

        int suma = a + b;
        System.out.println(a + " + " + b + " = " + suma);

        int resta = a - b;
        System.out.println(a + " - " + b + " = " + resta);

        int multiplicacion = a * b;
        System.out.println(a + " * " + b + " = " + multiplicacion);

       // boolean esDivisible = true;
        int division = a / b;
        System.out.println(a + " / " + b + " = " + division);
       // if (a / b == 0) {
       //   esDivisible == true;
       // }
       // if (a % b == 0) {
      //      esDivisible = true;
     //   }

        boolean esDivisible = (a % b) == 0;
       // System.out.println(esDivisible);

        if (esDivisible) {
            System.out.println("es divisible sisi, resultado (resto): " + division);
        }

        int modulo = a % b;
        System.out.println(a + " & " + b + " = " + modulo);

        System.out.println("Incrementando a: " + ++a);
        System.out.println("Decrementando b: " + --b);


    }


}
