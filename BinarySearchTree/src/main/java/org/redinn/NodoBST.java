package org.redinn;

// Classe che rappresenta ogni nodo dell'albero.
public class NodoBST {

    private int dati;        // Per questo BST viene utilizzato il tipo "int", per semplificare la rappresentazione dell'albero e comprenderne il funzionamento.
    private NodoBST puntatoreFiglioDX;
    private NodoBST puntatoreFiglioSX;

    public NodoBST(int dati) {
        this.dati = dati;
        puntatoreFiglioDX = null;
        puntatoreFiglioSX = null;
    }

    // Getters
    public int getDati(){
        return dati;
    }

    public NodoBST getFiglioDX(){
        return puntatoreFiglioDX;
    }

    public NodoBST getFiglioSX(){
        return puntatoreFiglioSX;
    }

    // Setters

    public void setDati(int dati) {
        this.dati = dati;
    }

    public void setFiglioDX(NodoBST n){
        puntatoreFiglioDX = n;
    }

    public void setFiglioSX(NodoBST n){
        puntatoreFiglioSX = n;
    }
}
