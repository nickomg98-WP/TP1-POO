package ar.org.centro8.java.curso.TP1.banco.Test;

import ar.org.centro8.java.curso.TP1.banco.clientes.ClienteIndividual;
import ar.org.centro8.java.curso.TP1.banco.cuentas.CajaDeAhorro;


public class TestCuentaCajaAhorro {
    public static void main(String[] args) {
        ClienteIndividual cliente = new ClienteIndividual("1", "Rogelio", "Sanguinetti", "12345678");
        CajaDeAhorro cuentaCajaAhorro1 = new CajaDeAhorro("1", 5000, cliente, 10); 

        System.out.println("Datos de la cuenta" + cuentaCajaAhorro1);
         System.out.println("============================================================================================");

        cuentaCajaAhorro1.depositarEfectivo(500);
        System.out.println("Saldo de la caja de ahorro 1: " + cuentaCajaAhorro1.getSaldo());
         System.out.println("============================================================================================");

        cuentaCajaAhorro1.depositarEfectivo(-500); //No deberia ocurrir, no se pueden depositar montos negativos
        System.out.println("Saldo de la caja de ahorro 1: " + cuentaCajaAhorro1.getSaldo());
         System.out.println("============================================================================================");

        cuentaCajaAhorro1.extraerEfectivo(1000);
        System.out.println("Saldo de la caja de ahorro 1: " + cuentaCajaAhorro1.getSaldo());
         System.out.println("============================================================================================");

        cuentaCajaAhorro1.extraerEfectivo(100500); // no deberia ocurrir la extraccion supera el saldo
        System.out.println("Saldo de la caja de ahorro 1: " + cuentaCajaAhorro1.getSaldo());
         System.out.println("============================================================================================");

        cuentaCajaAhorro1.extraerEfectivo(-1000); // No deberia ocurrir, tampoco pueden extraerse montos negativos
        System.out.println("Saldo de la caja de ahorro 1: " + cuentaCajaAhorro1.getSaldo());
         System.out.println("============================================================================================");

        cuentaCajaAhorro1.cobrarInteres();
        System.out.println("Interes del 10% y deberia dar 4950");
        System.out.println(cuentaCajaAhorro1.getSaldo());

        










    }

}
