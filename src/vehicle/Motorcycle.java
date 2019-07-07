/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author LENOVO
 */
public class Motorcycle extends Vehicles implements Cloneable {

    double saddle_height;

    public Motorcycle() {
    }

    public Motorcycle(double saddle_height) {
        this.saddle_height = saddle_height;
    }

    public Motorcycle(int VIN, double Cost, String Color, String Category, String DOA, double saddle_height) {
        super(VIN, Cost, Color, "Motorcycle", DOA);
        this.saddle_height = saddle_height;
    }

    public Object clone() {
        return new Motorcycle(this.VIN, this.Cost, this.Color, this.Category, this.DOA, this.saddle_height);
    }

    public boolean equals(Motorcycle m) {
        return (this.VIN == m.VIN && this.Cost == m.Cost && this.Color.equals(m.Color) && this.Category.equals(m.Category) && this.DOA.equals(m.DOA) && this.saddle_height == m.saddle_height);
    }

    @Override
    public String toString() {
        return "Vehicles{" + "VIN=" + VIN + ", Cost=" + Cost + ", Color=" + Color + ", Category=" + Category + ", DOA=" + DOA + '}'+"Motorcycle{" + "saddle_height=" + saddle_height + '}';
    }

    
    
    
}
