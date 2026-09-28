package ar.org.centro8.java.curso.TP1.banco.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)

public class ClienteIndividual extends Cliente {

    @Setter
    private String nombre;
    @Setter
    private String apellido;

    private String dni;

    public ClienteIndividual(String numeroCliente, String nombre, String apellido, String dni) {
        super(numeroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

}
