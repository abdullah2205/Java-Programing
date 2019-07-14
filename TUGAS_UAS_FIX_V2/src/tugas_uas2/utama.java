package tugas_uas2;

import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class utama  extends Application {
    @Override public void start(Stage primaryStage){
   }
    
    public static void main(String[] args) {
            komponen dua = new komponen();
            aksi tiga = new aksi();
        
            CategoryDataset ds = createDataset();
            JFreeChart chart = ChartFactory.createBarChart(//hoho
            "", //Chart Title  
            "Mata Kuliah", // Category axis  
            "Nilai", // Value axis  
            ds, 
            PlotOrientation.VERTICAL, true, true,
            false);
            
            ChartPanel cp = new ChartPanel(chart);
            cp.setPreferredSize(new java.awt.Dimension(530, 220));
            komponen.pp.add(cp);
            
            dua.tampil();//metot lain
            tiga.a();//metot lain
            tiga.aa();//metot lain
            tiga.ab();//metot lain
           
    }
    
    private static CategoryDataset createDataset(){
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        Timeline perbarui = new Timeline(new KeyFrame(Duration.seconds(0.1), (ActionEvent event) -> {
            for(int i=0;i<aksi.batas;i++){
                ds.setValue(nilai[i], tabel[i][1], "");
            }  
        }));
        
        perbarui.setCycleCount(Timeline.INDEFINITE);  
        perbarui.play();   
        
        return ds;
    }
    
    static String matkul[] = { "  Algoritma II" , "  Pengantar TI" , "  Elektronika", "  Sistem Operasi", "  Matematika"};
    static String tabel[][] = new String[6][5];
    static String judul_tabel[] = {"No.","Nama Mata Kuliah","SKS","Nilai","SKS*Nilai"};
    static double[] nilai = new double[5];
    
}