package tugas_uas2;

public class aksi2 
{
    String[] nIn = new String[5];
    double[] nOut = new double[5];
    
    public void htng_nilai1()
    {
        nIn[aksi.al-1] =komponen.isi_nilai.getText();
        nOut[aksi.al-1] = Integer.parseInt(nIn[aksi.al-1]);
        
        if (nOut[aksi.al-1]>=81&&nOut[aksi.al-1]<=100)//a = 4
        {
            utama.nilai[aksi.al-1]=4;
            nOut[aksi.al-1] = 4*4;
            utama.tabel[aksi.al-1][3]="A";
            utama.tabel[aksi.al-1][4]=Double.toString(nOut[aksi.al-1]);
        }
        else if (nOut[aksi.al-1]>=71&&nOut[aksi.al-1]<=80)//b+ = 3.5
        {
            utama.nilai[aksi.al-1]=3.5;
            nOut[aksi.al-1] = 4*3.5;
            utama.tabel[aksi.al-1][3]="B+";
            utama.tabel[aksi.al-1][4]=Double.toString(nOut[aksi.al-1]);
        }
        else if (nOut[aksi.al-1]>=66&&nOut[aksi.al-1]<=70)//b = 3
        {
            utama.nilai[aksi.al-1]=3;
            nOut[aksi.al-1] = 4*3;
            utama.tabel[aksi.al-1][3]="B";
            utama.tabel[aksi.al-1][4]=Double.toString(nOut[aksi.al-1]);
        }
        else if (nOut[aksi.al-1]>=56&&nOut[aksi.al-1]<=65)//c = 2.5
        {
            utama.nilai[aksi.al-1]=2.5;
            nOut[aksi.al-1] = 4*2.5;
            utama.tabel[aksi.al-1][3]="C";
            utama.tabel[aksi.al-1][4]=Double.toString(nOut[aksi.al-1]);
        }
        else if (nOut[aksi.al-1]>=41&&nOut[aksi.al-1]<=55)//d = 2
        {
            utama.nilai[aksi.al-1]=2;
            nOut[aksi.al-1] = 4*2;
            utama.tabel[aksi.al-1][3]="D";
            utama.tabel[aksi.al-1][4]=Double.toString(nOut[aksi.al-1]);           
        }
        else if (nOut[aksi.al-1]>=0&&nOut[aksi.al-1]<=40)//e = 0
        {
            utama.nilai[aksi.al-1]=0;
            nOut[aksi.al-1] = 4*0;
            utama.tabel[aksi.al-1][3]="E";
            utama.tabel[aksi.al-1][4]=Double.toString(nOut[aksi.al-1]);
        }
    }
    
    public void htng_nilai2()
    {
        nIn[aksi.pti-1] =komponen.isi_nilai.getText();
        nOut[aksi.pti-1] = Integer.parseInt(nIn[aksi.pti-1]);
        
        if (nOut[aksi.pti-1]>=81&&nOut[aksi.pti-1]<=100)//a = 4
        {
            utama.nilai[aksi.pti-1]=4;
            nOut[aksi.pti-1] = 2*4;
            utama.tabel[aksi.pti-1][3]="A";
            utama.tabel[aksi.pti-1][4]=Double.toString(nOut[aksi.pti-1]);
        }
        else if (nOut[aksi.pti-1]>=71&&nOut[aksi.pti-1]<=80)//b+ = 3.5
        {
            utama.nilai[aksi.pti-1]=3.5;
            nOut[aksi.pti-1] = 2*3.5;
            utama.tabel[aksi.pti-1][3]="B+";
            utama.tabel[aksi.pti-1][4]=Double.toString(nOut[aksi.pti-1]);
        }
        else if (nOut[aksi.pti-1]>=66&&nOut[aksi.pti-1]<=70)//b = 3
        {
            utama.nilai[aksi.pti-1]=3;
            nOut[aksi.pti-1] = 2*3;
            utama.tabel[aksi.pti-1][3]="B";
            utama.tabel[aksi.pti-1][4]=Double.toString(nOut[aksi.pti-1]);
        }
        else if (nOut[aksi.pti-1]>=56&&nOut[aksi.pti-1]<=65)//c = 2.5
        {
            utama.nilai[aksi.pti-1]=2.5;
            nOut[aksi.pti-1] = 2*2.5;
            utama.tabel[aksi.pti-1][3]="C";
            utama.tabel[aksi.pti-1][4]=Double.toString(nOut[aksi.pti-1]);
        }
        else if (nOut[aksi.pti-1]>=41&&nOut[aksi.pti-1]<=55)//d = 2
        {
            utama.nilai[aksi.pti-1]=2;
            nOut[aksi.pti-1] = 2*2;
            utama.tabel[aksi.pti-1][3]="D";
            utama.tabel[aksi.pti-1][4]=Double.toString(nOut[aksi.pti-1]);           
        }
        else if (nOut[aksi.pti-1]>=0&&nOut[aksi.pti-1]<=40)//e = 0
        {
            utama.nilai[aksi.pti-1]=0;
            nOut[aksi.pti-1] = 2*0;
            utama.tabel[aksi.pti-1][3]="E";
            utama.tabel[aksi.pti-1][4]=Double.toString(nOut[aksi.pti-1]);
        }
    
    }
    
    public void htng_nilai3()
    {
        nIn[aksi.elk-1] =komponen.isi_nilai.getText();
        nOut[aksi.elk-1] = Integer.parseInt(nIn[aksi.elk-1]);
        
        if (nOut[aksi.elk-1]>=81&&nOut[aksi.elk-1]<=100)//a = 4
        {
         utama.nilai[aksi.elk-1]=4;
            nOut[aksi.elk-1] = 3*4;
            utama.tabel[aksi.elk-1][3]="A";
            utama.tabel[aksi.elk-1][4]=Double.toString(nOut[aksi.elk-1]);
        }
        else if (nOut[aksi.elk-1]>=71&&nOut[aksi.elk-1]<=80)//b+ = 3.5
        {
        utama.nilai[aksi.elk-1]=3.5;
            nOut[aksi.elk-1] = 3*3.5;
            utama.tabel[aksi.elk-1][3]="B+";
            utama.tabel[aksi.elk-1][4]=Double.toString(nOut[aksi.elk-1]);
        }
        else if (nOut[aksi.elk-1]>=66&&nOut[aksi.elk-1]<=70)//b = 3
        {
          utama.nilai[aksi.elk-1]=3;
            nOut[aksi.elk-1] = 3*3;
            utama.tabel[aksi.elk-1][3]="B";
            utama.tabel[aksi.elk-1][4]=Double.toString(nOut[aksi.elk-1]);
        }
        else if (nOut[aksi.elk-1]>=56&&nOut[aksi.elk-1]<=65)//c = 2.5
        {
          utama.nilai[aksi.elk-1]=2.5;
            nOut[aksi.elk-1] = 3*2.5;
            utama.tabel[aksi.elk-1][3]="C";
            utama.tabel[aksi.elk-1][4]=Double.toString(nOut[aksi.elk-1]);
        }
        else if (nOut[aksi.elk-1]>=41&&nOut[aksi.elk-1]<=55)//d = 2
        {
          utama.nilai[aksi.elk-1]=2;
            nOut[aksi.elk-1] = 3*2;
            utama.tabel[aksi.elk-1][3]="D";
            utama.tabel[aksi.elk-1][4]=Double.toString(nOut[aksi.elk-1]);           
        }
        else if (nOut[aksi.elk-1]>=0&&nOut[aksi.elk-1]<=40)//e = 0
        {
           utama.nilai[aksi.elk-1]=0;
            nOut[aksi.elk-1] = 3*0;
            utama.tabel[aksi.elk-1][3]="E";
            utama.tabel[aksi.elk-1][4]=Double.toString(nOut[aksi.elk-1]);
        }
    }
    
    public void htng_nilai4()
    {
        nIn[aksi.so-1] =komponen.isi_nilai.getText();
        nOut[aksi.so-1] = Integer.parseInt(nIn[aksi.so-1]);
        
        if (nOut[aksi.so-1]>=81&&nOut[aksi.so-1]<=100)//a = 4
        {
           utama.nilai[aksi.so-1]=4;
            nOut[aksi.so-1] = 4*4;
            utama.tabel[aksi.so-1][3]="A";
            utama.tabel[aksi.so-1][4]=Double.toString(nOut[aksi.so-1]);
        }
        else if (nOut[aksi.so-1]>=71&&nOut[aksi.so-1]<=80)//b+ = 3.5
        {
           utama.nilai[aksi.so-1]=3.5;
            nOut[aksi.so-1] = 4*3.5;
            utama.tabel[aksi.so-1][3]="B+";
            utama.tabel[aksi.so-1][4]=Double.toString(nOut[aksi.so-1]);
        }
        else if (nOut[aksi.so-1]>=66&&nOut[aksi.so-1]<=70)//b = 3
        {
            utama.nilai[aksi.so-1]=3;
            nOut[aksi.so-1] = 4*3;
            utama.tabel[aksi.so-1][3]="B";
            utama.tabel[aksi.so-1][4]=Double.toString(nOut[aksi.so-1]);
        }
        else if (nOut[aksi.so-1]>=56&&nOut[aksi.so-1]<=65)//c = 2.5
        {
           utama.nilai[aksi.so-1]=2.5;
            nOut[aksi.so-1] = 4*2.5;
            utama.tabel[aksi.so-1][3]="C";
            utama.tabel[aksi.so-1][4]=Double.toString(nOut[aksi.so-1]);
        }
        else if (nOut[aksi.so-1]>=41&&nOut[aksi.so-1]<=55)//d = 2
        {
           utama.nilai[aksi.so-1]=2;
            nOut[aksi.so-1] = 4*2;
            utama.tabel[aksi.so-1][3]="D";
            utama.tabel[aksi.so-1][4]=Double.toString(nOut[aksi.so-1]);           
        }
        else if (nOut[aksi.so-1]>=0&&nOut[aksi.so-1]<=40)//e = 0
        {
           utama.nilai[aksi.so-1]=0;
            nOut[aksi.so-1] = 4*0;
            utama.tabel[aksi.so-1][3]="E";
            utama.tabel[aksi.so-1][4]=Double.toString(nOut[aksi.so-1]);
        }
    }
    
    public void htng_nilai5()
    {
        nIn[aksi.mtk-1] =komponen.isi_nilai.getText();
        nOut[aksi.mtk-1] = Integer.parseInt(nIn[aksi.mtk-1]);
        
        if (nOut[aksi.mtk-1]>=81&&nOut[aksi.mtk-1]<=100)//a = 4
        {
           utama.nilai[aksi.mtk-1]=4;
            nOut[aksi.mtk-1] = 2*4;
            utama.tabel[aksi.mtk-1][3]="A";
            utama.tabel[aksi.mtk-1][4]=Double.toString(nOut[aksi.mtk-1]);
        }
        else if (nOut[aksi.mtk-1]>=71&&nOut[aksi.mtk-1]<=80)//b+ = 3.5
        {
          utama.nilai[aksi.mtk-1]=3.5;
            nOut[aksi.mtk-1] = 2*3.5;
            utama.tabel[aksi.mtk-1][3]="B+";
            utama.tabel[aksi.mtk-1][4]=Double.toString(nOut[aksi.mtk-1]);
        }
        else if (nOut[aksi.mtk-1]>=66&&nOut[aksi.mtk-1]<=70)//b = 3
        {
           utama.nilai[aksi.mtk-1]=3;
            nOut[aksi.mtk-1] = 2*3;
            utama.tabel[aksi.mtk-1][3]="B";
            utama.tabel[aksi.mtk-1][4]=Double.toString(nOut[aksi.mtk-1]);
        }
        else if (nOut[aksi.mtk-1]>=56&&nOut[aksi.mtk-1]<=65)//c = 2.5
        {
            utama.nilai[aksi.mtk-1]=2.5;
            nOut[aksi.mtk-1] = 2*2.5;
            utama.tabel[aksi.mtk-1][3]="C";
            utama.tabel[aksi.mtk-1][4]=Double.toString(nOut[aksi.mtk-1]);
        }
        else if (nOut[aksi.mtk-1]>=41&&nOut[aksi.mtk-1]<=55)//d = 2
        {
            utama.nilai[aksi.mtk-1]=2;
            nOut[aksi.mtk-1] = 2*2;
            utama.tabel[aksi.mtk-1][3]="D";
            utama.tabel[aksi.mtk-1][4]=Double.toString(nOut[aksi.mtk-1]);           
        }
        else if (nOut[aksi.mtk-1]>=0&&nOut[aksi.mtk-1]<=40)//e = 0
        {
            utama.nilai[aksi.mtk-1]=0;
            nOut[aksi.mtk-1] = 2*0;
            utama.tabel[aksi.mtk-1][3]="E";
            utama.tabel[aksi.mtk-1][4]=Double.toString(nOut[aksi.mtk-1]);
        }
    
    }
}
