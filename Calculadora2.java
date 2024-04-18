public class Calculadora2 {

  public static void main(String args[]) {

       Double numero1 = Double.parseDouble(args[0]);
       String operacao = args[1];
       Double numero2 = Double.parseDouble(args[2]);

       switch (operacao) {
	  case "+":
             	System.out.println(numero1 + numero2);
          break;
          
          case "-":
             	System.out.println(numero1 - numero2);
          break;
         
          case "/":
             	System.out.println(numero1 / numero2);
          break;

          case "x":
             	System.out.println(numero1 * numero2);
          break;
          default:
              System.out.println("Operação inválida");
       }


   }

}