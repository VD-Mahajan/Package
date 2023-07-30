
import java.util.Scanner;
import calci.Calculator;

class Client {
	int choice,a,b;
	void displayOptions() {
		
		System.out.println("1) for Addition : ");
		System.out.println("2) for Substraction : ");
		System.out.println("3) for Multiplication : ");
		System.out.println("4) for Division : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Your Choice : ");
		choice = sc.nextInt();
		
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		Calculator obj = new Calculator(a,b);

		switch(choice){
			
			case 1:
				System.out.println(obj.add());
				break;
			case 2:
				System.out.println(obj.sub());
				break;
			case 3:
				System.out.println(obj.mul());
				break;
			case 4:
				System.out.println(obj.div());
				break;
			default :
				System.out.println("Invalid Choice !");
		}
		
	}
	public static void main(String[] args){
		
		Client client = new Client();
		client.displayOptions();
		client.input();

	}
}
