package modelo;

/**
 *
 * @author Usuario
 */

import java.util.Date;

public class historial {
    private int idHistorial;
    private String direccion;
    private Date fechaHora;

    public historial(String direccion) {
        this.direccion = direccion;
    }

    public historial() {
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    
}
