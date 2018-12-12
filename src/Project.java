import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Project extends JFrame {
	
	public Project() {
		setTitle("가계부");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(600, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Project(); 		
	}
}

class MyPanel extends Panel {	
	
	int money;
	ArrayList<String> income = new ArrayList<String>();
	ArrayList<String> expense = new ArrayList<String>();
	
	private JButton ib = new JButton("수입");
	private JButton eb = new JButton("지출");
	private JButton wb = new JButton("내역 저장");
	private JTextArea ta = new JTextArea(7, 30);
	private JTextField tf = new JTextField(20);
	
	int amount;
	String usage;
	
	public MyPanel() {
		
		String dirStr = "c:\\temp\\가계부";
		File newDir = new File(dirStr);
		if(newDir.exists()!= true) newDir.mkdir();		
		
		String date = JOptionPane.showInputDialog("날짜를 입력하세요.(X월X일)");
		
		File file = new File("c:\\temp\\가계부\\" + date + ".txt");	
		money = Integer.parseInt(JOptionPane.showInputDialog("잔액을 입력하세요."));			
				
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		add(ib);
		add(eb);
		add(wb);
		add(new JScrollPane(ta));
		add(new JLabel("잔액 : "));
		add(tf);
		tf.setText(Integer.toString(money));
		
		ib.addActionListener(new ActionListener() {
					
			public void actionPerformed(ActionEvent e) {
				String howmuch = JOptionPane.showInputDialog("금액을 입력하세요.");
				if(howmuch != null)
					amount = Integer.parseInt(howmuch);
				String what = JOptionPane.showInputDialog("내용을 입력하세요.");
				if(what != null)
					usage = what;				
				money += amount;
				income.add(amount + ", " + what);
				ta.append("+" + amount + ", " + what + "\n");
				tf.setText(Integer.toString(money));
				
			}
		});
		
		eb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String howmuch = JOptionPane.showInputDialog("금액을 입력하세요.");
				if(howmuch != null)
					amount = Integer.parseInt(howmuch);
				String what = JOptionPane.showInputDialog("내용을 입력하세요.");
				if(what != null)
					usage = what;
				money -= amount;
				expense.add(amount + ", " + usage);
				ta.append("-" + amount + ", " + usage + "\n");
				tf.setText(Integer.toString(money));
			}
		});		
		
		wb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Iterator<String> incomeit = income.iterator();
				Iterator<String> expenseit = expense.iterator();
				FileWriter fout = null;
				try {
					fout = new FileWriter(file);
					fout.write("수입\r\n");
					while(incomeit.hasNext()) {
						fout.write(incomeit.next());
						fout.write("\r\n");
					}
					fout.write("\r\n");
					fout.write("지출\r\n");
					while(expenseit.hasNext()) {
						fout.write(expenseit.next());
						fout.write("\r\n");
					}					
					income.clear();
					expense.clear();
					
					fout.write("\r\n");
					fout.write("잔액 : " + money);
					fout.close();
					System.exit(0);
				} catch (IOException e1) {
					System.out.println("입출력 오류");
				}
			}
		});
		
	}
}

