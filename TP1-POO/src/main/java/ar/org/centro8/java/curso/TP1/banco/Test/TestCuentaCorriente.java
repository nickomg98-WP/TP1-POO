package ar.org.centro8.java.curso.TP1.banco.Test;

import java.time.LocalDate;

import ar.org.centro8.java.curso.TP1.banco.cheque.Cheque;
import ar.org.centro8.java.curso.TP1.banco.clientes.ClienteIndividual;
import ar.org.centro8.java.curso.TP1.banco.cuentas.CuentaCorriente;

public class TestCuentaCorriente {
    public static void main(String[] args) {
        ClienteIndividual cliente = new ClienteIndividual("1", "Rodrigo", "Paredes", "12345678");
        CuentaCorriente cuenta = new CuentaCorriente("002312", 100, cliente, 500);

        System.out.println("Saldo inicial de la cuenta es:" + cuenta.getSaldo());
        System.out.println(
                "============================================================================================");

        cuenta.depositarEfectivo(400);
        System.out.println("Saldo despuest de depositar 400: " + cuenta.getSaldo());
        System.out.println(
                "============================================================================================");

        cuenta.extraerEfectivo(500);
        System.out.println("Saldo luego de extraer 500: " + cuenta.getSaldo());
        System.out.println(
                "============================================================================================");

        cuenta.extraerEfectivo(500);
        System.out.println("Saldo luego de extraer 500 deberia dar -500: " + cuenta.getSaldo());
        System.out.println(
                "============================================================================================");

        cuenta.extraerEfectivo(1);
        System.out.println(cuenta.getSaldo());
        System.out.println(
                "============================================================================================");

        Cheque cheque = new Cheque(1000, "Winchester", LocalDate.of(2027, 2, 18));

        cuenta.depositarCheque(cheque);
        System.out.println(cuenta.getSaldo());
    }

}
