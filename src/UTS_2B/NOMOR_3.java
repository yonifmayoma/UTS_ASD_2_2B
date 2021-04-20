package UTS_2B;
import java.util.Scanner;
public class NOMOR_3 {
    public static void printMatriks(int[][] matriks){
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah baris Matriks A;");
        int baris = input.nextInt();
        System.out.println("Masukan jumlah kolom Matriks A:");
        int kolom = input.nextInt();
        
        int[][] matriks_a = new int[baris][kolom];
        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.println("Masukan elemen matriks A["+i+" , "+j+"]");
                matriks_a[i][j] = input.nextInt();
            }    
        }
        System.out.println("Hasil Matriks A :");
        printMatriks(matriks_a);
        
        int[][] hasilTranpose = new int[matriks_a.length][matriks_a[0].length];
        for (int i=0; i<matriks_a.length; i++){
            for (int j=0; j<matriks_a[0].length; j++){
                hasilTranpose[j][i] = matriks_a[i][j];
            }
        }
System.out.println("Hasil Tranpose Matriks A :");
        for (int i=0; i<matriks_a[0].length; i++){
            for (int j=0; j<matriks_a.length; j++){
                System.out.print(hasilTranpose[i][j]+" ");
            }
            System.out.println();
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah baris Matriks B;");
        int baris = input.nextInt();
        System.out.println("Masukan jumlah kolom Matriks B:");
        int kolom = input.nextInt();
        
        int[][] matriks_b = new int[baris][kolom];
        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.println("Masukan elemen matriks B["+i+" , "+j+"]");
                matriks_b[i][j] = input.nextInt();
            }    
        }
        System.out.println("Hasil Matriks B :");
        printMatriks(matriks_b);
        
        int[][] hasilTranpose = new int[matriks_b.length][matriks_b[0].length];
        for (int i=0; i<matriks_b.length; i++){
            for (int j=0; j<matriks_b[0].length; j++){
                hasilTranpose[j][i] = matriks_b[i][j];
            }
        }
System.out.println("Hasil Tranpose Matriks A :");
        for (int i=0; i<matriks_b[0].length; i++){
            for (int j=0; j<matriks_b.length; j++){
                System.out.print(hasilTranpose[i][j]+" ");
            }
            System.out.println();
        }
}
