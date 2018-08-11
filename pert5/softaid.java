import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class softaid extends JFrame implements ActionListener {
    private JMenuItem menuKali, menuBagi, menuKeluar;
    private JLabel lblNama, lblNim;
    private JTextField txtNama, txtNim;
    private JDesktopPane desktop = new JDesktopPane();
    private JMenuBar menuBar = new JMenuBar();
    static public int MainWindowHeight = 500;
    static public int MainWindowWidht = 500;

    public softaid() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("UAS Pemogramman 1");
        setSize(500,500);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getWidth())/2, (Toolkit.getDefaultToolkit().getScreenSize().height - getHeight()) / 2 );
        
        setJMenuBar(menuBar);

        JMenu AccountMenu = new JMenu("File");

        lblNama = new JLabel("Nama");
        lblNim = new JLabel("NIM");
        txtNama = new JTextField("ISMAIL");
        txtNim = new JTextField("2016141807");

        lblNama.setBounds(100, 30, 50, 30);
        lblNim.setBounds(100, 80, 50, 30);
        txtNama.setBounds(170, 30, 150, 30);
        txtNim.setBounds(170, 80, 150, 30);

        menuBar.add(AccountMenu);

        menuKali = new JMenuItem("Kali");
        menuBagi = new JMenuItem("Bagi");
        menuKeluar = new JMenuItem("Keluar");

        AccountMenu.add(menuKali);
        AccountMenu.add(menuBagi);
        AccountMenu.addSeparator();
        AccountMenu.add(menuKeluar);
        
        menuKali.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        menuBagi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));

        menuKali.addActionListener(this);
        menuBagi.addActionListener(this);
        menuKeluar.addActionListener(this);

        desktop.setLayout(null);
        desktop.add(lblNama);
        desktop.add(lblNim);
        desktop.add(txtNama);
        desktop.add(txtNim);
        desktop.setBackground(Color.YELLOW);
        getContentPane().add(desktop, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == (JMenuItem)menuKali) {
            Perkalian kali = new Perkalian();
            desktop.add(kali);
            kali.toFront();
            kali.show();
        }

        if (e.getSource() == (JMenuItem)menuBagi) {
            Pembagian bagi = new Pembagian();
            desktop.add(bagi);
            bagi.toFront();
            bagi.show();
        }

        if (e.getSource() == (JMenuItem)menuKeluar) {
            dispose();
        }
    }

}

/**
 * Perkalian
 */
class Perkalian extends JInternalFrame implements ActionListener {
    private JPanel JP = new JPanel();
    private JLabel lblNilai1, lblNilai2, lblHasil;
    private JTextField txtNilai1, txtNilai2, txtHasil;
    private JButton btnKali, btnHapus;

    Perkalian () {
        super("Perkalian",false, true,false, true);
        setSize(300,220);
        setLocation((softaid.MainWindowWidht - this.getSize().width) / 2, (softaid.MainWindowHeight - this.getSize().height) / 2);
        
        lblNilai1 = new JLabel("Nilai 1");
        lblNilai2 = new JLabel("Nilai 2");
        lblHasil = new JLabel("Hasil");
        txtNilai1 = new JTextField();
        txtNilai2 = new JTextField();
        txtHasil = new JTextField();
        btnKali = new JButton("OK");
        btnHapus = new JButton("Hapus");

        lblNilai1.setBounds(10, 10, 90, 30);
        lblNilai2.setBounds(10, 50, 90, 30);
        txtNilai1.setBounds(110, 10, 150, 30);
        txtNilai2.setBounds(110, 50, 150, 30);
        lblHasil.setBounds(10, 90, 90, 30);
        btnKali.setBounds(10, 130, 70, 30);
        btnHapus.setBounds(90, 130, 70, 30);
        txtHasil.setBounds(110, 90, 150, 30);

        btnKali.addActionListener(this);
        btnHapus.addActionListener(this);

        JP.setLayout(null);

        JP.add(lblNilai1);
        JP.add(lblNilai2);
        JP.add(txtNilai1);
        JP.add(txtNilai2);
        JP.add(lblHasil);
        JP.add(btnKali);
        JP.add(btnHapus);
        JP.add(txtHasil);
        

        getContentPane().add(JP, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == btnKali) {
            if (txtNilai1.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Harap masukan Nilai 1");

                txtNilai1.requestFocus();

            } else if (txtNilai2.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Harap masukan Nilai 2");

                txtNilai2.requestFocus();

            } else {

                int nilai1 = Integer.parseInt(txtNilai1.getText());
                int nilai2 = Integer.parseInt(txtNilai2.getText());
                int hasil = nilai1 * nilai2;

                txtHasil.setText(Integer.toString(hasil));
            }
            
        }

        if (obj == btnHapus)
        {
            txtNilai1.setText("");
            txtNilai2.setText("");
            txtHasil.setText("");

        }
    }
    
}

/**
 * Pembagian
 */
class Pembagian extends JInternalFrame implements ActionListener {
    private JPanel JP = new JPanel();
    private JLabel lblNilai1, lblNilai2, lblHasil;
    private JTextField txtNilai1, txtNilai2, txtHasil;
    private JButton btnBagi, btnHapus;

    Pembagian () {
        super("Pembagian",false, true,false, true);
        setSize(300,220);
        setLocation((softaid.MainWindowWidht - this.getSize().width) / 2, (softaid.MainWindowHeight - this.getSize().height) / 2);
        
        lblNilai1 = new JLabel("Nilai 1");
        lblNilai2 = new JLabel("Nilai 2");
        lblHasil = new JLabel("Hasil");
        txtNilai1 = new JTextField();
        txtNilai2 = new JTextField();
        txtHasil = new JTextField();
        btnBagi = new JButton("OK");
        btnHapus = new JButton("Hapus");

        lblNilai1.setBounds(10, 10, 90, 30);
        lblNilai2.setBounds(10, 50, 90, 30);
        txtNilai1.setBounds(110, 10, 150, 30);
        txtNilai2.setBounds(110, 50, 150, 30);
        lblHasil.setBounds(10, 90, 90, 30);
        btnBagi.setBounds(10, 130, 70, 30);
        btnHapus.setBounds(90, 130, 70, 30);
        txtHasil.setBounds(110, 90, 150, 30);

        btnBagi.addActionListener(this);
        btnHapus.addActionListener(this);

        JP.setLayout(null);

        JP.add(lblNilai1);
        JP.add(lblNilai2);
        JP.add(txtNilai1);
        JP.add(txtNilai2);
        JP.add(lblHasil);
        JP.add(btnBagi);
        JP.add(btnHapus);
        JP.add(txtHasil);
        

        getContentPane().add(JP, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == btnBagi) {
            if (txtNilai1.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Harap masukan Nilai 1");

                txtNilai1.requestFocus();

            } else if (txtNilai2.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Harap masukan Nilai 2");

                txtNilai2.requestFocus();

            } else {

                int nilai1 = Integer.parseInt(txtNilai1.getText());
                int nilai2 = Integer.parseInt(txtNilai2.getText());
                int hasil = nilai1 / nilai2;

                txtHasil.setText(Integer.toString(hasil));
            }
        }

        if (obj == btnHapus)
        {
            txtNilai1.setText("");
            txtNilai2.setText("");
            txtHasil.setText("");

        }
    }
    
}

class win4 {

    public static void main(String[] args) {
        try {
            String myTheme = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
            UIManager.setLookAndFeel(myTheme);
            UIManager.put("nimbusBase", Color.YELLOW);
        } catch (Exception e) {
            System.out.println("tidak dapat membuka UIManager");
        }
        new softaid();
    }
}