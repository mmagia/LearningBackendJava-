package hometask1;

public class Task3 {

    public static void main(String[] args) {
        int[] arr = {0, 24, 4, 12, 8, 2, 1, -2, -4, -6};
        //
        int[] resultedArray = removeOddElementsSorted(arr);

        for (int j : resultedArray) {
            System.out.println(j);
        }

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }

    public static int countEvenElements(int[] arr) {
        int size = 0;
        for (int j : arr) {
            if (Math.abs(j) % 2 == 0) {
                size++;
            }
        }
        return size;
    }

    public static int[] removeOddElementsSorted(int[] arr) {
        int[] newArray;
        int size = countEvenElements(arr);
        int count = 0;
        newArray = new int[size];
        for (int i = 0; i < size; i++) {
            while (arr[count] % 2 != 0) {
                count++;
            }
            newArray[i] = arr[count];
            count++;
        }
        selectionSort(newArray);
        return newArray;
    }

}
