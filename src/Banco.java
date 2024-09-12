import java.text.DecimalFormat;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        String nombre = "Keanu Revees";
        String tipoCuenta = "Corriente";
        double saldo = 33000000.90;
        int opcion=0;

        DecimalFormat df = new DecimalFormat("'$'#,###.00");

        System.out.println("**********************************");
        System.out.println("\nEl nombre de cliente es: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo Actual: " + df.format(saldo));
        System.out.println("\n**********************************");

        String menu = """
                Escribe el numero de la opcion deseada:
                1)Consultar saldo actual
                2)Retirar
                3)Depositar
                4)salir
                """;


        Scanner teclado = new Scanner(System.in);

        while (opcion != 4){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Saldo actual de tu cuenta: " + df.format(saldo));
                    break;

                case 2:
                    System.out.println("cuanto dinero quieres retirar de tu cuenta?");
                    double retiro = teclado.nextDouble();
                    if (saldo < retiro) {
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo= saldo-retiro;
                        System.out.println("Saldo actualizado de tu cuenta : " + df.format(saldo));
                    }
                    break;

                case 3:
                    System.out.println("Cuanto dinero quieres depositar en tu cuenta?");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo actualizado de tu cuenta : " + df.format(saldo));
                    break;

                case 4:
                    System.out.println("___________________________________");
                    System.out.println("Gracias por usar nuestros servicios");
                    System.out.println("-------------------------------------");
                break;

                default:
                    System.out.println("Esta opcion no es valida, intentalo de nuevo");

            }
        }
    }
}
