public class Zadanie1_B {

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

        int counter = 0;
        for (int j =0; j < 10 ; j++){
            counter++;
            System.out.println(Arrays.toString(array));
            for (int i = 1 ; i < array.length;i++){
                counter++;
                if (array[i] < array[i-1]) {
                    counter++;
                    int zamiana = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = zamiana;
                }

            }
        }
        System.out.println("Counter: " +counter);
    }

}
