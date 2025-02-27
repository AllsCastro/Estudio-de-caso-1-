/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg1;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author allis
 */
public class facturas {
    private String cliente;
    private Date fechafactura;
    private String codigofactura;
    private String cedulacliente;

   facturas(String cliente, Date fechafactura, String codigofactura, String cedulacliente) {
        this.cliente = cliente;
        this.fechafactura = fechafactura;
        this.codigofactura = codigofactura;
        this.cedulacliente = cedulacliente;
    }

    facturas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   public String getCliente(){
       return cliente;
   }
    
    @Override
    public String toString() {
        return "facturas{" + "cliente=" + cliente + ", fechafactura=" + fechafactura + ", codigofactura=" + codigofactura + '}' ;  }

    public Date getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(Date fechafactura) {
        this.fechafactura = fechafactura;
    }

    public String getCodigofactura() {
        return codigofactura;
    }

    public void setCodigofactura(String codigofactura) {
        this.codigofactura = codigofactura;
    }
    
 public void facturaCliente1(){
     cliente= "Julio Sanchez";
     codigofactura= "2351";
     cedulacliente= "11202000"; 
     JOptionPane.showMessageDialog(null,"Cliente:" + cliente + "\n" + "El codigo de fectura:"
+ codigofactura + "\n" + "Numero de cedula:" + cedulacliente + "\n" );
     
 }  

 
}
 

