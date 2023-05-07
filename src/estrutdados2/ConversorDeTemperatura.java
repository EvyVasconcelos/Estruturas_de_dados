package estrutdados2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        double c,f;  //variavel//
        Scanner tecl = new Scanner(System.in);  //objetos//
        DecimalFormat formatador = new DecimalFormat("#0.0");
        //entrada//
        System.out.println("Conversão de Temperatura");
        System.out.println("Digite a temperatura em Fahrenheit: ");
        f = tecl.nextDouble();
        c = (5 * (f - 32)) / 9; //conversão//
        System.out.println("Temperatura em Celsius: " + formatador.format(c) + "°C"); //finalização//

    }
}
