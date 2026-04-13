package problem5;

import java.util.Arrays;

public class Sort {

	public static <E> void swap(E[] arr, int i, int j){
		E temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	static <E extends Comparable<E>> void bubbleSort(E[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        for (int j = 0; j < array.length - 1 - i; j++) {
	            if (array[j].compareTo(array[j + 1]) > 0) {
	                swap(array, j, j + 1);
	            }
	        }
	    }
	}
	
	
	static <E extends Comparable<E>> void mergeSort(E[] array) {
	    if (array.length <= 1) return; // базовый случай

	    // делим пополам
	    int mid = array.length / 2;
	    E[] left  = Arrays.copyOfRange(array, 0, mid);
	    E[] right = Arrays.copyOfRange(array, mid, array.length);

	    // рекурсивно сортируем каждую половину
	    mergeSort(left);
	    mergeSort(right);

	    // сливаем обратно
	    merge(array, left, right);
	}

	static <E extends Comparable<E>> void merge(E[] array, E[] left, E[] right) {
	    int i = 0, j = 0, k = 0;

	    while (i < left.length && j < right.length) {
	        if (left[i].compareTo(right[j]) <= 0) {
	            array[k++] = left[i++];
	        } else {
	            array[k++] = right[j++];
	        }
	    }

	    // добавляем остатки
	    while (i < left.length)  array[k++] = left[i++];
	    while (j < right.length) array[k++] = right[j++];
	}
	
}


