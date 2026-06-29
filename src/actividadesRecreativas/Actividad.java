/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadesRecreativas;
import Clientes.clientes;
import java.util.Arrays;
/**
 *
 * @author Student
 */
public class Actividad {
    private final actividades nombreActividad;
    private String fecha;
    private String hora;
    private int cupoMax;
    private clientes[] clientes;

    public actividades getNombreActividad() {
        return nombreActividad;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }

    public Actividad(actividades nombreActividad, String fecha, String hora, clientes[] clientes) {
        this.nombreActividad = nombreActividad;
        this.fecha = fecha;
        this.hora = hora;
        this.clientes = clientes;
    }

    public Actividad(actividades nombreActividad, String fecha, String hora, int cupoMax, clientes[] clientes) {
        this.nombreActividad = nombreActividad;
        this.fecha = fecha;
        this.hora = hora;
        this.cupoMax = cupoMax;
        this.clientes = clientes;
    }
    
    
    public boolean existeCupoDisponible(){
        int i;
        for (i=0; i<= clientes.length; i++){
            if (clientes[i] == null){
                return true;
            }
        }return false;
    }
    public void agregarclientes(){
        int i;
        for (i=0; i<= clientes.length; i++){
            if (clientes[i] == null){
                clientes[i] = new clientes;
            }
        }
    }
    public int calcularPorcentajeEspacio(){
        int contador = 0;
        int i;
        for (i=0; i<= clientes.length; i++){
            while (clientes[i] != null) {
                contador ++;
            }
        }return (contador/clientes.length*100);
    }

    @Override
    public String toString() {
        return "Actividad{" + "nombreActividad=" + nombreActividad + 
                ", fecha=" + fecha + ", hora=" + hora +
                ", cupoMax=" + cupoMax + ", clientes=" +
                Arrays.toString(clientes) + '}';
    }
    
    
    
    
    
    
    
}
