package by.home.maxzzzit;

public class MassMinElement {
	public static void main (String [] args) {
		int [] array = new int[] {23,64,654,23,18,7,23,123,89,54,67,98,222,4,54,65,34};
		int minValue = array[0];
		int minIndex = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (minValue > array[i]) {
				minValue = array[i];
				minIndex = i+1;
			}
		}
		System.out.println("\tМинимальный элемент в массиве = "+minValue+"\n\tПорядковый номер этого элемента = "+minIndex);
	}
}
