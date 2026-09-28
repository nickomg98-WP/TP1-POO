package ar.org.centro8.java.curso.TP1.banco.Test;

import java.nio.channels.Pipe.SourceChannel;
import java.time.LocalDate;

import ar.org.centro8.java.curso.TP1.banco.cheque.Cheque;
import ar.org.centro8.java.curso.TP1.banco.clientes.ClienteEmpresa;
import ar.org.centro8.java.curso.TP1.banco.cuentas.CuentaConvertibilidad;

public class TestCuentaConvertibilidad {
    public static void main(String[] args) {
        ClienteEmpresa empresa1 = new ClienteEmpresa("012301", "Rusnik", "20983454320");
        CuentaConvertibilidad cuenta1 = new CuentaConvertibilidad("2134", 10000, empresa1, 500, 100);

        cuenta1.convertirPesosADolares(2000, 1500);
        System.out.println("Saldo de pesos: " + cuenta1.getSaldo());
        System.out.println("Saldo de dolares: " + cuenta1.getSaldoDolares());
        System.out.println("============================================================================================");

        cuenta1.convertirDolaresAPesos(100, 1500 );
        System.out.println("Saldo de pesos: " + cuenta1.getSaldo());
        System.out.println("Saldo de dolares: " + cuenta1.getSaldoDolares());
         System.out.println("============================================================================================");

        cuenta1.depositarDolares(105);
        System.out.println("Saldo de dolares: " + cuenta1.getSaldoDolares());
         System.out.println("============================================================================================");

        cuenta1.extraerDolares(500);
        System.out.println("Saldo de dolares: " + cuenta1.getSaldoDolares());
         System.out.println("============================================================================================");

        cuenta1.depositarEfectivo(5000);
        System.out.println ("saldo en pesos: " + cuenta1.getSaldo());
         System.out.println("============================================================================================");

        Cheque cheque = new Cheque(2000, "Winchester", LocalDate.of(2026, 10, 23));
        cuenta1.depositarCheque(cheque);
    System.out.println(cuenta1.getSaldo());



    }

}
