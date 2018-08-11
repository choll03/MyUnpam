import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BelajarFrame
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();
		frame.setTitle("belajar Java");
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);


		JLabel label = new JLabel("MASUKAN NIM");
		frame.setLayout(null);
		frame.add(label);
		label.setBounds(10,20,150,30);

		JTextField textfield = new JTextField();
		frame.add(textfield);
		textfield.setBounds(100,20,150,30);

		JButton button = new JButton("Simpan");
		frame.add(button);
		button.setBounds(250,20,100,30);


	}
}