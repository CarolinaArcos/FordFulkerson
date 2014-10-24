/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ford.fulkerson;

/**
 *
 * @author ALICIA PRATS
 */
public class Arco {
    private Nodo nodo1;
    private Nodo nodo2;
    private int capacidad12;
    private int capacidad21;
    
    public void setCapacidad12(int capacidad) {
        capacidad12 = capacidad;
    }
    public void setCapacidad21(int capacidad) {
        capacidad21 = capacidad;
    }
}
