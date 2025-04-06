package org.redinn;

// BST = Binary Search Tree, Albero binario di ricerca, un tipo di albero nel quale ogni nodo può avere al massimo due figli,
// e dove per ogni nodo n, i nodi del sottoalbero sinistro contengono valori minori del nodo n, e i nodi del sottoalbero destro contengono solo valori maggiori.
public class BinarySearchTree {

    private NodoBST ptr; // Radice dell'albero

    public BinarySearchTree(){
        ptr = null;
    }

    // Ritorna la radice dell'albero
    public NodoBST getPtr(){
        return ptr;
    }


    // Aggiunta nodo in un BST, controllando quindi ogni nodo e comparando il valore di quest'ultimo con quello da inserire.
    public void aggiungiNodo(int dati){
        NodoBST newNode = new NodoBST(dati);
        NodoBST nodoCorrente, nodoPrecedente;

        if(ptr == null){
            ptr = new NodoBST(dati);
        }
        else{
            nodoPrecedente = ptr;
            if(dati < nodoPrecedente.getDati()){
                nodoCorrente = nodoPrecedente.getFiglioSX();
            }
            else{
                nodoCorrente = nodoPrecedente.getFiglioDX();
            }

            while(nodoCorrente != null){
                nodoPrecedente = nodoCorrente;
                if(dati < nodoPrecedente.getDati()){
                    nodoCorrente = nodoPrecedente.getFiglioSX();
                }
                else{
                    nodoCorrente = nodoPrecedente.getFiglioDX();
                }
            }

            if(dati < nodoPrecedente.getDati()){
                nodoPrecedente.setFiglioSX(newNode);
            }
            else{
                nodoPrecedente.setFiglioDX(newNode);
            }
        }
    }

    // La visita anticipata stampa prima la radice, poi il sottoalbero sinistro, ed infine il sottoalbero destro. Per fare ciò, sfrutta la ricorsione.
    public void visitaAnticipata(NodoBST n){
        if(n == null){
            return;
        }
        System.out.print(n.getDati() + " ");
        if(n.getFiglioSX() != null){
            visitaAnticipata(n.getFiglioSX());
        }
        if(n.getFiglioDX() != null){
            visitaAnticipata(n.getFiglioDX());
        }
    }

    // La visita simmetrica consiste nel visitare prima il sottoalbero sinistro, poi la radice, e infine il sottoalbero destro. Per fare ciò, sfrutta la ricorsione.
    public void visitaSimmetrica(NodoBST n){
        if(n == null){
            return;
        }

        if(n.getFiglioSX() != null){
            visitaSimmetrica(n.getFiglioSX());
        }
        System.out.print(n.getDati() + " ");
        if(n.getFiglioDX() != null){
            visitaSimmetrica(n.getFiglioDX());
        }

    }

    // La visita differita consiste nel visitare prima il sottoalbero sinistro, poi il destro, ed infine la radice. Per fare ciò, sfrutta la ricorsione.
    public void visitaDifferita(NodoBST n){
        if(n == null){
            return;
        }

        if(n.getFiglioSX() != null){
            visitaAnticipata(n.getFiglioSX());
        }
        if(n.getFiglioDX() != null){
            visitaAnticipata(n.getFiglioDX());
        }
        System.out.print(n.getDati() + " ");
    }


    // Metodo utilizzato per la ricerca di un nodo nel BST, che ritorna true o false.
    public boolean ricercaNodo(NodoBST n, int valore){
        if(n == null){
            return false;
        }

        if(n.getDati() == valore){
            return true;
        }

        if(n.getDati() < valore){
            return ricercaNodo(n.getFiglioDX(), valore);
        }

        if(n.getDati() > valore){
            return ricercaNodo(n.getFiglioSX(), valore);
        }

        return false;
    }
}
