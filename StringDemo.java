import pack.*;
import java.util.Scanner;

public class StringDemo{
	public static void main(String...arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		System.out.println("The length of String is : "+MyString.length(str));
	}
}
