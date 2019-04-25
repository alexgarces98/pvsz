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
public class Juego {

    private Tablero tablero;

    public Juego(Tablero tablero) {
        this.tablero = tablero;

    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public void plantarGirasol(int fila, int columna) {
        int posCalculada = fila * tablero.getNumeroColumnas() + columna;
        if (tablero.getNumeroSoles() >= 20) {
            if (tablero.getTablero().get(posCalculada) == null) {
                Girasol g1 = new Girasol(20, 1, 0, 2);
                tablero.getTablero().set(posCalculada, g1);
            } else {
                System.out.println("No se ha podido plantar el girasol,la posicion seleccionada ya está ocupada");
            }
        } else {
            System.out.println("No hay suficientes soles");
        }

    }

    public void plantarLanzador(int fila, int columna) {
        int posCalculada = fila * tablero.getNumeroColumnas() + columna;
        if (tablero.getNumeroSoles() >= 50) {
            if (tablero.getTablero().get(posCalculada) == null) {
                Lanzaguisantes lg1 = new Lanzaguisantes("Línea recta", 50, 3, 1, 1); //Alcance lo hemos puesto como String por si en la siguiente práctica la mecanica del alcance del ataque cambia.
                tablero.getTablero().set(posCalculada, lg1);
            } else {
                System.out.println("No se ha podido plantar el lanza guisantes,la posicion seleccionada ya está ocupada");
            }
        } else {
            System.out.println("No hay suficientes soles");
        }
    }

    public void colocarZombi(int fila, int columna) {
        int posCalculada = fila * tablero.getNumeroColumnas() + columna;
        if (tablero.getTablero().get(posCalculada) == null) {
            ZombiComun zc1 = new ZombiComun(1, 5, 1, 1);
            tablero.getTablero().set(posCalculada, zc1);
        }
    }

    public void generarSoles() {
        for (int i = 0; i < (tablero.getNumeroFilas() * tablero.getNumeroColumnas()); i++) {
            if (tablero.getTablero().get(i) != null) {
                if (tablero.getTablero().get(i).getClass().getSimpleName().equals("Girasol")) {

                    System.err.println("joder");
                    if (tablero.getTablero().get(i).getFrecuencia() == 1) {
                        tablero.aumentarSoles();
                        tablero.getTablero().get(i).setFrecuencia(2);
                    } else {
                        tablero.getTablero().get(i).restaFrecuencia();
                    }
                }
            }
        }
    }

    public void ataquePlanta() {
        for (int i = 0; i < (tablero.getNumeroFilas() * tablero.getNumeroColumnas()); i++) {

        }
    }
}
