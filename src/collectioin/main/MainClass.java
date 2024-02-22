package collectioin.main;

import java.util.Scanner;

import collection.service.MemberService;
import collection.service.MemberServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		MemberService ms = new MemberServiceImpl();
		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.몰라");
			System.out.print(">>> : ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				ms.display();
				break;
			case 2:
				
				break;
			default:
				break;
			}
		}
	}
}
