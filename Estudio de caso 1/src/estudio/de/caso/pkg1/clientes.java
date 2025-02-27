/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg1;

/**
 *
 * @author allis
 */
public class clientes {
/* 
    Se hace la asignacion privada de las variables 
    */
    static boolean company;
    private String nombrecliente;
    private String cedulacliente;
    private String codigofactura;
    private String electricos;
    private String automotrices;
    private String construccion;
    private String montofactura;
    
    
    
  public clientes(){
      /* 
      Informacion que queremos que se 
      */
      nombrecliente="Generico";
      cedulacliente="N/A";
      codigofactura="***";
      
     
  }

    public clientes(String nombrecliente, String cedulacliente, String codigofactura, String electricos, String automotrices, String construccion, String montofactura) {
        this.nombrecliente = nombrecliente;
        this.cedulacliente = cedulacliente;
        this.codigofactura = codigofactura;
        this.electricos = electricos;
        this.automotrices = automotrices;
        this.construccion = construccion;
        this.montofactura = montofactura;
    }
    
    @Override
    public String toString() {
       return "clientes{" + "nombrecliente=" + nombrecliente + ", cedulacliente=" + cedulacliente + ", codigocliente=" + codigofactura + '}' ;
       
    }
    
    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getCedulacliente() {
        String resultado;
        
        return "********";
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public String getCodigofactura() {
        String resultado;
        
        return "***";
    }

    public void setCodigofactura(String codigofactura) {
        this.codigofactura = codigofactura;
    }

    public String getElectricos() {
        String resultado;
        
        return "***";
       
    }

    public void setElectricos(String electricos) {
        this.electricos = electricos;
    }

    public String getAutomotrices() {
        String resultado;
        
        return "***";
       
    }

    public void setAutomotrices(String automotrices) {
        this.automotrices = automotrices;
    }

    public String getConstruccion() {
       String resultado;
        
        return "***";
    }

    public void setConstruccion(String construccion) {
        this.construccion = construccion;
    }

    public String getMontofactura() {
        String resultado;
        
        return "***";
    }

    public void setMontofactura(String montofactura) {
        this.montofactura = montofactura;
    }

    void setPwd(String nuevoPWD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void facturacliente1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}
