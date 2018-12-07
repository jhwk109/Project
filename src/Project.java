
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
		System.out.println("�̸��� �Է��ϼ���>>");
		account.name = sc.next();		
		System.out.println("�ܾ��� �Է��ϼ���>>");
		account.money = sc.nextInt();		
		
		while(true) {
				System.out.print("����(1), ����(2), ����(3), ����(4)\n>>");
				switch(sc.nextInt()) {
					case 1: 
							System.out.println("�ݾ� �Է�>>");
							int m = sc.nextInt();
							account.money += m;
							System.out.println("���� �Է�>>");
							String income = sc.next();
							account.all.add("+" + m + "��, " + income);
							account.income.add("+" + m + "��, " + income);
			
							break;
					case 2: 
							System.out.println("�ݾ� �Է�>>");
							m = sc.nextInt();
							account.money -= m; 
							System.out.println("���� �Է�>>");
							String usage = sc.next();
							account.all.add("-" + m + "��, " + usage);
							account.consume.add("-" + m + "��, " + usage);
			
							break;
					case 3: 
							System.out.println("���� ����(1), ���� ����(2), ��ü ����(3)\n>>");
							switch(sc.nextInt()) {
								case 1: 
										Iterator<String> incomeit = account.income.iterator();				
										while(incomeit.hasNext())
											System.out.println(incomeit.next());
										System.out.println("�ܾ�: " + account.money);
										System.out.print("\n");
										break;
								case 2: 
										Iterator<String> consumeit = account.consume.iterator();
										while(consumeit.hasNext())
											System.out.println(consumeit.next());
										System.out.println("�ܾ�: " + account.money);
										System.out.print("\n");
										break;
								case 3: 
										Iterator<String> allit = account.all.iterator();
										while(allit.hasNext())
											System.out.println(allit.next());
										System.out.println("�ܾ�: " + account.money);
										System.out.print("\n");
										break;
							}
							break;
					case 4: System.out.println("���α׷� ����"); 
							sc.close();
							System.exit(0);
				}		
		
		}
	}

}
