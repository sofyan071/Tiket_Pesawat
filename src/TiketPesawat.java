/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class TiketPesawat extends javax.swing.JFrame {

    /**
     * Creates new form pesawat
     */
    public TiketPesawat() {
        initComponents();
    }
    String nomor, t1, t2, b1, b2, T1, T2, kelas, Cetak;
    int a, b, c, d, e, f, g, h, i, j, k, l;
    
    public void NomorPenerbangan(){
        if (noPenerbangan.getSelectedItem().equals("Pilih")){
            dari.setText("");
            ke.setText("");
            }
        if (noPenerbangan.getSelectedItem().equals("01-JB-001")){
            dari.setText("Jakarta");
            ke.setText("Bandung");
        }
        if (noPenerbangan.getSelectedItem().equals("02-BS-002")){
            dari.setText("Bandung");
            ke.setText("Surabaya");
        }
        if (noPenerbangan.getSelectedItem().equals("03-SP-003")){
            dari.setText("Surabaya");
            ke.setText("Palembang");
        }
        if (noPenerbangan.getSelectedItem().equals("04-PJ-004")){
            dari.setText("Palembang");
            ke.setText("Jayapura");
        }
        if (noPenerbangan.getSelectedItem().equals("05-JL-005")){
            dari.setText("Jayapura");
            ke.setText("Lombok");
        }
    }

    public void Kelas(){
        if (bisnis.isSelected()){
            if (noPenerbangan.getSelectedItem().equals("Pilih")){
                harga.setText("0");
            }
            if (noPenerbangan.getSelectedItem().equals("01-JB-001")){
                harga.setText("500000");
            }
            if (noPenerbangan.getSelectedItem().equals("02-BS-002")){
                harga.setText("700000");
            }
            if (noPenerbangan.getSelectedItem().equals("03-SP-003")){
                harga.setText("1000000");
            }
            if (noPenerbangan.getSelectedItem().equals("04-PJ-004")){
                harga.setText("2000000");
            }
            if (noPenerbangan.getSelectedItem().equals("05-JL-005")){
                harga.setText("1500000");
            }
        }
       
        if (ekonomi.isSelected()){
            if (noPenerbangan.getSelectedItem().equals("Pilih")){
                harga.setText("0");
            }
            if (noPenerbangan.getSelectedItem().equals("01-JB-001")){
                harga.setText("350000");
            }
            if (noPenerbangan.getSelectedItem().equals("02-BS-002")){
                harga.setText("600000");
            }
            if (noPenerbangan.getSelectedItem().equals("03-SP-003")){
                harga.setText("800000");
            }
            if (noPenerbangan.getSelectedItem().equals("04-PJ-004")){
                harga.setText("1700000");
            }
            if (noPenerbangan.getSelectedItem().equals("05-JL-005")){
                harga.setText("1200000");
            }
        }
    }

    public void Hitung(){
        if(harga.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Pilih Kelas Penerbangan", "Error" ,JOptionPane.ERROR_MESSAGE);
            totalHarga.setText("");
        }if(jumlah.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Masukkan Jumlah Tiket", "Error" ,JOptionPane.ERROR_MESSAGE);
            totalHarga.setText("");
        }else{
        e=Integer.parseInt(harga.getText());
        f=Integer.parseInt(jumlah.getText());
        g=e*f;
        totalHarga.setText(""+g);
        }
    }

    public void Diskon(){
        if(diskon.isSelected()){
            i=g/20;
            j=g-i;
            totalHarga.setText(""+j);
        }else{
            totalHarga.setText(""+g);
        }
    }

    public void Cetak(){
    h=JOptionPane.showConfirmDialog(null, "Cetak tiket?", "Cetak", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if (h==JOptionPane.YES_OPTION){
      if (noPenerbangan.getSelectedItem()=="Pilih"){
         nomor="";
     }else if(noPenerbangan.getSelectedItem()=="01-JB-001"){
         nomor="01-JB-001";
     }else if(noPenerbangan.getSelectedItem()=="02-BS-002"){
         nomor="02-BS-002";
     }else if(noPenerbangan.getSelectedItem()=="03-SP-003"){
         nomor="03-SP-003";
     }else if(noPenerbangan.getSelectedItem()=="04-PJ-004"){
         nomor="04-PJ-004";
     }else if(noPenerbangan.getSelectedItem()=="05-JL-005"){
         nomor="05-JL-005";
     }
                    if (tanggal.getSelectedItem().equals("Pilih")){
                        t1="";
                    }else if (tanggal.getSelectedItem().equals("1")){
                        t1="1";
                    }else if (tanggal.getSelectedItem().equals("2")){
                        t1="2";
                    }else if (tanggal.getSelectedItem().equals("3")){
                        t1="3";
                    }else if (tanggal.getSelectedItem().equals("4")){
                        t1="4";
                    }else if (tanggal.getSelectedItem().equals("5")){
                        t1="5";
                    }else if (tanggal.getSelectedItem().equals("6")){
                        t1="6";
                    }else if (tanggal.getSelectedItem().equals("7")){
                        t1="7";
                    }else if (tanggal.getSelectedItem().equals("8")){
                        t1="8";
                    }else if (tanggal.getSelectedItem().equals("9")){
                        t1="9";
                    }else if (tanggal.getSelectedItem().equals("10")){
                        t1="10";
                    }else if (tanggal.getSelectedItem().equals("11")){
                        t1="11";
                    }else if (tanggal.getSelectedItem().equals("12")){
                        t1="12";
                    }else if (tanggal.getSelectedItem().equals("13")){
                        t1="13";
                    }else if (tanggal.getSelectedItem().equals("14")){
                        t1="14";
                    }else if (tanggal.getSelectedItem().equals("15")){
                        t1="15";
                    }else if (tanggal.getSelectedItem().equals("16")){
                        t1="16";
                    }else if (tanggal.getSelectedItem().equals("17")){
                        t1="17";
                    }else if (tanggal.getSelectedItem().equals("18")){
                        t1="18";
                    }else if (tanggal.getSelectedItem().equals("19")){
                        t1="19";
                    }else if (tanggal.getSelectedItem().equals("20")){
                        t1="20";
                    }else if (tanggal.getSelectedItem().equals("21")){
                        t1="21";
                    }else if (tanggal.getSelectedItem().equals("22")){
                        t1="22";
                    }else if (tanggal.getSelectedItem().equals("23")){
                        t1="23";
                    }else if (tanggal.getSelectedItem().equals("24")){
                        t1="24";
                    }else if (tanggal.getSelectedItem().equals("25")){
                        t1="25";
                    }else if (tanggal.getSelectedItem().equals("26")){
                        t1="26";
                    }else if (tanggal.getSelectedItem().equals("27")){
                        t1="27";
                    }else if (tanggal.getSelectedItem().equals("28")){
                        t1="28";
                    }else if (tanggal.getSelectedItem().equals("29")){
                        t1="29";
                    }else if (tanggal.getSelectedItem().equals("30")){
                        t1="30";
                    }else if (tanggal.getSelectedItem().equals("31")){
                        t1="31";
                    }
                    if (bulan.getSelectedItem().equals("Pilih")){
                        b1="";
                    }else if(bulan.getSelectedItem().equals("Januari")){
                        b1="Januari";
                    }else if(bulan.getSelectedItem().equals("Februari")){
                        b1="Februari";
                    }else if(bulan.getSelectedItem().equals("Maret")){
                        b1="Maret";
                    }else if(bulan.getSelectedItem().equals("April")){
                        b1="April";
                    }else if(bulan.getSelectedItem().equals("Mei")){
                        b1="Mei";
                    }else if(bulan.getSelectedItem().equals("Juni")){
                        b1="Juni";
                    }else if(bulan.getSelectedItem().equals("Juli")){
                        b1="Juli";
                    }else if(bulan.getSelectedItem().equals("Agustus")){
                        b1="Agustus";
                    }else if(bulan.getSelectedItem().equals("September")){
                        b1="September";
                    }else if(bulan.getSelectedItem().equals("Oktober")){
                        b1="Oktober";
                    }else if(bulan.getSelectedItem().equals("November")){
                        b1="November";
                    }else if(bulan.getSelectedItem().equals("Desember")){
                        b1="Desember";
                    }
                        if (tahun.getSelectedItem().equals("Pilih")){
                        T1="";
                    }else if (tahun.getSelectedItem().equals("2020")){
                        T1="2020";
                    }else if (tahun.getSelectedItem().equals("2019")){
                        T1="2019";
                    }else if (tahun.getSelectedItem().equals("2018")){
                        T1="2018";
                    }else if (tahun.getSelectedItem().equals("2017")){
                        T1="2017";
                    }else if (tahun.getSelectedItem().equals("2016")){
                        T1="2016";
                    }else if (tahun.getSelectedItem().equals("2015")){
                        T1="2015";
                    }else if (tahun.getSelectedItem().equals("2014")){
                        T1="2014";
                    }else if (tahun.getSelectedItem().equals("2013")){
                        T1="2013";
                    }else if (tahun.getSelectedItem().equals("2012")){
                        T1="2012";
                    }else if (tahun.getSelectedItem().equals("2011")){
                        T1="2011";
                    }else if (tahun.getSelectedItem().equals("2010")){
                        T1="2010";
                    }
                     if (tanggal2.getSelectedItem().equals("Pilih")){
                        t2="";
                    }else if (tanggal2.getSelectedItem().equals("1")){
                        t2="1";
                    }else if (tanggal2.getSelectedItem().equals("2")){
                        t2="2";
                    }else if (tanggal2.getSelectedItem().equals("3")){
                        t2="3";
                    }else if (tanggal2.getSelectedItem().equals("4")){
                        t2="4";
                    }else if (tanggal2.getSelectedItem().equals("5")){
                        t2="5";
                    }else if (tanggal2.getSelectedItem().equals("6")){
                        t2="6";
                    }else if (tanggal2.getSelectedItem().equals("7")){
                        t2="7";
                    }else if (tanggal2.getSelectedItem().equals("8")){
                        t2="8";
                    }else if (tanggal2.getSelectedItem().equals("9")){
                        t2="9";
                    }else if (tanggal2.getSelectedItem().equals("10")){
                        t2="10";
                    }else if (tanggal2.getSelectedItem().equals("11")){
                        t2="11";
                    }else if (tanggal2.getSelectedItem().equals("12")){
                        t2="12";
                    }else if (tanggal2.getSelectedItem().equals("13")){
                        t2="13";
                    }else if (tanggal2.getSelectedItem().equals("14")){
                        t2="14";
                    }else if (tanggal2.getSelectedItem().equals("15")){
                        t2="15";
                    }else if (tanggal2.getSelectedItem().equals("16")){
                        t2="16";
                    }else if (tanggal2.getSelectedItem().equals("17")){
                        t2="17";
                    }else if (tanggal2.getSelectedItem().equals("18")){
                        t2="18";
                    }else if (tanggal2.getSelectedItem().equals("19")){
                        t2="19";
                    }else if (tanggal2.getSelectedItem().equals("20")){
                        t2="20";
                    }else if (tanggal2.getSelectedItem().equals("21")){
                        t2="21";
                    }else if (tanggal2.getSelectedItem().equals("22")){
                        t2="22";
                    }else if (tanggal2.getSelectedItem().equals("23")){
                        t2="23";
                    }else if (tanggal2.getSelectedItem().equals("24")){
                        t2="24";
                    }else if (tanggal2.getSelectedItem().equals("25")){
                        t2="25";
                    }else if (tanggal2.getSelectedItem().equals("26")){
                        t2="26";
                    }else if (tanggal2.getSelectedItem().equals("27")){
                        t2="27";
                    }else if (tanggal2.getSelectedItem().equals("28")){
                        t2="28";
                    }else if (tanggal2.getSelectedItem().equals("29")){
                        t2="29";
                    }else if (tanggal2.getSelectedItem().equals("30")){
                        t2="30";
                    }else if (tanggal2.getSelectedItem().equals("31")){
                        t2="31";
                    }
                    if (bulan2.getSelectedItem().equals("Pilih")){
                        b2="";
                    }else if (bulan2.getSelectedItem().equals("Januari")){
                        b2="Januari";
                    }else if(bulan2.getSelectedItem().equals("Februari")){
                        b2="Februari";
                    }else if(bulan2.getSelectedItem().equals("Maret")){
                        b2="Maret";
                    }else if(bulan2.getSelectedItem().equals("April")){
                        b2="April";
                    }else if(bulan2.getSelectedItem().equals("Mei")){
                        b2="Mei";
                    }else if(bulan2.getSelectedItem().equals("Juni")){
                        b2="Juni";
                    }else if(bulan2.getSelectedItem().equals("Juli")){
                        b2="Juli";
                    }else if(bulan2.getSelectedItem().equals("Agustus")){
                        b2="Agustus";
                    }else if(bulan2.getSelectedItem().equals("September")){
                        b2="September";
                    }else if(bulan2.getSelectedItem().equals("Oktober")){
                        b2="Oktober";
                    }else if(bulan2.getSelectedItem().equals("November")){
                        b2="November";
                    }else if(bulan2.getSelectedItem().equals("Desember")){
                        b2="Desember";
                    }
                        if (tahun2.getSelectedItem().equals("Pilih")){
                        T2="";
                    }else if (tahun2.getSelectedItem().equals("2030")){
                        T2="2030";
                    }else if (tahun2.getSelectedItem().equals("2029")){
                        T2="2029";
                    }else if (tahun2.getSelectedItem().equals("2028")){
                        T2="2028";
                    }else if (tahun2.getSelectedItem().equals("2027")){
                        T2="2027";
                    }else if (tahun2.getSelectedItem().equals("2026")){
                        T2="2026";
                    }else if (tahun2.getSelectedItem().equals("2025")){
                        T2="2025";
                    }else if (tahun2.getSelectedItem().equals("2024")){
                        T2="2024";
                    }else if (tahun2.getSelectedItem().equals("2023")){
                        T2="2022";
                    }else if (tahun2.getSelectedItem().equals("2021")){
                        T2="2021";
                    }else if (tahun2.getSelectedItem().equals("2020")){
                        T2="2020";
                    }else if (tahun2.getSelectedItem().equals("2019")){
                        T2="2019";
                    }else if (tahun2.getSelectedItem().equals("2018")){
                        T2="2018";
                    }else if (tahun2.getSelectedItem().equals("2017")){
                        T2="2017";
                    }
                     if (bisnis.isSelected()){
                         kelas=bisnis.getText();
                     }
                     if (ekonomi.isSelected()){
                         kelas=ekonomi.getText();
                     }
                      Cetak="No.Penerbangan : "+nomor+"\nRute : "+dari.getText()+" - "+ke.getText()+"\nJadwal Keberangkatan : "+t1+" "+b1+" "+T1+"\nJadwal Kedatangan : "+t2+" "+b2+" "+T2+"\nKelas Penerbangan : "+kelas+"\nHarga Tiket : Rp."+harga.getText()+"\nJumlah Tiket : "+jumlah.getText()+" Tiket"+"\nDengan Potongan Sebesar : Rp."+i+"\nTotal Harga Tiket Pesanan Anda : Rp."+totalHarga.getText()+"\n\nThankyou so much and enjoyed your ride ^_^";
                    JOptionPane.showMessageDialog(null, Cetak ,"Data Pemesanan Tiket Pesawat" ,JOptionPane.INFORMATION_MESSAGE);
                }
        if (h==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Silahkan periksa kembali","Cek",JOptionPane.INFORMATION_MESSAGE);
        }
        }

    public void Refresh(){
            noPenerbangan.setSelectedItem("Pilih");
            dari.setText("");
            ke.setText("");
            tanggal.setSelectedItem("Pilih");
            tanggal2.setSelectedItem("Pilih");
            bulan.setSelectedItem("Pilih");
            bulan2.setSelectedItem("Pilih");
            tahun.setSelectedItem("Pilih");
            tahun2.setSelectedItem("Pilih");
            Group.clearSelection();
            harga.setText("");
            jumlah.setText("");
            totalHarga.setText("");
            diskon.setSelected(false);
            JOptionPane.showMessageDialog(null, "Data telah ter-refresh" ,"Refresh",JOptionPane.INFORMATION_MESSAGE);
    }

    public void Exit(){
        l=JOptionPane.showConfirmDialog(null, "Apakah anda yakin"
                ,"Exit" ,JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (l==JOptionPane.YES_OPTION){
            dispose();
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group = new javax.swing.ButtonGroup();
        Popup = new javax.swing.JPopupMenu();
        Refresh = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        dari = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ke = new javax.swing.JTextField();
        noPenerbangan = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tanggal = new javax.swing.JComboBox();
        tanggal2 = new javax.swing.JComboBox();
        bulan = new javax.swing.JComboBox();
        bulan2 = new javax.swing.JComboBox();
        tahun = new javax.swing.JComboBox();
        tahun2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        bisnis = new javax.swing.JRadioButton();
        Group.add(bisnis);
        ekonomi = new javax.swing.JRadioButton();
        Group.add(ekonomi);
        harga = new javax.swing.JLabel();
        rp = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jumlah = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        totalHarga = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        cetak = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        diskon = new javax.swing.JCheckBox();

        Refresh.setText("jMenuItem1");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        Popup.add(Refresh);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jLabel1.setText("Pemesanan Tiket Pesawat");

        dari.setText("No. Penerbangan");

        jLabel3.setText("Rute");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        noPenerbangan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        noPenerbangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noPenerbanganActionPerformed(evt);
            }
        });

        jLabel4.setText("Tangal");

        jLabel5.setText("Keberangkatan");

        jLabel6.setText("Kepulangan");

        tanggal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });

        tanggal2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bulan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulanActionPerformed(evt);
            }
        });

        bulan2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tahun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tahun2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Kelas");

        bisnis.setText("Bisnis");
        bisnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bisnisActionPerformed(evt);
            }
        });

        ekonomi.setText("Ekonomi");
        ekonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekonomiActionPerformed(evt);
            }
        });

        harga.setText("Harga");

        rp.setText("Rp.");

        jumlah.setText("Jumlah");

        jLabel11.setText("Tiket");

        totalHarga.setText("Total Harga");

        jLabel13.setText("Rp.");

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        cetak.setText("Cetak");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jTextField6.setText("*) Diskon berlaku jika Total Harga lebih dari Rp. 5.000.000");

        diskon.setText("Diskon 5 %");
        diskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dari, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ke)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noPenerbangan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(239, 239, 239))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tanggal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bulan2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tahun2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bisnis)
                                        .addGap(18, 18, 18)
                                        .addComponent(ekonomi))
                                    .addComponent(harga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jumlah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(219, 219, 219))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addComponent(jTextField3)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hitung))
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(diskon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit)
                    .addComponent(cetak))
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dari)
                    .addComponent(noPenerbangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tahun2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bulan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanggal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(bisnis)
                            .addComponent(ekonomi))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(harga)
                            .addComponent(rp)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlah)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalHarga)
                            .addComponent(jLabel13)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hitung)
                            .addComponent(cetak)
                            .addComponent(diskon))
                        .addGap(18, 18, 18)
                        .addComponent(exit))
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void noPenerbanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noPenerbanganActionPerformed
        // TODO add your handling code here:
        NomorPenerbangan();
    }//GEN-LAST:event_noPenerbanganActionPerformed

    private void bisnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bisnisActionPerformed
        // TODO add your handling code here:
        Kelas();
    }//GEN-LAST:event_bisnisActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        Hitung();
    }//GEN-LAST:event_hitungActionPerformed

    private void bulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulanActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        Refresh();
    }//GEN-LAST:event_RefreshActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            Popup.show(this,evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseReleased

    private void ekonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekonomiActionPerformed
        // TODO add your handling code here:
        Kelas();
    }//GEN-LAST:event_ekonomiActionPerformed

    private void diskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diskonActionPerformed
        // TODO add your handling code here:
        Diskon();
    }//GEN-LAST:event_diskonActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        // TODO add your handling code here:
        Cetak();
    }//GEN-LAST:event_cetakActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        Exit();
    }//GEN-LAST:event_exitActionPerformed

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiketPesawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group;
    private javax.swing.JPopupMenu Popup;
    private javax.swing.JMenuItem Refresh;
    private javax.swing.JRadioButton bisnis;
    private javax.swing.JComboBox bulan;
    private javax.swing.JComboBox bulan2;
    private javax.swing.JButton cetak;
    private javax.swing.JLabel dari;
    private javax.swing.JCheckBox diskon;
    private javax.swing.JRadioButton ekonomi;
    private javax.swing.JButton exit;
    private javax.swing.JLabel harga;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel jumlah;
    private javax.swing.JTextField ke;
    private javax.swing.JComboBox noPenerbangan;
    private javax.swing.JLabel rp;
    private javax.swing.JComboBox tahun;
    private javax.swing.JComboBox tahun2;
    private javax.swing.JComboBox tanggal;
    private javax.swing.JComboBox tanggal2;
    private javax.swing.JLabel totalHarga;
    // End of variables declaration//GEN-END:variables
}
