import java.util.*;
public class excersise{
	public void problem_1(char cha){
		char ch=cha;
		switch(ch){
			case 'a','e','i','o','u','A','E','I','O','U':
				System.out.println("Vowels");
				break;
			case '1','2','3','4','5','6','7','8','9','0':
				System.out.println("Digits");
				break;

			default:
				System.out.println("special characters");
		}
				
			
			
	}
	public void problem_2(short mark){
		short marks=mark;
		if(marks<=100){
			if(marks>=90)System.out.println("GRADE A");
			else if(marks >=70 && marks<90 )System.out.println("GRADE B");
			else if(marks >=40 && marks<70)System.out.println("GRADE C");
			else if (marks <=35)System.out.println("Fail");
		}
		else{
			System.out.println("Please enter valid input");
		}

	}
	public void problem_3(int num){
		System.out.println(num*num);
		System.out.println(num*num*num);

	} 
	public void problem_4(int a,int b){
		int a1=a;
		int b1=b;
		System.out.print("Before swapping :-");
		System.out.print(a1+" ");
		System.out.print(b1);
		a1=a1^b1;
		b1=a1^b1;
		a1=a1^b1;
		System.out.print("After Swapping :-"); 
		System.out.print(a1+" ");
		System.out.println(b1);

	}
	public void problem_5(int a,int b){
		int a1=a;
		int b1=b;
		System.out.print("Before swapping :-");
		System.out.print(a1+" ");
		System.out.print(b1);
		int temp=a1;
		a1=b1;
		b1=temp;
		System.out.print("After Swapping :-"); 
		System.out.print(a1+" ");
		System.out.println(b1);
	}
	public void problem_6(){
		for (int i=0;i<=100;i++){
			if (i%2==0) System.out.println("Even :-"+i);
			else System.out.println("Odd :-"+i);
		}

	}
	public void problem_9(int num){
		if(num%2==0){
			System.out.print("Even Number");
		}
		else{
			System.out.println("Odd Number");
		}
	}
	public void problem_7(short ye){
		short year=ye;
		boolean leap=false;

		if(year %4==0){
			if(year%100==0){
				if(year % 400==0){
					leap=true;
				}
				else 
					leap=false;	
			}
		}
		else {
			leap=false;
		}
		if (leap) System.out.println("Leap Year");
		else System.out.println("Not a leap");
	}

	public void problem_8(int num){
		int reverse=0;
		int givem=num;
		int digit;
		while(num !=0){
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);
	}
	public void problem_10(int num){
		int a=1;
		for (int i=2;i<=num;i++){
			a=a*i;
		}
		System.out.println(a);
	}
	public void problem_11(int num){
		float result=num*1.8f;
		System.out.println(result+32+"farenheit");
	}
	public void problem_12(int num1,int num2,String operation){
		switch(operation){
			case "addition":
				System.out.println(num1+num2);
				break;
			case "subtraction":
				System.out.println(num1-num2);
				break;
			case "Multiplication":
				System.out.println(num1*num2);
				break;
			case "division":
				System.out.println(num1/num2);
				break;
			case "Module":
				System.out.println(num1%num2);
				break;
		}
	}	
	public static void main(String []args){
		excersise obj=new excersise();
		
		obj.problem_12(20,30,"Multiplication");
		

	}


}