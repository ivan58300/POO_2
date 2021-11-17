/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

/**
 *
 * @author ivan5
 */
public class Cuenta {
    private String nomCliente;
    private String numCuenta;
    private double tipoInteres;
    private double saldo;
    
    //costructor por defecto
    public Cuenta(){
        
    }
    
    public Cuenta(String nomCliente, String numCuenta, double tipoInteres, double saldo) {                         
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    
    public Cuenta(Cuenta objCuenta){
        this.nomCliente = objCuenta.nomCliente;
        this.numCuenta = objCuenta.numCuenta;
        this.tipoInteres = objCuenta.tipoInteres;
        this.saldo = objCuenta.saldo;
    }
    /**
     * @return the nomCliente
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * @param nomCliente the nomCliente to set
     */
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    /**
     * @return the numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   //método deposito
    public boolean deposito(double cnt){
        boolean depositoDone = true;
        
        if( cnt < 0 ){
            depositoDone = false;
        }else{
            this.saldo = this.saldo + cnt;
        }
        return depositoDone;
    }
    //método retiro 
    public boolean retiro (double cnt) {
        boolean retiroDone = true;                                                                         
        if (cnt < 0) {
            retiroDone = false;
        } else if (saldo >= cnt) {
            saldo -= cnt;
        } else {
            retiroDone = false;
        }
        return retiroDone;
    }
    //método transferencia
    public boolean transferencia(Cuenta cuentaDestino, double importe) {
        boolean correcto = true;
        if (importe <= 0) {
            correcto = false;
            System.out.println("\n- TIENE QUE INGRESAR UN VALOR MAYOR A 0 -\n");
        } else if (saldo >= importe) {
            retiro(importe);
            cuentaDestino.deposito(importe);
        } else {
            correcto = false;
            System.out.println("\n- No cuenta con suficientes fondos para transferir -\n");
        }
        return correcto;
    }
}
