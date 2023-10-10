public class SortareBubble {
    public static void main(String[] args) {
        int[] numere = {5, 2, 9, 1, 5, 6};

        System.out.println("Lista initiala:");
        afisareLista(numere);

        bubbleSort(numere);

        System.out.println("Lista sortata:");
        afisareLista(numere);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean schimbare;

        do {
            schimbare = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Schimba elementele daca sunt in ordine inversa
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    schimbare = true;
                }
            }
        } while (schimbare);
    }

    public static void afisareLista(int[] arr) {
        for (int numar : arr) {
            System.out.print(numar + " ");
        }
        System.out.println();
    }
}
