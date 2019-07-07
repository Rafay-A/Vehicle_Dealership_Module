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
public class Vehicles {

    int VIN;
    double Cost;
    String Color;
    String Category;
    String DOA;

    Vehicles() {
    }

    Vehicles(int VIN, double Cost, String Color, String Category, String DOA) {
        this.VIN = VIN;
        this.Cost = Cost;
        this.Color = Color;
        this.Category = Category;
        this.DOA = DOA;
    }

    @Override
    public String toString() {
        return "Vehicles{" + "VIN=" + VIN + ", Cost=" + Cost + ", Color=" + Color + ", Category=" + Category + ", DOA=" + DOA + '}';
    }

    
}
