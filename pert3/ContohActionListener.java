import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class ContohActionListener extends JFrame implements ActionListener
{
	private JButton btnHitung, btnCLose;
	private JLabel lblOpr, lblHasil;
	private JTextField text1, text2;

	public ContohActionListener()
	{
		setTitle("PENJUMLAHAN");
		setSize(300,170);
		setLayout(new GridLayout(2,3));
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);

		btnHitung = new JButton("HITUNG");
		btnCLose = new JButton("KELUAR");

		lblHasil = new JLabel();
		lblOpr = new JLabel("          + ");

		text1 = new JTextField();
		text2 = new JTextField();

		add(text1);
		add(lblOpr);
		add(text2);
		add(lblHasil);
		add(btnHitung);
		add(btnCLose);

		btnHitung.addActionListener(this);
		btnCLose.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnCLose){
			dispose();
		}
		if(e.getSource() == btnHitung){
			int a, b, c;
			a = Integer.parseInt(text1.getText());
			b= Integer.parseInt(text2.getText());

			c = a + b;

			lblHasil.setText(Integer.toString(c));
		}
	}

	public static void main(String [] args)
	{
		ContohActionListener tes = new ContohActionListener();
		tes.setVisible(true);
	}

}