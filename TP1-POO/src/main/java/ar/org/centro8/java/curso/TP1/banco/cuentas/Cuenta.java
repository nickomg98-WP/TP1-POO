package ar.org.centro8.java.curso.TP1.banco.cuentas;

import ar.org.centro8.java.curso.TP1.banco.clientes.Cliente;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public abstract class Cuenta {
    private String numeroCuenta;

    @Setter(AccessLevel.PROTECTED)
    private double saldo;

    private Cliente cliente;

    public void depositarEfectivo(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    public abstract void extraerEfectivo(double monto);
}
