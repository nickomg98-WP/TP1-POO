package ar.org.centro8.java.curso.TP1.banco.cheque;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString

public class Cheque {
    private double monto;
    private String bancoEmisor;
    private LocalDate fechaPago; // LocalDate es una clase de java que representa una fecha sin hora

}
