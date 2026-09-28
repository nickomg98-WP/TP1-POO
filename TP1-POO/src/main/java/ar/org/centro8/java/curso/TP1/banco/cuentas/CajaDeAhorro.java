package ar.org.centro8.java.curso.TP1.banco.cuentas;

import ar.org.centro8.java.curso.TP1.banco.clientes.Cliente;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)

public class CajaDeAhorro extends Cuenta {
    private double tasaInteres;

    public CajaDeAhorro(String numeroCuenta, double saldo, Cliente cliente, double tasaInteres) {
        super(numeroCuenta, saldo, cliente);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraerEfectivo(double monto) {
        if (monto > 0 && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
        }
    }

    public void cobrarInteres() {
        double interes = getSaldo() * tasaInteres / 100;
        depositarEfectivo(interes);
    }
}