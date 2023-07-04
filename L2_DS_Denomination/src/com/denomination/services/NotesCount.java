package com.denomination.services;

public class NotesCount {

		public void notesCountImpl(int notes[], int pay)
		{
			int noteCounter[] = new int[notes.length];
			
			try 
			{
				for(int i=0; i<notes.length; i++)
				{
					if(pay >= notes[i])
					{
						noteCounter[i] = pay/notes[i];
						
						pay = pay - noteCounter[i]*notes[i];
					}
					else if(i==0)
					   {
					  		System.out.println("Cannot pay the amount with the highest denomination");
					 		break;
					   }
				}
				if(pay > 0)
				{
					System.out.println("Cannot pay the amount with the highest denomination");
				}
				else
				{
					System.out.println(" ");
					System.out.println("Your payment approach in order to give min no of notes will be");
					for(int i = 0; i < notes.length; i++)
					{
					if(noteCounter[i] != 0)	
					System.out.println(notes[i] + ":" + noteCounter[i]);
					}
					
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println(e+ " notes of denomination 0 is invalid");
			}
			
			
		}
}
