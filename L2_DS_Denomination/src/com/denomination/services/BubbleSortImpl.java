package com.denomination.services;

public class BubbleSortImpl {

	public int[] bubblesort(int notes[])
	{
		for(int i=notes.length-1;i>0; i--)
		{
			for(int j=0;j<i;j++)
			{
				if(notes[j]<notes[j+1])
				{
					int temp = notes[j]; 
					notes[j] = notes[j+1];
					notes[j+1]=temp;
				}
			}
		}
		
		return notes;
	}
}
