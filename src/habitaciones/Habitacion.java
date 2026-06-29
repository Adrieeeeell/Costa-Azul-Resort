/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habitaciones;

/**
 *
 * @author Student
 */
public class Habitacion {
    private int NumeroPiso;
    private boolean Balcon;
    private double precioNoche;
    
    

    

    public Habitacion(int NumeroPiso, boolean Balcon, double precioNoche) {
        this.NumeroPiso = NumeroPiso;
        this.Balcon = Balcon;
        this.precioNoche= precioNoche;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public int getNumeroPiso() {
        return NumeroPiso;
    }

    public void setNumeroPiso(int NumeroPiso) {
        this.NumeroPiso = NumeroPiso;
    }

    public double calcularCostoH(int precioPorNoche,int calcularNoches){
      return  0.13*(calcularNoches*precioNoche);
    }
    

   public boolean verificarBalcon() {
        if (this.isBalcon() == true) {
            System.out.println("Tiene Balcon");
        }
        if (this.isBalcon() == false){
        System.out.println("No tiene Balcon");
    }
        return Balcon;
    }
    public boolean isBalcon() {
        return Balcon;
    }
    public void setBalcon(boolean Balcon) {
        this.Balcon = Balcon;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "NumeroPiso=" + NumeroPiso + ", Balcon=" + Balcon + ", precioNoche=" + precioNoche + '}';
    }
    
}
