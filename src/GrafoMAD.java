
public class GrafoMAD {
    private boolean dirigido;
    private int maxNodos;
    private int numVertices;
    private boolean matAd[][];
    private String matAdGV[][];

    public GrafoMAD(int n, boolean dir) {
        this.maxNodos = 50;
        this.numVertices = n;
        this.dirigido = dir;
        this.matAd = new boolean[maxNodos][maxNodos];
    }

    public GrafoMAD(int n) {
        this.maxNodos = 50;
        this.numVertices = n;

        this.matAdGV = new String[maxNodos][maxNodos];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                this.matAdGV[i][j] = "INF";
            }
        }
    }

    public void insertarArista(int i, int j) {
        this.matAd[i][j] = true;
        if (dirigido == false) {
            matAd[j][i] = true;
        }
    }

    public void insertarAristaGV(int i, int j, String k) {
        this.matAdGV[i][j] = k;
    }

    public void imprimirGrafoV() {
        System.out.println("La matriz contiene: " + this.numVertices + " vertices \n");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matAdGV[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void eliminarArista(int i, int j) {
        matAd[i][j] = false;
        if (dirigido == false) {
            matAd[j][i] = false;
        }
    }

    public void insertaVertices(int n) {
        if (maxNodos - numVertices < 0) {
            System.out.println("Error: Supera el maximo numero de nodos");
        } else {
            for (int i = 0; i < numVertices; i++) {
                for (int j = numVertices; j < numVertices + n; j++) {
                    matAd[i][j] = matAd[j][i] = false;
                }
            }
            numVertices = numVertices + n;
        }
    }

    public boolean existeArista(int i, int j) {
        if (matAd[i][j]) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirGrafo() {
        System.out.println("La matriz contiene: " + this.numVertices + " vertices \n");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (matAd[i][j]) {
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }

    public int gradoEntrada(int i) {
        int grado = 0;
        for (int j = 0; j < numVertices; j++) {
            if (matAd[j][i]) {
                grado++;
            }
        }
        return grado;
    }

    public int gradoSalida(int i) {
        int grado = 0;
        for (int j = 0; j < numVertices; j++) {
            if (matAd[i][j]) {
                grado++;
            }
        }
        return grado;
    }

    public int grado(int i) {
        return ((gradoEntrada(i) + gradoSalida(i)) / 2);
    }
}
