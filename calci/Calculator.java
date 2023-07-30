package calci;

class DivideByZeroException extends ArithmeticException{
	public DivideByZeroException() {
		super();
	}
	public DivideByZeroException(String msg) {
		super(msg);
	}
}

public class Calculator{
	
	int num1,num2,num3,num4,num5,num6;

	public Calculator(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public Calculator(int num1,int num2,int num3){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	public Calculator(int num1,int num2,int num3,int num4){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		this.num4=num4;
	}
	
	public Calculator(int num1,int num2,int num3,int num4,int num5){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		this.num4=num4;
		this.num5=num5;
	}


	public int add(){

		return num1+num2;
	}
	public int sub(){
		if(num1>num2) {
			return num1-num2;			
		}else {
			return num2-num1;
		}
	}	
	public int mul(){
		
		return num1*num2;
	}
	public float returnValue(float num1,float num2) {
		return (num1/num2);
	}
	public float div(){
		float rv=0;
		try {		
			if(num2==0) {
				throw new DivideByZeroException("Cannot divide by Zero !");
			}
			rv=returnValue(num1,num2);				
		}catch(DivideByZeroException d) {
			System.out.println("Error : "+d.getMessage());
			
		}
		return rv;
	}

}
