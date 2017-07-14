package com.heapdev.linear.probing.hashtable;

public class App {
	
	public static void main(String[] args) {
		
		HashTable ht = new HashTable();
		
		ht.put(1, 21);
		ht.put(2, 33);
		ht.put(3, 43);
		ht.put(4, 76);
		ht.put(5, 12);

		ht.get(4);
		
	}

}
