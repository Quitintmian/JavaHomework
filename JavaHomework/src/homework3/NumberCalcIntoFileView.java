package homework3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;

public class NumberCalcIntoFileView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberCalcIntoFileView frame = new NumberCalcIntoFileView();
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
	public NumberCalcIntoFileView() {
		setTitle("\u67E5\u8BE2\u7A97\u53E3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u6574\u6570\uFF1A");
		lblNewLabel.setBounds(62, 52, 73, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(142, 49, 107, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(41, 94, 283, 123);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("\u8BA1\u7B97");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumberCalcActionPerformed(e);
			}
		});
		btnNewButton.setBounds(59, 237, 73, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4FDD\u5B58");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumberSavedActionPerformed(e);
			}
		});
		btnNewButton_1.setBounds(142, 237, 73, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5173\u95ED");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(228, 237, 73, 23);
		contentPane.add(btnNewButton_2);
	}

	private void NumberSavedActionPerformed(ActionEvent evt) {
		String info = textArea.getText();
		try {
			FileOutputStream fos = new FileOutputStream("js.dat");
			byte[] bt = info.getBytes();
			fos.write(bt);
			JOptionPane.showMessageDialog(null, "保存成功！");
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void NumberCalcActionPerformed(ActionEvent evt) {
		int num = Integer.parseInt((textField.getText()));
		int jishupingfanghe = 0;
		int oushupingfanghe = 0;
		int jishugeshu = 0;
		int oushugeshu = 0;
		for (int i = 1; i <= num; i++) {
			if (i%2==0) { //偶数
				oushupingfanghe+=i*i;
				oushugeshu++;
			}else {
				jishupingfanghe+=i*i;
				jishugeshu++;
			}
		}
		String str = "1到"+num+"之间所有奇数平方和：";
		str+=jishupingfanghe+"\n奇数个数：";
		str+=jishugeshu+"\n偶数平方和：";
		str+=oushupingfanghe+"\n偶数个数：";
		str+=oushugeshu;
		textArea.setText(str);
	}

}
