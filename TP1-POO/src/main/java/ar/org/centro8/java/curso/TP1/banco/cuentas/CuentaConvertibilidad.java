package ar.org.centro8.java.curso.TP1.banco.cuentas;

import ar.org.centro8.java.curso.TP1.banco.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)

public class CuentaConvertibilidad extends CuentaCorriente {

    private double saldoDolares;

    public CuentaConvertibilidad(String numeroCuenta, double saldo, ClienteEmpresa cliente,
            double limiteDescubierto, double saldoDolares) {
        super(numeroCuenta, saldo, cliente, limiteDescubierto);

        if (saldoDolares < 0) {
            System.out.println("El saldo en dolares no puede ser negativo");
            this.saldoDolares = 0;
        } else {
            this.saldoDolares = saldoDolares;
        }

    }

    public void depositarDolares(double monto) {
        if (monto > 0) {
            saldoDolares += monto;

        }
    }

    public void extraerDolares(double monto) {
        if (monto > 0 && monto <= saldoDolares) {
            saldoDolares -= monto;
        }
    }

    public void convertirDolaresAPesos(double monto, double tasaConversion) {
        if (monto > 0 && monto <= saldoDolares && tasaConversion > 0) {
            double pesos = monto * tasaConversion;
            saldoDolares -= monto;
            depositarEfectivo(pesos);
        }
    }

    public void convertirPesosADolares(double monto, double tasaConversion) {
        if (monto > 0 && monto <= getSaldo() && tasaConversion > 0) {
            double dolares = monto / tasaConversion;
            setSaldo(getSaldo() - monto);
            depositarDolares(dolares);
        }
    }

}
