package logic;
import declare.*;
public class StudentService {
	
	public int total(int[] mark ) {
		int tot=0;
		for(int m:mark) {
			tot+=m;
		}
		return tot;
	}
	
	
public void average(int[] mark) {
	 int tot=total(mark);
	 System.out.println("Average of the mark:" +tot/mark.length);
 }

 
 public void grade(int[] mark) {
	 int tot= total(mark);
	 int avg=tot/mark.length;
	 if(avg>=90) {
		 System.out.println("Grade is A");
	 }
	 else if(avg>=80) {
		 System.out.println("Grade is B");
	 }
	 else if(avg>=70) {
		 System.out.println(" Grade is C");
	 }
	 else if(avg>=60) {
		 System.out.println(" Grade is D");
	 }
	 else {
		 System.out.println("Fail");
	 }
 }
}
