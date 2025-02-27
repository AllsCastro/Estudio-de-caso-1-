/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg1;

/**
 *
 * @author allis
 */
public class vendedor {
    private String nombrecliente;
    private String cedulacliente;
    private String codigofactura;
    private String montofactura;

    public vendedor(String nombrecliente, String cedulacliente, String codigofactura, String montofactura) {
        this.nombrecliente = nombrecliente;
        this.cedulacliente = cedulacliente;
        this.codigofactura = codigofactura;
        this.montofactura = montofactura;
    }
    
    

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public String getCodigofactura() {
        return codigofactura;
    }

    public void setCodigofactura(String codigofactura) {
        this.codigofactura = codigofactura;
    }

    public String getMontofactura() {
        return montofactura;
    }

    public void setMontofactura(String montofactura) {
        this.montofactura = montofactura;
    }
    
    
}
