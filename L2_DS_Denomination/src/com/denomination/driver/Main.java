package com.denomination.driver;

import com.denomination.services.*;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		BubbleSortImpl bubbleSortImpl = new BubbleSortImpl();
		
		NotesCount notesCount = new NotesCount();
		
		System.out.println("Enter the size of currency denominations  : ");
		
		int size = sc.nextInt();
		
		int notes[] = new int[size];
		
		System.out.println("Enter the currency denominations value : ");
		
		for(int i=0; i<size; i++)
		{
			notes[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay : ");
		
		int pay = sc.nextInt();
		
		int sortedNotes[] = bubbleSortImpl.bubblesort(notes);
		
		notesCount.notesCountImpl(sortedNotes, pay);
	}

}
