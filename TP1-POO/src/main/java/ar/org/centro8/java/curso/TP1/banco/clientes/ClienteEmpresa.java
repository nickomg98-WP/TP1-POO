package ar.org.centro8.java.curso.TP1.banco.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)

public class ClienteEmpresa extends Cliente {
    @Setter
    private String nombreDeFantasia;
    private String cuit;

    public ClienteEmpresa(String numeroCliente, String nombreDeFantasia, String cuit) {
        super(numeroCliente);
        this.nombreDeFantasia = nombreDeFantasia;
        this.cuit = cuit;
    }

}
