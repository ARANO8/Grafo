import java.util.Vector;

public class GrafoLAD {
    private int numVertices;
    private Vector<Vector<Boolean>> listaAD;
    private Vector<Vector<String>> listaADV;
    private boolean dirigido;

    public GrafoLAD(int numVertices, boolean dir) {
        this.numVertices = numVertices;
        this.listaAD = new Vector<Vector<Boolean>>(numVertices);
        this.dirigido = dir;
        for (int i = 0; i < numVertices; i++) {
            Vector<Boolean> fila = new Vector<>(numVertices);
            for (int j = 0; j < numVertices; j++) {
                fila.add(false);
            }
            listaAD.add(fila);
        }
    }

    public GrafoLAD(int numVertices) {
        this.numVertices = numVertices;
        this.listaADV = new Vector<Vector<String>>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            Vector<String> fila = new Vector<String>(numVertices);
            for (int j = 0; j < numVertices; j++) {
                fila.add("");
            }
            listaADV.add(fila);
        }
    }

    public void insertarAristaGV(int origen, int destino, String k) {
        listaADV.get(origen).set(destino, k);

    }

    public void imprimirGrafoV() {
        // System.out.println("Tamaño máximo del grafo: " + maxNodos + "\n");
        System.out.println("El grafo contiene " + numVertices + " vértices: \n");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("vértice " + i + ": ");
            escribirV((listaADV.get(i)));
        }
    }

    static void escribirV(Vector<String> vector) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) != "") {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public void insertarArista(int origen, int destino) {
        listaAD.get(origen).set(destino, true);
        if (dirigido == false) {
            listaAD.get(destino).set(origen, true);
        }
    }

    public void eliminarArista(int origen, int destino) {
        listaAD.get(origen).set(destino, false);
        if (dirigido == false) {
            listaAD.get(destino).set(origen, false);
        }
    }

    public void insertaVertices(int n) {
        for (int i = 0; i < n; i++) {
            Vector<Boolean> fila = new Vector<Boolean>(numVertices);
            for (int j = 0; j < numVertices; j++) {
                fila.add(false);
            }
            listaAD.add(fila);
        }

    }

    public boolean existeArista(int origen, int destino) {
        return listaAD.get(origen).get(destino);
    }

    public void imprimirGrafo() {
        // System.out.println("Tamaño máximo del grafo: " + maxNodos + "\n");
        System.out.println("El grafo contiene " + numVertices + " vértices: \n");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("vértice " + i + ": ");
            escribir(listaAD.get(i));
        }
    }

    static void escribir(Vector<Boolean> vector) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    // public void imprimirGrafo() {
    // for (int i = 0; i < numVertices; i++) {
    // Vector<Boolean> adyacentes = listaAD.get(i);
    // System.out.print("Vértice " + i + " está conectado a: ");
    // for (int j = 0; j < adyacentes.size(); j++) {
    // if (adyacentes.get(j)) {
    // System.out.print(" 1");
    // }else{
    // System.out.print(" 0");
    // }
    // //System.out.print(adyacentes.get(j) + " ");
    // }
    // System.out.println();
    // }
    // }

    public int gradoEntrada(int i) {
        int grado = 0;
        for (int j = 0; j < numVertices; j++) {
            if (listaAD.get(i).get(j)) {
                grado++;
            }
        }
        return grado;
    }

    public int gradoSalida(int i) {
        int grado = 0;
        for (int j = 0; j < numVertices; j++) {
            if (!listaAD.get(i).get(j)) {
                grado++;
            }
        }
        return grado;
    }

    public int grado(int i) {
        return ((gradoEntrada(i) + gradoSalida(i)) / 2);
    }
}
