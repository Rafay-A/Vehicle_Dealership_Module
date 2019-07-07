/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author LENOVO
 */
public class Dealership {

    ArrayList<Vehicles> al = new ArrayList<Vehicles>(10);

    public void add(Vehicles v) {
        al.add(v);
    }

    public Vehicles get(int index) {
        return (al.get(index));
    }

    

    public void print() {
        Iterator i = al.iterator();
        while (i.hasNext()) {
            Vehicles p = (Vehicles) i.next();
            System.out.println(p.toString());
        }
    }
}
