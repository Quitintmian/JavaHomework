package homework3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class StudentSearchView extends JFrame {

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
					StudentSearchView frame = new StudentSearchView();
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
	public StudentSearchView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 65, 439, 241);
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 439, 56);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u5B66\u751F\u59D3\u540D\uFF1A");
		lblNewLabel.setBounds(21, 20, 109, 15);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(129, 17, 124, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentSearchActionPerformed(e);
			}
		});
		btnNewButton.setBounds(275, 16, 68, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u5173\u95ED");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(353, 16, 68, 23);
		panel.add(btnNewButton_1);
	}

	private void StudentSearchActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new File("data.txt"),"utf-8");
			String txt = "";
			while (sc.hasNextLine()) {
				String str = sc.nextLine().trim();
				String[] aa = str.split("\\s+");
				if (aa[0].equals(textField.getText())) {
					String tempLine = "";
					for (int i = 0; i < aa.length; i++) {
						tempLine+=aa[i]+"     ";
					}
					txt+=tempLine+"\n";
				}
			}
			if (txt=="") {
				textArea.setText("查无此人！");
			}else {
				textArea.setText(txt);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
