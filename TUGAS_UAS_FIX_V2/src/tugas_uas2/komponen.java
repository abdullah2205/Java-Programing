package tugas_uas2;

import static java.awt.Color.red;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.TableColumnModel;

public class komponen 
{   
    static JFrame frame;
    static JLabel judul1 = new JLabel("Data Mahasiswa");
    static JLabel A_nama = new JLabel("Nama : ");
    static JLabel A_npm = new JLabel("NPM   : ");
    static JTextField isi_nama = new JTextField();
    static JTextField isi_npm = new JTextField();
    static JLabel judul2 = new JLabel("Panel Input");
    static JComboBox matkulList = new JComboBox(utama.matkul);
    static JLabel B_nilai = new JLabel("Nilai    : ");
    static JTextField isi_nilai = new JTextField();
    static JButton addButton = new JButton("Add");
    static JLabel judul3 = new JLabel("Hasil Index Prestasi");
    static JLabel C_nama = new JLabel(" ");
    static JLabel C_npm = new JLabel(" ");
    static JLabel C_sksTotal = new JLabel("SKS-Total   :   ");
    static JLabel C_isi_sksTotal = new JLabel("............");
    static JLabel C_ipk = new JLabel("IPK       : ");
    static JLabel C_isi_ipk = new JLabel("............");
    static JButton prosesButton = new JButton("Proses Hitung");
    static JCheckBox checkBox1 = new JCheckBox(" Show Plot");
    static JLabel judul4 = new JLabel("Konfersi Nilai");
    static JLabel n1 = new JLabel("A (4)    = 81-100");
    static JLabel n2 = new JLabel("B+ (3.5) = 71-80");
    static JLabel n3 = new JLabel("B (3)    = 66-70");
    static JLabel n4 = new JLabel("C (2.5)  = 56-65");
    static JLabel n5 = new JLabel("D (2)    = 41-55");
    static JLabel n6 = new JLabel("E (0)    = 0-40");
    
    static JTable tabel_nilai= new JTable(utama.tabel,utama.judul_tabel);
    static JScrollPane sp= new JScrollPane(tabel_nilai);
    
    static JPanel pp = new JPanel();
    static JLabel ll = new JLabel("Centang 'Show Plot' untuk menampilkan Diagram");
    
    
    public void tampil()
    {
        frame = new JFrame("Aplikasi Index Prestasi Abdull-Fatkhur");
        frame.setSize(945,490);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //biar langsung keluar
        frame.add(judul1);
        frame.add(A_nama);
        frame.add(A_npm);
        frame.add(judul2);
        frame.add(judul3);
        frame.add(judul4);
        frame.add(isi_nama);
        frame.add(isi_npm);
        frame.add(matkulList);
        frame.add(addButton);
        frame.add(B_nilai);
        frame.add(isi_nilai);
        frame.add(C_nama);
        frame.add(C_npm);
        frame.add(C_sksTotal);
        frame.add(C_isi_sksTotal);
        frame.add(C_ipk);
        frame.add(C_isi_ipk);
        frame.add(prosesButton);
        frame.add(checkBox1);
        frame.add(n1);
        frame.add(n2);
        frame.add(n3);
        frame.add(n4);
        frame.add(n5);
        frame.add(n6);
        frame.add(sp);
        
        frame.add(pp);
        frame.add(ll);
//======================================================================
        judul1.setBounds(20,10,100,20);
        A_nama.setBounds(26,40,50,20);
        A_npm.setBounds(26,65,50,20);
        judul2.setBounds(20,100,100,20);
        judul3.setBounds(20,190,100,20);
        judul4.setBounds(240,210,100,20);
        n1.setBounds(250,240,100,17);
        n2.setBounds(250,260,100,17);
        n3.setBounds(250,280,100,17);
        n4.setBounds(250,300,100,17);
        n5.setBounds(250,320,100,17);
        n6.setBounds(250,340,100,17);
        judul1.setFont(new java.awt.Font(Font.SANS_SERIF,0,11));
        judul2.setFont(new java.awt.Font(Font.SANS_SERIF,0,11));
        judul3.setFont(new java.awt.Font(Font.SANS_SERIF,0,11));
        judul4.setFont(new java.awt.Font(Font.SANS_SERIF,0,11));
        n1.setFont(new java.awt.Font(Font.SANS_SERIF,0,11));
        n2.setFont(new java.awt.Font(Font.SANS_SERIF,0,11));
        n3.setFont(new java.awt.Font(Font.SANS_SERIF,0,11));
        n4.setFont(new java.awt.Font(Font.SANS_SERIF,0,11));
        n5.setFont(new java.awt.Font(Font.SANS_SERIF,0,11));
        n6.setFont(new java.awt.Font(Font.SANS_SERIF,0,11));
        isi_nama.setBounds(70,40,170,20);
        isi_npm.setBounds(70,65,170,20);
        matkulList.setBounds(26,130,213,20);
        addButton.setBounds(250,130,70,20);
        B_nilai.setBounds(26,155,50,20);
        isi_nilai.setBounds(70,155,170,20);
        C_nama.setBounds(26,220,200,20);
        C_npm.setBounds(26,245,100,20);
        C_sksTotal.setBounds(26,275,300,20);
        C_isi_sksTotal.setBounds(100,275,300,20);
        C_ipk.setBounds(26,300,50,20);
        C_isi_ipk.setBounds(100,300,100,20);
        prosesButton.setBounds(26,350,140,20);
        checkBox1.setBounds(270,390,90,20);
        
        sp.setBounds(400,30,500,145);
        tabel_nilai.setRowHeight(20);
        TableColumnModel ass = tabel_nilai.getColumnModel();
        ass.getColumn(0).setPreferredWidth(10);
        ass.getColumn(1).setPreferredWidth(120);
        ass.getColumn(2).setPreferredWidth(40);
        ass.getColumn(3).setPreferredWidth(60);
        ass.getColumn(4).setPreferredWidth(70);
        
        pp.setBounds(370,200,540, 230);
//        pp.setBackground(green);
        pp.setVisible(false);
        
        ll.setBounds(500,300,280,20);
        ll.setForeground(red);
        

    }
    
}
