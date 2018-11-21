
import java.util.*;

class Account{
	String name;
	int money = 0;
	ArrayList<String> all = new ArrayList<String>();
	ArrayList<String> income = new ArrayList<String>();
	ArrayList<String> consume = new ArrayList<String>();
}


public class Project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String account = sc.next(); 
				
		System.out.print("수입(1), 지출(2), 내역(3), 종료(4)\n>>");
		
		switch(sc.nextInt()) {
		case 1: 
			System.out.println("금액 입력>>");
			int m = sc.nextInt();
			//account.money += m 잔액증가
			System.out.println("내용 입력>>");
			String usage = sc.next();
			all.add(m + "원, " + usage);
			income.add(m + "원, " + usage);
			
			break;
		case 2: 
			System.out.println("금액 입력>>");
			int m = sc.nextInt();
			//account.money -= m 잔액감소 
			System.out.println("내용 입력>>");
			String usage = sc.next();
			all.add(m + "원, " + usage);
			consume.add(m + "원, " + usage);
			
			break;
		case 3: 
			System.out.println("수입 내역(1), 지출 내역(2), 전체 내역(3)");
			switch(sc.nextInt()) {
			case 1: 
				Iterator<String> incomeit = income.Iterator();
				while(incomeit.hasNext())
					System.out.println(income.next());
				break;
			case 2: 
				Iterator<String> consumeit = consume.Iterator();
				while(consumeit.hasNext())
					System.out.println(consume.next());
				break;
			case 3: 
				Iterator<String> allit = all.Iterator();
				while(allit.hasNext())
					System.out.println(all.next());
				break;
			}
			break;
		case 4: System.out.println("프로그램 종료"); 
				System.exit(0);
		}
		
	}

}
