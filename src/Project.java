
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
		System.out.println("�̸��� �Է��ϼ���>>");
		String name = sc.next();
		Account account = new Account();
		account.name = name;
		System.out.print("����(1), ����(2), ����(3), ����(4)\n>>");
		
		switch(sc.nextInt()) {
		case 1: 
			System.out.println("�ݾ� �Է�>>");
			int m = sc.nextInt();
			account.money += m;
			System.out.println("���� �Է�>>");
			String usage = sc.next();
			account.all.add(m + "��, " + usage);
			account.income.add(m + "��, " + usage);
			
			break;
		case 2: 
			System.out.println("�ݾ� �Է�>>");
			m = sc.nextInt();
			account.money -= m; 
			System.out.println("���� �Է�>>");
			usage = sc.next();
			account.all.add(m + "��, " + usage);
			account.consume.add(m + "��, " + usage);
			
			break;
		case 3: 
			System.out.println("���� ����(1), ���� ����(2), ��ü ����(3)");
			switch(sc.nextInt()) {
			case 1: 
				Iterator<String> incomeit = account.income.iterator();
				
				while(incomeit.hasNext())
					System.out.println(incomeit.next());
				break;
			case 2: 
				Iterator<String> consumeit = account.consume.iterator();
				while(consumeit.hasNext())
					System.out.println(consumeit.next());
				break;
			case 3: 
				Iterator<String> allit = account.all.iterator();
				while(allit.hasNext())
					System.out.println(allit.next());
				break;
			}
			break;
		case 4: System.out.println("���α׷� ����"); 
				System.exit(0);
		}
		
	}

}
