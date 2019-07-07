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
public class Car extends Vehicles implements Insurable {

    int seating_capacity;
    int door_quantity;

    public Car(int VIN, double Cost, String Color, String Category, String DOA, int seating_capacity, int door_quantity) {
        super(VIN, Cost, Color, "Car", DOA);
        this.door_quantity = door_quantity;
        this.seating_capacity = seating_capacity;
    }

    public double calculateInsurance(double insurance_rate) {
        return (Cost * insurance_rate);
    }

    @Override
    public String toString() {
        return "Vehicles{" + "VIN=" + VIN + ", Cost=" + Cost + ", Color=" + Color + ", Category=" + Category + ", DOA=" + DOA + '}'+"Car{" + "seating_capacity=" + seating_capacity + ", door_quantity=" + door_quantity + '}';
    }

}
