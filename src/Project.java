
import java.util.*;

class Account{
	String name;
	int money;
	ArrayList<String> all = new ArrayList<String>();
	ArrayList<String> income = new ArrayList<String>();
	ArrayList<String> consume = new ArrayList<String>();
}


public class Project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		System.out.println("이름을 입력하세요>>");
		account.name = sc.next();		
		System.out.println("잔액을 입력하세요>>");
		account.money = sc.nextInt();		
		
		while(true) {
				System.out.print("수입(1), 지출(2), 내역(3), 종료(4)\n>>");
				switch(sc.nextInt()) {
					case 1: 
							System.out.println("금액 입력>>");
							int m = sc.nextInt();
							account.money += m;
							System.out.println("내용 입력>>");
							String income = sc.next();
							account.all.add("+" + m + "원, " + income);
							account.income.add("+" + m + "원, " + income);
			
							break;
					case 2: 
							System.out.println("금액 입력>>");
							m = sc.nextInt();
							account.money -= m; 
							System.out.println("내용 입력>>");
							String usage = sc.next();
							account.all.add("-" + m + "원, " + usage);
							account.consume.add("-" + m + "원, " + usage);
			
							break;
					case 3: 
							System.out.println("수입 내역(1), 지출 내역(2), 전체 내역(3)\n>>");
							switch(sc.nextInt()) {
								case 1: 
										Iterator<String> incomeit = account.income.iterator();				
										while(incomeit.hasNext())
											System.out.println(incomeit.next());
										System.out.println("잔액: " + account.money);
										System.out.print("\n");
										break;
								case 2: 
										Iterator<String> consumeit = account.consume.iterator();
										while(consumeit.hasNext())
											System.out.println(consumeit.next());
										System.out.println("잔액: " + account.money);
										System.out.print("\n");
										break;
								case 3: 
										Iterator<String> allit = account.all.iterator();
										while(allit.hasNext())
											System.out.println(allit.next());
										System.out.println("잔액: " + account.money);
										System.out.print("\n");
										break;
							}
							break;
					case 4: System.out.println("프로그램 종료"); 
							sc.close();
							System.exit(0);
				}		
		
		}
	}

}
