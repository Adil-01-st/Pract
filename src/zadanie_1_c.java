public class zadanie_1_c {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int max = array[0];
        for (int i = 0, i < array, lenght - 1; i++){
            counter++;
            System.out.println();
            System.out.println(Arrays.toString(array));
            for (int j = 0; j < array.length - 1; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    counter++;
                    int greater = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = greater;
                }
                boolean toSort=true;
                for(int i=1; i<array.length && toSort; i++) {
                    toSort=false;
                    counter++;
                    if (array[j] > array [j+1]) {

                    }
                    }
                }
            }
            System.out.println("Counter: " + counter);
        }

    }