package ar.org.centro8.java.curso.TP1.banco.cuentas;

import ar.org.centro8.java.curso.TP1.banco.cheque.Cheque;
import ar.org.centro8.java.curso.TP1.banco.clientes.Cliente;

public class CuentaCorriente extends Cuenta {
    private double limiteDescubierto;

    public CuentaCorriente(String numeroCuenta, double saldo, Cliente cliente, double limiteDescubierto) {
        super(numeroCuenta, saldo, cliente);
        this.limiteDescubierto = limiteDescubierto;

    }

    @Override
    public void extraerEfectivo(double monto) {
        if (monto > 0 && monto <= getSaldo() + limiteDescubierto) {
            setSaldo(getSaldo() - monto);

        }
    }

    public void depositarCheque(Cheque cheque) {
        if (cheque != null) {
            depositarEfectivo(cheque.getMonto());

        }
    }

}
