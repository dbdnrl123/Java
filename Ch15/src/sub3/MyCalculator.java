package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class MyCalculator extends JFrame {

	private JPanel btnDiv;
	private JTextField txtfDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyCalculator() {
		setTitle("MyCalculator v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 390);
		btnDiv = new JPanel();
		btnDiv.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(btnDiv);
		btnDiv.setLayout(null);
		
		txtfDisplay = new JTextField();
		txtfDisplay.setEditable(false);
		txtfDisplay.setFont(new Font("굴림", Font.BOLD, 22));
		txtfDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtfDisplay.setText("0");
		txtfDisplay.setBounds(22, 10, 330, 41);
		btnDiv.add(txtfDisplay);
		txtfDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(22, 61, 60, 60);
		btnDiv.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(113, 61, 60, 60);
		btnDiv.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(204, 61, 60, 60);
		btnDiv.add(btn9);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBounds(292, 61, 60, 60);
		btnDiv.add(btnNewButton_3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(22, 131, 60, 60);
		btnDiv.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(113, 131, 60, 60);
		btnDiv.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(204, 131, 60, 60);
		btnDiv.add(btn6);
		
		JButton btnMulti = new JButton("X");
		btnMulti.setBounds(292, 131, 60, 60);
		btnDiv.add(btnMulti);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(22, 204, 60, 60);
		btnDiv.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(113, 204, 60, 60);
		btnDiv.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(204, 204, 60, 60);
		btnDiv.add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(292, 204, 60, 60);
		btnDiv.add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(22, 274, 60, 60);
		btnDiv.add(btn0);
		
		JButton btnCancle = new JButton("C");
		btnCancle.setBounds(113, 274, 60, 60);
		btnDiv.add(btnCancle);
		
		JButton btnEquls = new JButton("=");
		btnEquls.setBounds(204, 274, 60, 60);
		btnDiv.add(btnEquls);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(292, 274, 60, 60);
		btnDiv.add(btnPlus);
	}

}
