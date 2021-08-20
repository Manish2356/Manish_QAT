package test;
import java.util.ArrayList;
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		Scanner in= new Scanner(System.in); 
		System.out.println("Enter the size of string array : ");
		int n = in.nextInt();
		System.out.println("enter the words");
		for(int i=0;i<n;i++) {
			a.add(in.next());
		}
		System.out.println("reversed Strings : ");
		for(int j=a.size()-1;j>=0;j--) {
			System.out.println(a.get(j));
		}

	}

}

