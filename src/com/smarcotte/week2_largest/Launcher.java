package com.smarcotte.week2_largest;

import java.text.DecimalFormat;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Launcher {

	public static void main(String[] args) 
	{
		/***********************************************************************
		Program Name: Largest.java
		Programmer's Name: Shane Marcotte
		Program Description: This program will get 10 numbers and output the 
			largest number
		***********************************************************************/ 
		// get 10 numbers and find the largest
		//define an array
		int upperAverage = 0, lowerAverage = 0;
        double[] scores = new double[]{100,60,25,16,15,10,7};
       
        //calculate sum of all array elements
        double sum = 0.0;
       
        for(int i=0; i < scores.length ; i++)
                sum = sum + scores[i];
       
        //calculate average value
        double average = sum / scores.length;
        
        for (int i = 0; i < scores.length; i++)
        	if (scores[i] >= average)

        	upperAverage++;
        	lowerAverage = scores.length - upperAverage;

        	System.out.println("Average: " + average);
        	System.out.println("Scores above or equal to average: " + upperAverage);
        	System.out.println("Scores lower than average: " + lowerAverage); 
		// exit gracefully
		System.exit(0);

	}

}
