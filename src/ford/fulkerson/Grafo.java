/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ford.fulkerson;

/**
 *
 * @author ALICIA PRATS
 */
public class Grafo {
    private Arco [] arco;
    private Nodo[] nodo;
    
    public Arco[] getArco() {
        return arco;
    }
    public Nodo[] getNodo() {
        return nodo;
    }
    public Arco getArcoPos(int i) {
        return arco[i];
    }
}
