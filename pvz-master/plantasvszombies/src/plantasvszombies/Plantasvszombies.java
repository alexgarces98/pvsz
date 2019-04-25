/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombies;

/**
 *
 * @author Victor
 */
public class Plantasvszombies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tablero t = new Tablero(4,4,"Fácil",0,20);
        Juego j = new Juego(t);
        
        
        t.rellenarTablero();
        Girasol g = new Girasol(20, 1, 0, 2);
        t.getTablero().set(0, g);
       j.generarSoles();
        System.out.println(g.getFrecuencia());
        t.imprimirTablero();

        
        
        
        
       
    }
    
}
