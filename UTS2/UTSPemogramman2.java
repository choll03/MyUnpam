import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UTSPemogramman2 extends JFrame implements ActionListener{

    private JLabel lblNama, lblNilai1, lblNilai2, lblHasil;
    private JTextField txtNilai1, txtNilai2, txtNama, txtHasil;
    private JButton btnTambah, btnHapus;

    public UTSPemogramman2(){
        setTitle("NIM GANJIL");
        setSize(400,200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        lblNama = new JLabel("Nama");
        lblNilai1 = new JLabel("Nilai 1");
        lblNilai2 = new JLabel("Nilai 2");
        lblHasil = new JLabel("Hasil");
        txtNama = new JTextField();
        txtNilai1 = new JTextField();
        txtNilai2 = new JTextField();
        txtHasil = new JTextField();
        btnTambah = new JButton("+");
        btnHapus = new JButton("Hapus");

        lblNama.setBounds(10, 10, 50, 30);
        lblNilai1.setBounds(10, 50, 50, 30);
        lblNilai2.setBounds(10, 90, 50, 30);
        txtNama.setBounds(70, 10, 100, 30);
        txtNilai1.setBounds(70, 50, 100, 30);
        txtNilai2.setBounds(70, 90, 100, 30);
        lblHasil.setBounds(250, 10, 50, 30);
        btnTambah.setBounds(250, 50, 50, 30);
        btnHapus.setBounds(250, 90, 90, 30);
        txtHasil.setBounds(310, 10, 50, 30);

        add(lblNama);
        add(lblNilai1);
        add(lblNilai2);
        add(txtNama);
        add(txtNilai1);
        add(txtNilai2);
        add(lblHasil);
        add(btnTambah);
        add(btnHapus);
        add(txtHasil);
        
        btnTambah.addActionListener(this);
        btnHapus.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnTambah)
        {
            int nilai1 = Integer.parseInt(txtNilai1.getText());
            int nilai2 = Integer.parseInt(txtNilai2.getText());
            int hasil = nilai1 + nilai2;

            txtHasil.setText(Integer.toString(hasil));
        }
        if(e.getSource() == btnHapus)
        {
            txtNama.setText("");
            txtNilai1.setText("");
            txtNilai2.setText("");
            txtHasil.setText("");

            txtNama.requestFocus();
        }
    }


    public static void main(String [] args){
        new UTSPemogramman2().setVisible(true);
    }
}