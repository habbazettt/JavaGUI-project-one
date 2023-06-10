package javaapplication4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JavaApplication4 implements ActionListener{
    
    public static void main(String[] args) {
        new JavaApplication4();
    }
    
    public JavaApplication4() {
        initComponent();
    }
    
    private void initComponent() {
        // CONTAINER
        // Container
        JFrame f = new JFrame("Java GUI");
        
        // Ukuran Form
        f.setSize(400, 500);
        
        // Mengatur Fungsi Close Form
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Posisi Pojok Kanan Atas
        // Agar Pindah Ke Tengah
        f.setLocationRelativeTo(null);
        
        // Mengatur Layout scr Manual
        f.setLayout(null);
        
        // Menampilkan Form
        f.setVisible(true);
        // CONTAINER
        
        // COMPONENT
        // Membuat Objek Component
        JLabel labelJudul = new JLabel("Aplikasi Perpustakaan");
        // Mengatur Posisi dan Ukuran
        labelJudul.setBounds(120, 20, 200, 30);
        // Memasukkan Component ke Container
        f.add(labelJudul);
        // COMPONENT
        
        // Bagian Kode Buku
        JLabel kodeBuku = new JLabel("Kode Buku");
        kodeBuku.setBounds(20, 80, 150, 25);
        f.add(kodeBuku);      
        JTextField txtKodeBuku = new JTextField();
        txtKodeBuku.setBounds(150, 80,150, 25);
        f.add(txtKodeBuku);
        
        // Bagian Nama Buku
        JLabel namaBuku = new JLabel("Nama Buku");
        namaBuku.setBounds(20, 110, 150, 25);
        f.add(namaBuku);
        JTextField txtNamaBuku = new JTextField();
        txtNamaBuku.setBounds(150, 110,150, 25);
        f.add(txtNamaBuku);
        
        // Bagian Membership
        JLabel member = new JLabel("Membership");
        member.setBounds(20, 140, 150, 25);
        f.add(member);
        
        JRadioButton radioEksklusif = new JRadioButton();
        radioEksklusif.setText("Eksklusif");
        radioEksklusif.setBounds(150, 140, 100,25);
        
        JRadioButton radioUmum = new JRadioButton();
        radioUmum.setText("Umum");
        radioUmum.setBounds(250, 140, 100,25);
        
        f.add(radioEksklusif);
        f.add(radioUmum);
        
        ButtonGroup groupMember = new ButtonGroup();
        groupMember.add(radioEksklusif);
        groupMember.add(radioUmum);
        
        // Bagian Biaya Per Hari
        JLabel labelBiaya = new JLabel();
        labelBiaya.setText("Biaya Per Hari");
        labelBiaya.setBounds(20, 170, 150, 25);
        f.add(labelBiaya);
        JTextField txtBiaya = new JTextField();
        txtBiaya.setBounds(150, 170,150, 25);
        f.add(txtBiaya);
        
        // Bagian Tanggal Pinjam
        JLabel labelTanggal = new JLabel();
        labelTanggal.setText("Tanggal Pinjam");
        labelTanggal.setBounds(20, 200, 150, 25);
        f.add(labelTanggal);
        
        // ComboBox Tanggal - Hari
        String hari[] = new String[31];
        for (int i = 0; i < hari.length; i++) {
            hari[i] = Integer.toString(i+1);
        }
        JComboBox cbHari = new JComboBox(hari);
        cbHari.setBounds(150, 200, 40, 25);
        f.add(cbHari);
        
        // ComboBox Tanggal - Bulan
        String bulan[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        JComboBox cbBulan = new JComboBox(bulan);
        cbBulan.setBounds(200, 200, 55, 25);
        f.add(cbBulan);
        
        // TextField Tanggal - Tahun
        JTextField txtTahun = new JTextField();
        txtTahun.setBounds(265, 200,45, 25);
        f.add(txtTahun);
        
        // Bagian Lama Pinjam
        JLabel lamaPinjam = new JLabel("Lama Pinjam");
        lamaPinjam.setBounds(20,230,150,25);
        f.add(lamaPinjam);
        
        // ComboBox Lama Pinjam
        String lama[] = {"1", "2", "3", "4", "5", "6", "7"};
        JComboBox cbLama = new JComboBox(lama);
        cbLama.setBounds(150, 230, 70, 25);
        f.add(cbLama);
        
        // Bagian Total Biaya
        JLabel totalBiaya = new JLabel("Total Biaya");
        totalBiaya.setBounds(20, 260, 150, 25);
        f.add(totalBiaya);
        JTextField txtTotalBiaya = new JTextField();
        txtTotalBiaya.setBounds(150, 260, 150, 25);
        f.add(txtTotalBiaya);
        
        // Bagian Jumlah Bayar
        JLabel jumlahBayar = new JLabel("Jumlah Bayar");
        jumlahBayar.setBounds(20, 290, 150, 25);
        f.add(jumlahBayar);
        JTextField txtjumlahBayar = new JTextField();
        txtjumlahBayar.setBounds(150, 290, 150, 25);
        f.add(txtjumlahBayar);
        
        // Bagian Kembalian
        JLabel kembalian = new JLabel("Kembalian");
        kembalian.setBounds(20, 320, 150, 25);
        f.add(kembalian);
        JTextField txtkembalian = new JTextField();
        txtkembalian.setBounds(150, 320, 150, 25);
        f.add(txtkembalian);
        
        // Bagian Button - Simpan
        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(150, 360, 80, 25);
        f.add(btnSimpan);
        
        // Bagian Button - Reset
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(240,360,80,25);
        f.add(btnReset);
        
        // Blok Event
        btnSimpan.addActionListener(this);
        btnReset.addActionListener(this);
        
        btnSimpan.setActionCommand("Simpan");
        btnReset.setActionCommand("Reset");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch(command) {
            case "Simpan":
                JOptionPane.showMessageDialog(null, "Data Tersimpan");
                break;
            case "Reset":
                JOptionPane.showMessageDialog(null, "Reset Berhasil");
                break;
            default:
                System.out.println("Tidak Ada");
        }
    }
    
}
