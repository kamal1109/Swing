package Form;
import javax.swing.*;

class Layout extends JFrame {
    JLabel judul = new JLabel ("Data Diri Mahasiswa");
    JLabel jnama = new JLabel ("NAMA");
    JTextField tfNAMA = new JTextField(20);
    JLabel jNIM = new JLabel ("NIM");
    JTextField tfNIM = new JTextField(9);
    JLabel jJENISKEL = new JLabel ("Jenis Kelamin");
    ButtonGroup group = new ButtonGroup();
    JRadioButton L = new JRadioButton ("L");
    JRadioButton Perempuan = new JRadioButton("P");
    JLabel jagama = new JLabel ("AGAMA");
    JLabel jALAMAT = new JLabel ("ALAMAT");String[] tfAGAMA = {"Islam", "Katholik", "Hindu", "Buddha", "Kristen" };
    JComboBox fAGAMA = new JComboBox(tfAGAMA);
    
    JTextField tfalamat = new JTextField(40);
    JTextArea tfALAMAT = new JTextArea();
    JButton tfOK = new JButton("OK");
    
    public Layout(){
        setTitle("Data Diri Mahasiswa");
        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(null);
        add(judul);
        judul.setBounds(230, 50, 150, 30);
        add(jnama);
        jnama.setBounds(150, 80, 100, 60);
        add(tfNAMA);
        tfNAMA.setBounds(230, 100, 200, 25);
        add(jNIM);
        jNIM.setBounds(150, 123, 100, 60);
        add(tfNIM);
        tfNIM.setBounds(230, 140, 200, 25);
        add(jJENISKEL);
        jJENISKEL.setBounds(150, 170, 100, 60);
        add(L);
        L.setBounds(270, 189, 50, 25);
        add(Perempuan);
        Perempuan.setBounds(340, 191, 50, 20);
        add(jagama);
        jagama.setBounds(150, 220, 100, 60);
        add(fAGAMA);
        fAGAMA.setBounds(230, 240, 100, 25);
        add(jALAMAT);
        jALAMAT.setBounds(150, 270, 100, 60);
        add(tfALAMAT);
        tfALAMAT.setBounds(230, 290, 200, 80);
        add(tfOK);
        tfOK.setBounds(350, 390, 80, 25);
        
        setLocationRelativeTo(null);
        
        setSize(600,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  
}
        
public class mainClass {

    public static void main(String[] args) {
        Layout L = new Layout();
    }
    
}
