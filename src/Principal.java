import Models.Currency;
import Models.Exchange;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //REFERENCIA AL CONVERTIDOR
        Exchange exchange = new Exchange();

        //PERSISTENCIA
        while (true) {
            //MENU
            System.out.println("************************************\n" +
                    "Bienvenido al Convertidor de Moneda\n" +
                    "     Hecho por Celeste Amador\n" +
                    "************************************\n" +
                    "1) USD a MXN\n" +
                    "2) MXN a USD\n" +
                    "3) USD a EUR\n" +
                    "4) EUR a USD\n" +
                    "5) USD a CAD\n" +
                    "6) CAD a USD\n" +
                    "7) Salir");


            //OPCION A ELEGIR
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriba la opcion de moneda a convertir: ");
            int option = 0;
            option = scanner.nextInt();
            if (option == 7) {
                System.out.println("Gracias por utilizar el convertidor.\n" +
                        "La aplicacion ha finalizado");
                break;
            }

            //LLAMANDO CURRENCY
            String currencyOption = new String();
            double currencyAmount;

            //ACTIVACION DE OPCIONES
            switch (option) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(scanner.nextLine());
                    Currency currency1 = exchange.locateCurrency("USD/MXN/", currencyAmount);
                    System.out.println("La conversion de " + currencyAmount + " USD a MXN es " + currency1.conversion_result());
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(scanner.nextLine());
                    Currency currency2 = exchange.locateCurrency("MXN/USD/", currencyAmount);
                    System.out.println("La conversion de " + currencyAmount + " MXN a USD es " + currency2.conversion_result());
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(scanner.nextLine());
                    Currency currency3 = exchange.locateCurrency("USD/EUR/", currencyAmount);
                    System.out.println("La conversion de " + currencyAmount + " USD a EUR es " + currency3.conversion_result());
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(scanner.nextLine());
                    Currency currency4 = exchange.locateCurrency("EUR/USD/", currencyAmount);
                    System.out.println("La conversion de " + currencyAmount + " EUR a USD es " + currency4.conversion_result());
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(scanner.nextLine());
                    Currency currency5 = exchange.locateCurrency("USD/CAD/", currencyAmount);
                    System.out.println("La conversion de " + currencyAmount + " USD a CAD es " + currency5.conversion_result());
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = Double.parseDouble(scanner.nextLine());
                    Currency currency6 = exchange.locateCurrency("CAD/USD/", currencyAmount);
                    System.out.println("La conversion de " + currencyAmount + " CAD a USD es" + currency6.conversion_result());
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
                    break;
            }
        }
    }
}
