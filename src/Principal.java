import Models.Currency;
import Models.Exchange;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //REFERENCIA AL CONVERTIDOR
        Exchange exchange = new Exchange();
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
        //LLAMANDO CURRENCY
      try{
        String currencyOption = new String();
        double currencyAmount = 0;
        Currency currency = exchange.locateCurrency(currencyOption, currencyAmount);
        System.out.println(currency);
      } catch (RuntimeException e){
          System.out.println(e.getMessage());
          System.out.println("Finalizando la aplicacion.");
      }
                //SI LA RESPUESTA NO COINCIDE CON EL MENU
                switch (option) {
                    case 1:
                        String currencyOption = "/USD/MXN/";
                        Scanner currencyScanner = new Scanner(System.in);
                        System.out.println("Escriba la cantidad a a convertir: ");
                        Double currencyAmount = Double.valueOf(currencyScanner.nextLine());
                        break;
                    case 2:
                        break;


            }
        }
    }
