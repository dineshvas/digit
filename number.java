package guvi;
import java.util.Scanner;
public class number {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits:");
		int num=sc.nextInt();
		sc.close();
		int count=0;
		while(num>0){
			num=num/10;
			count++;
			}
		System.out.println("The digits is :"+count);
	}
}
