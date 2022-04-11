package com.glearning.dsa.service;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Size of Currency Denominations");
			int size = sc.nextInt();
			int notes[] = new int[size];
			System.out.println("Enter the currency denominations value one by one");
			for (int i = 0; i < size; i++) {
				notes[i] = sc.nextInt();
			}
			Sort bb = new com.glearning.dsa.service.Sort();
			bb.bubbleSort(notes);
//		System.out.println("After Sort");
//      for (integer i : notes ) {
			
//			System.out.println(i + " ");
//		}
			System.out.println("Enter the amount to pay");
			int amount = sc.nextInt();
			NotesCountService ncs = new NotesCountService();
			ncs.notesCounter(notes, amount);
		}

	}

}

