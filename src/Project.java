
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
				
		System.out.print("����(1), ����(2), ����(3), ����(4)\n>>");
		
		switch(sc.nextInt()) {
		case 1: 
			System.out.println("�ݾ� �Է�>>");
			int m = sc.nextInt();
			//account.money += m �ܾ�����
			System.out.println("���� �Է�>>");
			String usage = sc.next();
			all.add(m + "��, " + usage);
			income.add(m + "��, " + usage);
			
			break;
		case 2: 
			System.out.println("�ݾ� �Է�>>");
			int m = sc.nextInt();
			//account.money -= m �ܾװ��� 
			System.out.println("���� �Է�>>");
			String usage = sc.next();
			all.add(m + "��, " + usage);
			consume.add(m + "��, " + usage);
			
			break;
		case 3: 
			System.out.println("���� ����(1), ���� ����(2), ��ü ����(3)");
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
		case 4: System.out.println("���α׷� ����"); 
				System.exit(0);
		}
		
	}

}
