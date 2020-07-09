package refleksi2;
import java.util.Stack;

public class Refleksi2
{    
    public static void main(String[] args) 
    {
        int i=0;
        String data_hewan;
        Stack<String> nama_hewan = new Stack<String>();
        String[] hewan = {"musang", "kijang", "jerapah", "tikus", "kucing", "kelinci", "ayam"};
        //pemasukan tumpukan
        while (i <= 6)
        {
            nama_hewan.push(hewan[i]);
            i++;
        }
        // penampilan stack awal
        System.out.println("Stack Awal =>");
        System.out.println(nama_hewan);
        System.out.println("\n");
        // pengambilan data pada tumpukan
        for (int j=1; j<=6; j++) 
        {
            data_hewan = nama_hewan.pop();
        }
        // penampilan stack setelah diambil
        System.out.println("Stack setelah diambil 6 tumpukan dari Atas =>");
        System.out.println(nama_hewan);
        System.out.println("\n");
        // penambahan tumpukan lagi
        i=2;
        while (i <= 6)
        {
            nama_hewan.push(hewan[i]);
            i++;
        }
        // penampilan stack akhir
        System.out.println("Stack setelah diambil dan disusun ulang =>");
        System.out.println(nama_hewan);
        System.out.println("\n");        
    }
}
