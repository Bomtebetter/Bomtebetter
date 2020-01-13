package v3;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] _numbers = { 5, 7, 2, 7, 9, 11, 4, 2, 6, 8, 1, 3, 10 };
		int _temp;
		boolean _sorted = false;

		do {
			
			for (int i = 0; i < _numbers.length -1; i++) {
				if (_numbers[i] > _numbers[i + 1]) { // byter plats på två intilliggande siffror
					_temp = _numbers[i]; // sparar tillfälligt värdet på den vänstra sidan
					_numbers[i] = _numbers[i + 1];
					_numbers[i + 1] = _temp;
					_sorted = true;
				}
	
			}

		} while (_sorted);
		
		System.out.println(Arrays.toString(_numbers));

	}

}
