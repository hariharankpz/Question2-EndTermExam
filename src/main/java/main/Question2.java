package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question2 {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values: ");
	int Length = sc.nextInt();
	sc.nextLine();
	for(int i=0;i<Length;i++)
		numbers.add(Integer.parseInt(sc.nextLine()));
	Question2 qns2=new Question2();
	System.out.println(qns2.listWithDuplicates(numbers));

}
public List<Object> listWithDuplicates(List<Integer> number){
	List<Object> L1 = number.stream().collect(Collectors.toList());
	//write your code here !! change the L1 to required value
	return L1 ;
}
}