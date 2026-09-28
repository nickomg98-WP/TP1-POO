package ar.org.centro8.java.curso.TP1.banco.clientes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public abstract class Cliente {
    private String numeroCliente;

}

// NOTA: si en algun momento hay que buscar coincidencia con numero del cliente
// se puede utilizar .equals().
// ademas INT no permite ceros al inicio del numero ni permite letras o guiones
