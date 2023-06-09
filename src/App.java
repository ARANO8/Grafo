public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("============GRAFO INCISO A=============");
        System.out.println("-----POR MATRIZ DE ADYACENCIA-----");
        GrafoMAD grafoMA = new GrafoMAD(4, false);
        grafoMA.insertarArista(0, 1);
        grafoMA.insertarArista(0, 2);
        grafoMA.insertarArista(0, 3);
        grafoMA.insertarArista(1, 2);
        grafoMA.insertarArista(2, 3);
        grafoMA.imprimirGrafo();
        System.out.println("-----POR LISTA DE ADYACENCIA-----");
        GrafoLAD grafoLA = new GrafoLAD(4, false);
        grafoLA.insertarArista(0, 1);
        grafoLA.insertarArista(0, 2);
        grafoLA.insertarArista(0, 3);
        grafoLA.insertarArista(1, 2);
        grafoLA.insertarArista(2, 3);
        grafoLA.imprimirGrafo();
        System.out.println("============GRAFO INCISO B=============");
        System.out.println("-----POR MATRIZ DE ADYACENCIA-----");
        GrafoMAD grafoMB = new GrafoMAD(6, true);
        grafoMB.insertarArista(2, 4);
        grafoMB.insertarArista(3, 1);
        grafoMB.insertarArista(4, 2);
        grafoMB.insertarArista(5, 3);
        grafoMB.insertarArista(5, 4);
        grafoMB.imprimirGrafo();
        System.out.println("-----POR LISTA DE ADYACENCIA-----");
        GrafoLAD grafoLB = new GrafoLAD(6, true);
        grafoLB.insertarArista(2, 4);
        grafoLB.insertarArista(3, 1);
        grafoLB.insertarArista(4, 2);
        grafoLB.insertarArista(5, 3);
        grafoLB.insertarArista(5, 4);
        grafoLB.imprimirGrafo();
        System.out.println("============GRAFO INCISO C=============");
        System.out.println("-----POR MATRIZ DE ADYACENCIA-----");
        GrafoMAD grafoMC = new GrafoMAD(6, true);
        grafoMC.insertarArista(0, 2);
        grafoMC.insertarArista(1, 2);
        grafoMC.insertarArista(2, 3);
        grafoMC.insertarArista(3, 0);
        grafoMC.insertarArista(3, 1);
        grafoMC.insertarArista(4, 2);
        grafoMC.insertarArista(4, 3);
        grafoMC.insertarArista(5, 4);
        grafoMC.imprimirGrafo();
        System.out.println("-----POR LISTA DE ADYACENCIA-----");
        GrafoLAD grafoLC = new GrafoLAD(6, true);
        grafoLC.insertarArista(0, 2);
        grafoLC.insertarArista(1, 2);
        grafoLC.insertarArista(2, 3);
        grafoLC.insertarArista(3, 0);
        grafoLC.insertarArista(3, 1);
        grafoLC.insertarArista(4, 2);
        grafoLC.insertarArista(4, 3);
        grafoLC.insertarArista(5, 4);
        grafoLC.imprimirGrafo();

        System.out.println("============GRAFO INCISO D=============");
        System.out.println("-----POR MATRIZ DE ADYACENCIA-----");
        GrafoMAD grafoMD = new GrafoMAD(6, true);
        grafoMD.insertarArista(0, 0);
        grafoMD.insertarArista(1, 0);
        grafoMD.insertarArista(1, 2);
        grafoMD.insertarArista(1, 4);
        grafoMD.insertarArista(3, 1);
        grafoMD.insertarArista(3, 2);
        grafoMD.insertarArista(4, 5);
        grafoMD.insertarArista(5, 4);
        grafoMD.imprimirGrafo();
        System.out.println("-----POR LISTA DE ADYACENCIA-----");
        GrafoLAD grafoLD = new GrafoLAD(6, true);
        grafoLD.insertarArista(0, 0);
        grafoLD.insertarArista(1, 0);
        grafoLD.insertarArista(1, 2);
        grafoLD.insertarArista(1, 4);
        grafoLD.insertarArista(3, 1);
        grafoLD.insertarArista(3, 2);
        grafoLD.insertarArista(4, 5);
        grafoLD.insertarArista(5, 4);
        grafoLD.imprimirGrafo();
        System.out.println("============GRAFO INCISO E=============");
        System.out.println("-----POR MATRIZ DE ADYACENCIA-----");
        GrafoMAD grafoME = new GrafoMAD(10, true);
        grafoME.insertarArista(0, 8);
        grafoME.insertarArista(1, 2);
        grafoME.insertarArista(2, 0);
        grafoME.insertarArista(2, 3);
        grafoME.insertarArista(4, 0);
        grafoME.insertarArista(4, 1);
        grafoME.insertarArista(4, 6);
        grafoME.insertarArista(5, 4);
        grafoME.insertarArista(5, 7);
        grafoME.insertarArista(6, 7);
        grafoME.insertarArista(8, 3);
        grafoME.insertarArista(8, 9);
        grafoME.imprimirGrafo();
        System.out.println("-----POR LISTA DE ADYACENCIA-----");
        GrafoLAD grafoLE = new GrafoLAD(10, true);
        grafoLE.insertarArista(0, 8);
        grafoLE.insertarArista(1, 2);
        grafoLE.insertarArista(2, 0);
        grafoLE.insertarArista(2, 3);
        grafoLE.insertarArista(4, 0);
        grafoLE.insertarArista(4, 1);
        grafoLE.insertarArista(4, 6);
        grafoLE.insertarArista(5, 4);
        grafoLE.insertarArista(5, 7);
        grafoLE.insertarArista(6, 7);
        grafoLE.insertarArista(8, 3);
        grafoLE.insertarArista(8, 9);
        grafoLE.imprimirGrafo();
        System.out.println("============GRAFO INCISO F=============");
        System.out.println("-----POR MATRIZ DE ADYACENCIA-----");
        GrafoMAD grafoMF = new GrafoMAD(9);
        grafoMF.insertarAristaGV(0, 1,"6");
        grafoMF.insertarAristaGV(0, 3,"10");
        grafoMF.insertarAristaGV(0, 6,"8");
        grafoMF.insertarAristaGV(1, 0,"6");
        grafoMF.insertarAristaGV(1, 2,"11");
        grafoMF.insertarAristaGV(1, 7,"13");
        grafoMF.insertarAristaGV(1, 4,"11");
        grafoMF.insertarAristaGV(2, 1,"11");
        grafoMF.insertarAristaGV(2, 7,"4");
        grafoMF.insertarAristaGV(3, 0,"10");
        grafoMF.insertarAristaGV(3, 4,"6");
        grafoMF.insertarAristaGV(4, 3,"6");
        grafoMF.insertarAristaGV(4, 1,"11");
        grafoMF.insertarAristaGV(4, 5,"2");
        grafoMF.insertarAristaGV(5, 4,"2");
        grafoMF.insertarAristaGV(5, 6,"4");
        grafoMF.insertarAristaGV(5, 8,"6");
        grafoMF.insertarAristaGV(6, 0,"8");
        grafoMF.insertarAristaGV(6, 5,"4");
        grafoMF.insertarAristaGV(6, 8,"5");
        grafoMF.insertarAristaGV(6, 7,"5");
        grafoMF.insertarAristaGV(7, 2,"4");
        grafoMF.insertarAristaGV(7, 1,"13");
        grafoMF.insertarAristaGV(7, 6,"5");
        grafoMF.insertarAristaGV(7, 8,"7");
        grafoMF.insertarAristaGV(8, 5,"6");
        grafoMF.insertarAristaGV(8, 6,"5");
        grafoMF.insertarAristaGV(8, 7,"7");
        grafoMF.imprimirGrafoV();
        System.out.println("-----POR LISTA DE ADYACENCIA-----");
       GrafoLAD grafoLF = new GrafoLAD(9);
       grafoLF.insertarAristaGV(0, 3,"10");
       grafoLF.insertarAristaGV(0, 1,"6");
       grafoLF.insertarAristaGV(0, 6,"8");
       grafoLF.insertarAristaGV(1, 0,"6");
       grafoLF.insertarAristaGV(1, 2,"11");
       grafoLF.insertarAristaGV(1, 7,"13");
       grafoLF.insertarAristaGV(1, 4,"11");
       grafoLF.insertarAristaGV(2, 1,"11");
       grafoLF.insertarAristaGV(2, 7,"4");
       grafoLF.insertarAristaGV(3, 0,"10");
       grafoLF.insertarAristaGV(3, 4,"6");
       grafoLF.insertarAristaGV(4, 3,"6");
       grafoLF.insertarAristaGV(4, 1,"11");
       grafoLF.insertarAristaGV(4, 5,"2");
       grafoLF.insertarAristaGV(5, 4,"2");
       grafoLF.insertarAristaGV(5, 6,"4");
       grafoLF.insertarAristaGV(5, 8,"6");
       grafoLF.insertarAristaGV(6, 0,"8");
       grafoLF.insertarAristaGV(6, 5,"4");
       grafoLF.insertarAristaGV(6, 8,"5");
       grafoLF.insertarAristaGV(6, 7,"5");
       grafoLF.insertarAristaGV(7, 2,"4");
       grafoLF.insertarAristaGV(7, 1,"13");
       grafoLF.insertarAristaGV(7, 6,"5");
       grafoLF.insertarAristaGV(7, 8,"7");
       grafoLF.insertarAristaGV(8, 5,"6");
       grafoLF.insertarAristaGV(8, 6,"5");
       grafoLF.insertarAristaGV(8, 7,"7");
       grafoLF.imprimirGrafoV();
    }
}
