// public class Main {

//     // Sortowanie przez wybieranie.
//     // Dla danej tablicy jednowymiarowej int[] funkcja ma zwrócić jej posortowaną
//     // wersje

//     public static int[] selectionSort(int[] array) {

//         for (int i = 0; i < array.length - 1; i++) {
//             int min = i;

//             for (int j = i + 1; j < array.length; j++) {
//                 if (array[j] <= array[min]) {
//                     min = j;
//                 }
//             }
//             int temp = array[min];
//             array[min] = array[i];
//             array[i] = temp;
//         }

//         return array;
//     }

//     public static void main(String[] args) {

//         int[] randomArray = { 1, 4, 6, 2, -9, 0, 1 };
//         int[] result = selectionSort(randomArray);

//         for (int i : result) {
//             System.out.print(
//                     i + " ");
//         }

//     }
// }

public class Main {
    public static void main(String[] args) {
        int[][] matrixA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrixB = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };

        int[][] result = addMatrix(matrixA, matrixB);

        // Wyświetlenie wyniku
        System.out.println("Wynik dodawania macierzy:");
        printMatrix(result);
    }

    public static int[][] addMatrix(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    // Funkcja do wyświetlania macierzy
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
