public class Zadanie_1_A {
    public static void main(String[] args) {
        int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int max = array[0];


        for (int i = 1 ; i < array.length;i++){
            if (array[i] < array[i-1]) {

                int zamiana = array[i];
                array[i] = array[i - 1];
                array[i - 1] = zamiana;
            }
        }

        for (int i : array)
            System.out.print(i+" ");
    }
}