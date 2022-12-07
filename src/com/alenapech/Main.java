package com.alenapech;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] arr = initArray(1000);
        System.out.println(getPercentUniqueValues(arr));
    }

// Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public static int[] initArray(int length){
        Random random = new Random();
        IntStream intStream = random.ints(length, 0, 25);
        return intStream.toArray();
    }

// Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
// значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public static double getPercentUniqueValues(int[] array){
        Set set = new HashSet();
        Arrays.stream(array).forEach(value -> set.add(value));
        return set.size() * 100 / array.length;
    }

}
