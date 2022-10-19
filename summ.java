package HomeworkAlgoritm;

import java.util.Arrays;

public class summ {
    public static void main(String[] args) {
        int num1 = 6754, num2 = 98456, num3 = 98345; //объявить 3 целочисленные переменные
        // +3 числа в качестве входных данных
        int summ =num1+num2+num3; //сложение трех чисел
        System.out.println(summ); // вывод результата
    }

    public static int[] insert(int[] a, int key, int index) {
            int[] result = new int[a.length + 1];
            for (int i = 0, j = 0; i < a.length; i++, j++)
            {if (i == index) {
                result[j] = key;
                    j++;
                }
                result[j] = a[i];
            }
            return result;
        }
    {
        int [] a = {25, 14, 56, 15, 47}; //инициализация массива
        int key = 5; //инициализация элемента, который хотим вставить
        int index = 2; // индекс элемента, на место которого будем вставлять другой элемент
    a = insert(a, key, index);
        System.out.println(Arrays.toString(a));
    }
}



