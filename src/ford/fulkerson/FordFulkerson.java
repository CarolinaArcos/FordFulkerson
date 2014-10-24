/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ford.fulkerson;

/**
 *
 * @author ALICIA PRATS
 */
public class FordFulkerson {
    
public void FordFulkerson(Grafo grafo, Nodo s, Nodo t) {
    for (int i = 0; i < grafo.getArco().length; i++) {
        grafo.getArcoPos(i).setCapacidad12(0);
        grafo.getArcoPos(i).setCapacidad21(0);
    }
    /*while (exista un camino p desde s a t en grafo) {
        
    }
    * */
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

