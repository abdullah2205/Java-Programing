package tugas_uas2;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class aksi 
{    
    aksi2 empat = new aksi2();
    
    static int al=0,pti=0,elk=0,so=0,mtk=0,batas=0;
    String no_al,no_pti,no_elk,no_so,no_mtk;
    int[] sks= new int[5];  
    
    public void a(){
        komponen.checkBox1.addActionListener((java.awt.event.ActionEvent e) -> {
                if(komponen.checkBox1.isSelected()){
                    komponen.pp.setVisible(true);
                }
                
                else{ komponen.pp.setVisible(false);}
                
            });
    }
    
    public void aa()
    {
        
        komponen.prosesButton.addActionListener((ActionEvent e) -> {
                     
            String simpan_nama,simpan_npm;
            int t_sks=0;
            
            simpan_nama = komponen.isi_nama.getText();
            komponen.C_nama.setText(simpan_nama);
            simpan_npm = komponen.isi_npm.getText();
            komponen.C_npm.setText(simpan_npm);
            double t_nilai = 0;
            for (int i=0;i<batas;i++)
            {
                t_nilai = t_nilai+empat.nOut[i];
                t_sks = t_sks+sks[i];
            }
            double ww = t_nilai/t_sks;
            DecimalFormat set = new DecimalFormat("#.##");
            
            komponen.C_isi_ipk.setText(Double.toString(Double.valueOf(set.format(ww))));
            utama.tabel[5][4]=Double.toString(t_nilai);
            utama.tabel[5][3]="Total Nilai";
            komponen.C_isi_sksTotal.setText(Integer.toString(t_sks));
            komponen.tabel_nilai.setRowHeight(20);
        });  
    
    }
    
    public void ab()
    {
        komponen.addButton.addActionListener((ActionEvent e) -> {
            if (komponen.matkulList.getItemAt(komponen.matkulList.getSelectedIndex())=="  Algoritma II") {
                if (al==0) {
                    al=batas+1;
                    batas=al;
                }
                if (komponen.isi_nilai.getText().length()==0){
                    JOptionPane.showMessageDialog(komponen.frame, "nilai tidak boleh kosong!!!");
                }
                if (komponen.isi_nilai.getText().length()!=0){
                    if (batas<al){
                        batas = al;
                    }
                    sks[al-1]=4; 
                    no_al = Integer.toString(al);
                    utama.tabel[al-1][0]=no_al;
                    utama.tabel[al-1][1]=(String)komponen.matkulList.getItemAt(komponen.matkulList.getSelectedIndex());
                    utama.tabel[al-1][2]="4";
                    empat.htng_nilai1();//====
                }
            }
            
            if (komponen.matkulList.getItemAt(komponen.matkulList.getSelectedIndex())=="  Pengantar TI") {
                if (pti==0) {
                    pti=batas+1;
                    batas=pti;
                }
                if (komponen.isi_nilai.getText().length()==0){
                    JOptionPane.showMessageDialog(komponen.frame, "nilai tidak boleh kosong!!!");
                }
                if (komponen.isi_nilai.getText().length()!=0){
                    if (batas<pti){
                        batas = pti;
                    }
                    sks[pti-1]=2;
                    no_pti = Integer.toString(pti);
                    utama.tabel[pti-1][0]=no_pti;
                    utama.tabel[pti-1][1]=(String)komponen.matkulList.getItemAt(komponen.matkulList.getSelectedIndex());
                    utama.tabel[pti-1][2]="2";
                    empat.htng_nilai2();//==
                }
            }
            
            if (komponen.matkulList.getItemAt(komponen.matkulList.getSelectedIndex())=="  Elektronika") {
                if (elk==0) {
                    elk=batas+1;
                    batas=elk;
                }
                if (komponen.isi_nilai.getText().length()==0){
                    JOptionPane.showMessageDialog(komponen.frame, "nilai tidak boleh kosong!!!");
                }
                if (komponen.isi_nilai.getText().length()!=0){
                    if (batas<elk){
                        batas = elk;
                    }
                    sks[elk-1]=3;
                    no_elk = Integer.toString(elk);
                    utama.tabel[elk-1][0]=no_elk;
                    utama.tabel[elk-1][1]=(String)komponen.matkulList.getItemAt(komponen.matkulList.getSelectedIndex());
                    utama.tabel[elk-1][2]="3";
                    empat.htng_nilai3();//==                
                }
            }
            
            if (komponen.matkulList.getItemAt(komponen.matkulList.getSelectedIndex())=="  Sistem Operasi") {
                if (so==0) {
                    so=batas+1;
                    batas=so;
                }
                if (komponen.isi_nilai.getText().length()==0){
                    JOptionPane.showMessageDialog(komponen.frame, "nilai tidak boleh kosong!!!");
                }
                if (komponen.isi_nilai.getText().length()!=0){
                    if (batas<so){
                        batas = so;
                    }
                    sks[so-1]=4;
                    no_so = Integer.toString(so);
                    utama.tabel[so-1][0]=no_so;
                    utama.tabel[so-1][1]=(String)komponen.matkulList.getItemAt(komponen.matkulList.getSelectedIndex());
                    utama.tabel[so-1][2]="4";
                    empat.htng_nilai4();//==
                }
            }
            
            if (komponen.matkulList.getItemAt(komponen.matkulList.getSelectedIndex())=="  Matematika")
            {
                if (mtk==0) {
                    mtk=batas+1;
                    batas=mtk;
                }
                if (komponen.isi_nilai.getText().length()==0){
                    JOptionPane.showMessageDialog(komponen.frame, "nilai tidak boleh kosong!!!");
                }
                if (komponen.isi_nilai.getText().length()!=0){
                    if (batas<mtk){
                        batas = mtk;
                    }
                    sks[mtk-1]=2;
                    no_mtk = Integer.toString(mtk);
                    utama.tabel[mtk-1][0]=no_mtk;
                    utama.tabel[mtk-1][1]=(String)komponen.matkulList.getItemAt(komponen.matkulList.getSelectedIndex());
                    utama.tabel[mtk-1][2]="2";
                    empat.htng_nilai5();//==
                }
            }
            
        komponen.tabel_nilai.setRowHeight(20);
        
        });
    }
} 