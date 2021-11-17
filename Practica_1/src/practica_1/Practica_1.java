/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

import java.util.Scanner;

/**
 *
 * @author ivan5
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);  
        
        Cuenta cta_1 = new Cuenta();
        
        System.out.print("Titular de la cuenta: ");
        String nom = scn.nextLine();
        System.out.println("Número de cuenta: ");
        String num = scn.nextLine();
        System.out.println("Tipo de interes: ");
        double type = scn.nextDouble();
        System.out.println("Saldo: ");
        double saldo = scn.nextDouble();
        
        cta_1.setNomCliente(nom);
        cta_1.setNumCuenta(num);
        cta_1.setTipoInteres(type);
        cta_1.setSaldo(saldo);
        
        Cuenta cta_2 = new Cuenta("Ivanoe Lopez Blancas","2034157",1,500);
        
        Cuenta cta_3 = new Cuenta(cta_1);
        
        //mostrar los datos de la cunta  1
        System.out.println("\t-- Datos de la cuenta 1 --");
        System.out.println("Nombre del titular: " + cta_1.getNomCliente() );
        System.out.println("Numero de cuenta: " + cta_1.getNumCuenta() );
        System.out.println("Tipo de interes: " + cta_1.getTipoInteres());
        System.out.println("Saldo: $" + cta_1.getSaldo());
        
        //mostrar los datos de la cuenta 2
        System.out.println("\n\t-- Datos de la cuenta 2 --");
        System.out.println("Nombre del titular: " + cta_2.getNomCliente() );
        System.out.println("Numero de cuenta: " + cta_2.getNumCuenta() );
        System.out.println("Tipo de interes: " + cta_2.getTipoInteres());
        System.out.println("Saldo: $" + cta_2.getSaldo());
       
        //mostar los datos de la cuenta 3
        System.out.println("\n\t-- Datos de la cuenta 3 --");
        System.out.println("Nombre del titular: " + cta_3.getNomCliente() );
        System.out.println("Numero de cuenta: " + cta_3.getNumCuenta() );
        System.out.println("Tipo de interes: " + cta_3.getTipoInteres());
        System.out.println("Saldo: $" + cta_3.getSaldo());
       
        //deposito de 1000 a cuneta 1 
        System.out.println("\nSe le deposito $1000 a la cuenta 1");
        System.out.println("Saldo anterior: $"+ cta_1.getSaldo());
        cta_1.deposito(1000);
        System.out.println("Saldo Actual : $" + cta_1.getSaldo());
        
        //retiro de $250 a cuenta 3
        System.out.println("\nSe le retiro $250 a la cuenta 3");
        System.out.println("Saldo anterior: $"+ cta_3.getSaldo());
        cta_3.retiro(500);
        System.out.println("Saldo Actual : $" + cta_3.getSaldo());

        //transfiere cuenta 2 a cuenta 1 
        System.out.println("\nSe le transfiere de la cuenta 2 a l");
        System.out.println("Saldo cuenta 1 : $"+ cta_1.getSaldo());
        System.out.println("Saldo cuenta 2 : $"+ cta_2.getSaldo());
        System.out.println("¿Cuanto desea transferir a la cuenta 1 ?");
        double transferencia_1 = scn.nextDouble();
        cta_2.transferencia(cta_1,transferencia_1);
        System.out.println("Saldo cuenta 1 : $"+ cta_1.getSaldo());
        System.out.println("Saldo cuenta 2 : $"+ cta_2.getSaldo());
    }
    
}
