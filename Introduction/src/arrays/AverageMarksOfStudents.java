package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter the number of students");
      int n = sc.nextInt();
      
      System.out.println("enter the marks now");
      int[] marks = new int[n];
      
      for(int i = 0; i < n ; i++) {
    	  marks[i] = sc.nextInt();
      }
      
      int averageMarks = 0;
      for(int i = 0; i < n ; i++) {
    	  averageMarks += marks[i];
      }
      
      averageMarks /= n;
	  
      System.out.println("the average marks are" + averageMarks);
	}

}
