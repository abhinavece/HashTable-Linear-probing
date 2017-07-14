package com.heapdev.linear.probing.hashtable;

public class HashTable {

	private HashItem[] hashTable;

	public HashTable() {
		hashTable = new HashItem[Constants.TABLE_SIZE];
	}

	private int hashCodeValue(int key) {
	//	return key / Constants.TABLE_SIZE;
		return 0;
	}

	public void put(int key, int value) {

		int arrayIndex = hashCodeValue(key);

		while (hashTable[arrayIndex] != null) {
			arrayIndex = (arrayIndex + 1) % Constants.TABLE_SIZE;
			System.out.println("Collision ->NextIndex " + arrayIndex);
		}
		System.out.println("Inserted finally with Index: " + arrayIndex);
		hashTable[arrayIndex] = new HashItem(key, value);
	}

	public int get(int key) {

		int arrayIndex = hashCodeValue(key);

		while (hashTable[arrayIndex] != null && hashTable[arrayIndex].getKey() != key) {
			arrayIndex = (arrayIndex + 1) % Constants.TABLE_SIZE;
			System.out.println("Not found in index: "+ arrayIndex);
		}

		if (hashTable[arrayIndex] == null) {
			return -1;
		}
		return hashTable[arrayIndex].getValue();

	}

}
