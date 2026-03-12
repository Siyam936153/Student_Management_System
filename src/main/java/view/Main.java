package view;
import java.util.*;
public class Main {
		public static void main( String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			int name=sc.nextInt();
			System.out.println("Enter how many subjects:");
			int n=sc.nextInt();
			int mark[]=new int[n];
			for(int i=0;i<n;i++) {
				 mark[i]=sc.nextInt();
			}
				
		}
}
