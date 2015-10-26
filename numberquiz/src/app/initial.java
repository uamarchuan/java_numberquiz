package app;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class initial {


	private JFrame frmNumberquiz;
	private JTextField tMin;
	private JTextField tMax;
	private JTextField tfFirst;
	private JTextField tfSecond;
	private JTextField tfSum;
	private JLabel lbCar;
	private boolean res = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initial window = new initial();
					window.frmNumberquiz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public initial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNumberquiz = new JFrame();
		frmNumberquiz.setTitle("NumberQuiz - весело вчимося!");
		frmNumberquiz.setBounds(100, 100, 600, 450);
		frmNumberquiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNumberquiz.getContentPane().setLayout(null);
		
		JLabel lblHeader = new JLabel("\"Тяжело в учении - легко в бою!\"");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHeader.setForeground(Color.DARK_GRAY);
		lblHeader.setBounds(160, 2, 284, 20);
		frmNumberquiz.getContentPane().add(lblHeader);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 24, 564, 377);
		frmNumberquiz.getContentPane().add(tabbedPane);
		
		JPanel sum = new JPanel();
		tabbedPane.addTab("Додавати", null, sum, null);
		sum.setLayout(null);
		
		JLabel lblLimit = new JLabel("Встановіть діапазон чисел від:");
		lblLimit.setBounds(10, 11, 188, 14);
		sum.add(lblLimit);
		
		tMin = new JTextField();
		tMin.setBounds(197, 8, 40, 20);
		sum.add(tMin);
		tMin.setColumns(10);
		
		JLabel lblLimit2 = new JLabel("до:");
		lblLimit2.setBounds(247, 11, 27, 14);
		sum.add(lblLimit2);
		
		tMax = new JTextField();
		tMax.setColumns(10);
		tMax.setBounds(274, 8, 40, 20);
		sum.add(tMax);
		
		JButton btnStartSum = new JButton("Розпочати");
		btnStartSum.setBounds(10, 36, 393, 23);
		sum.add(btnStartSum);
		
		JButton btnStopSum = new JButton("Завершити");
		btnStopSum.setBounds(413, 36, 136, 23);
		sum.add(btnStopSum);
		
		tfFirst = new JTextField();
		tfFirst.setFont(new Font("Tahoma", Font.BOLD, 35));
		tfFirst.setBounds(27, 98, 80, 47);
		sum.add(tfFirst);
		tfFirst.setColumns(10);
		
		JLabel lbPlus = new JLabel("+");
		lbPlus.setFont(new Font("Tahoma", Font.BOLD, 35));
		lbPlus.setBounds(127, 104, 34, 34);
		sum.add(lbPlus);
		
		tfSecond = new JTextField();
		tfSecond.setFont(new Font("Tahoma", Font.BOLD, 35));
		tfSecond.setColumns(10);
		tfSecond.setBounds(171, 98, 80, 47);
		sum.add(tfSecond);
		
		JLabel lbEqvl = new JLabel("=");
		lbEqvl.setFont(new Font("Tahoma", Font.BOLD, 35));
		lbEqvl.setBounds(266, 104, 34, 34);
		sum.add(lbEqvl);
		
		tfSum = new JTextField();
		tfSum.setFont(new Font("Tahoma", Font.BOLD, 35));
		tfSum.setColumns(10);
		tfSum.setBounds(310, 98, 115, 47);
		sum.add(tfSum);
		
		JButton btnCheckSum = new JButton("Перевірити");
		btnCheckSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				check();
			}
		});
		btnCheckSum.setBounds(443, 110, 104, 23);
		sum.add(btnCheckSum);
		

		
		JLabel lbCar = new JLabel("");
		lbCar.setBounds(10, 159, 136, 168);
		Image imgCar= new ImageIcon(this.getClass().getResource("/car_short.jpg")).getImage();
		lbCar.setIcon(new ImageIcon(imgCar));
		sum.add(lbCar);
		
		
		JLabel lblFinish = new JLabel("");
		Image imgFinish= new ImageIcon(this.getClass().getResource("/finishing_flag_tbn.png")).getImage();
		lblFinish.setIcon(new ImageIcon(imgFinish));
		lblFinish.setBounds(462, 159, 97, 168);
		sum.add(lblFinish);
		
		JPanel minus = new JPanel();
		tabbedPane.addTab("Віднімати", null, minus, null);
		
		JPanel multiply = new JPanel();
		tabbedPane.addTab("Множити", null, multiply, null);
		
		JPanel divide = new JPanel();
		tabbedPane.addTab("Ділити", null, divide, null);
		
	}
	private void check(){
		//lbCar.setBounds(20, 159, 136, 168);

			lbCar.setBounds(lbCar.getX()+10, lbCar.getY(), 136, 168);
				if (res == true) {
					lbCar.setBounds(lbCar.getX()+10, lbCar.getY(), 136, 168);
					lbCar.setBounds(lbCar.getX()+10, lbCar.getY(), 136, 168);
					lbCar.repaint();
				} else {
					lbCar.setBounds(10, 159, 136, 168);
					lbCar.repaint();
				}
		

	};
	
}
