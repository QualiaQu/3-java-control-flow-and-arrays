package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 1100, 10000, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        else {
        int countInt = 0;
        for (int k: arr) {
            if(k <= 1000) countInt++;
        }

        int[] result = new int[countInt];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] < 1000) result[j++] = arr[i];
        }

        return result;

        }
    }
}