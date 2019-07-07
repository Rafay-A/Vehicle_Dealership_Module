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
public class Main {

    public static void main(String[] arg) {

        Dealership d = new Dealership();

        Car c1 = new Car(123, 50000, "Black", "Car", "12/01/2019", 5, 4);
        d.add(c1);
        //Car c2= new Car(456,60000,"Blue","Car","13/01/2019",5,4);

        Motorcycle m1 = new Motorcycle(234, 23000, "Red", "Motorcycle", "14,01,2019", 1.0);
        d.add(m1);
        Motorcycle m2 = (Motorcycle) m1.clone();

        System.out.println("Are the both bikes same? "+m2.equals(m1));
        
        d.print();
    }
}
