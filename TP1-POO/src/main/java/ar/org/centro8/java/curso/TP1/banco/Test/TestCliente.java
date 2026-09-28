package ar.org.centro8.java.curso.TP1.banco.Test;

import ar.org.centro8.java.curso.TP1.banco.clientes.ClienteEmpresa;
import ar.org.centro8.java.curso.TP1.banco.clientes.ClienteIndividual;

public class TestCliente {
    public static void main(String[] args) {
        ClienteIndividual cliente1 = new ClienteIndividual("1","Mara", "Benitez", "12345678");
        ClienteIndividual cliente2 = new ClienteIndividual("2","Roberto", "Gomez", "23895672");
        ClienteIndividual cliente3 = new ClienteIndividual("3","Luis", "Sambrano", "97453214");
        ClienteEmpresa empresa1 = new ClienteEmpresa("4", "Empresa A", "21234587980");
        ClienteEmpresa empresa2 = new ClienteEmpresa("5", "Empresa B", "20436579962");
        ClienteEmpresa empresa3 = new ClienteEmpresa("6", "Empresa C", "18347381987");

        System.out.println(cliente1);
         System.out.println("============================================================================================");
        System.out.println(cliente2);
         System.out.println("============================================================================================");
        System.out.println(cliente3);
         System.out.println("============================================================================================");
        System.out.println(empresa1);
         System.out.println("============================================================================================");
        System.out.println(empresa2);
         System.out.println("============================================================================================");
        System.out.println(empresa3);
    }

}
