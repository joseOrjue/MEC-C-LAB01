import java.util.Scanner;

public class Lab_01 {
   private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      System.out.println("Bienvenido a la calculadora");
      System.out.println("Seleccione la operación que desea realizar:");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicación");
      System.out.println("4. División");
      System.out.println("5. Seno");
      System.out.println("6. Coseno");
      System.out.println("7. Tangente");
      System.out.println("8. Potencia");
      System.out.println("9. Iva");

      int choice = scanner.nextInt();
      switch (choice) {
         case 1 -> suma();
         case 2 -> resta();
         case 3 -> multiplicacion();
         case 4 -> divicion();
         case 5 -> sin();
         case 6 -> cos();
         case 7 -> tan();
         case 8 -> power();
         case 9 -> iva();
         default -> System.out.println("Opción no válida");
      }
   }

   private static void suma() {
      System.out.println("Ingrese dos números para realizar la adición:");
      double num1 = scanner.nextDouble();
      double num2 = scanner.nextDouble();
      System.out.println("Resultado: " + (num1 + num2));
   }

   private static void resta() {
      System.out.println("Ingrese dos números para realizar la substracción:");
      double num1 = scanner.nextDouble();
      double num2 = scanner.nextDouble();
      System.out.println("Resultado: " + (num1 - num2));
   }

   private static void  multiplicacion() {
      System.out.println("Ingrese dos números para realizar la multiplicación:");
      double num1 = scanner.nextDouble();
      double num2 = scanner.nextDouble();
      System.out.println("Resultado: " + (num1 * num2));
   }

   private static void  divicion() {
      System.out.println("Ingrese dos números para realizar la división:");
      double num1 = scanner.nextDouble();
      double num2 = scanner.nextDouble();
      System.out.println("Resultado: " + (num1 / num2));
   }

   private static void sin() {
      System.out.println("Ingrese un número en radianes para calcular el seno:");
      double num = scanner.nextDouble();
      System.out.println("Resultado: " + Math.sin(num));
   }

   private static void cos() {
      System.out.println("Ingrese un número en radianes para calcular el coseno:");
      double num = scanner.nextDouble();
      System.out.println("Resultado: " + Math.cos(num));
   }

   private static void tan() {
      System.out.println("Ingrese un número en radianes para calcular la tangente:");
      double num = scanner.nextDouble();
      System.out.println("Resultado: " + Math.tan(num));
   }

   private static void power() {
      System.out.println("Ingrese dos números para calcular la potencia:");
      double num1 = scanner.nextDouble();
      double num2 = scanner.nextDouble();
      System.out.println("Resultado: " + Math.pow(num1, num2));
   }

   private static void iva() {
      System.out.println("Ingrese el valor al que desea incluirle el iva y posteriormente el valor de ese iva:");
      double valor = scanner.nextDouble();
      double iv = scanner.nextDouble();
      
      System.out.println("Valor a pagar: " +valor*iv/100);
   }
}