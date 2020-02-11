package com.epam.maven_task3;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.*;


@WebService(serviceName = "cal")
public class Cal {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice like ADD, SUB,MUL,DIV");
		String s=sc.nextLine();
		System.out.println("Enter Two Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(Cal.calculator(a,b,s));


}



public static int calculator(int x, int y, String operation) {
int result=0;

if ("ADD".equals(operation)) {
result = x + y;

} else if ("SUB".equals(operation)) {
result = x - y;

} else if ("MUL".equals(operation)) {
result = x * y;

} else if ("DIV".equals(operation)) {
result = x / y;

}



return result;
}


}