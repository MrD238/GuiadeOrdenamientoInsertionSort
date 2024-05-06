public class App {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){    
            int key = arr[i];//Seleciona el elemento a insertar en su posicion correcta.
            int j = i - 1;


            //Movemos los elementos mayores que key a una posicion adelante de su posicion actual.
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr [j];
                j--;
            }
            arr[j + 1] = key;  //insertamos a key en su posicion correcta.

        }
    }
    public static void main(String[] args) throws Exception {

        System.out.println("metodo de ordenamiento por insercion");

        int[] arr = {12, 11, 13, 5, 6};


        System.out.println("Arreglo original");
        for ( int num : arr ) {
            System.out.print(num + " ");
        
        }
        System.out.println();

        System.out.println("=============");
        insertionSort(arr); // Llamada al metodo de ordenamiento por inserción.

        System.out.println("Arreglo ordenado:");
        for ( int num : arr ) {
            System.out.println(num + " ");
        
        }
    }

}