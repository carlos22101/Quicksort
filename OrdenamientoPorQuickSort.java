public class OrdenamientoPorQuickSort {

    private int[] listaOriginal = new int[20];
    private int[] lista = new int[20];
    private int sumaDerecha;
    private int sumaIzquierda;
    private QuickSort quickSort = new QuickSort();

    public static void main(String[] args) {
        OrdenamientoPorQuickSort ordenamiento = new OrdenamientoPorQuickSort();
        ordenamiento.ejecutar();
    }

    public void ejecutar() {
        quickSort.generarNumeros(listaOriginal);
        lista = listaOriginal.clone();
        quickSort.ordenarPorQuicksort(lista, 0, lista.length - 1);
        sumaIzquierda = quickSort.sumarParteIzq(lista, 0);
        sumaDerecha = quickSort.sumarParteDer(lista, 10);

        if (sumaIzquierda > sumaDerecha) {
            System.out.println("Lista ordenada");
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }
        }
    }
}
