package com.marithic.chapter48;

class Weight {
	static int[] data;

	// Constructor
	Weight(int[] init) {
		// Construct the array the same length
		// as that referenced by init.
		data = new int[init.length];

		// Copy values from the
		// input data to data.
		for (int j = 0; j < init.length; j++) {
			data[j] = init[j];
		}
	}

	// Print
	void print(int[] foo) {
		for (int j = 0; j < foo.length; j++) {
			System.out.println(j);
		}
	}

	public static void main(String[] args) {
		int[] values = { 98, 99, 98, 99, 100, 101, 102, 100, 104, 105, 105,
				106, 105, 103, 104, 103, 105, 106, 107, 106, 105, 105, 104,
				104, 103, 102, 102, 101, 100, 102 };
		Weight june = new Weight(values);
		june.print(data);
		System.out.println("Hello world");
	}
}