package com.kit.std;

/**
 * Hello world!
 *
 */
import java.util.*;
import declare.*;
import logic.*;

import logic.StudentService;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	StudentService service=new StudentService();
		System.out.println("Enter id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter how many subjects:");
		int n=sc.nextInt();
		int mark[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("mark:" +(i+1));
			 mark[i]=sc.nextInt();
    } 
		
		System.out.println("Total of the mark:"+service.total(mark));
		service.average(mark);
		service.grade(mark);
}
}