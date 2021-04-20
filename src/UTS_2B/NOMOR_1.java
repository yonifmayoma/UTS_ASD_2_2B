package UTS_2B;
import java.util.Scanner;
public class NOMOR_1 {
    public static void printData(int[] data){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    public static void shellSort(int[] arr){
        int n = arr.length;
        int C, M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        int temp ;
        C = 0;
        M = 0;
        jarak = n;
      
         
        while (jarak >= 1){
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah){
                Sudah = false;
                for (j = 0; j < n - jarak; j++){
                    i = j + jarak;
                    C++;
                    if (arr[j] > arr[i]){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
    public static void binarySearch(int[] data, int key){
        int indexAwal = 0;
        int indexAkhir = data.length-1;
        int middle = 0;
        int found = 0;
        while((indexAwal<=indexAkhir) && (found == 0)){
            middle = (indexAwal+indexAkhir)/2;
            System.out.println("Indeks pointer : "+middle);
            if (key == data[middle]){
                System.out.println("Data "+key+", telah ditemukan pada indeks ke "+middle);
                found = 1;
            }
            else{
                if (key < data[middle]){
                    System.out.println("cari di kiri");
                    indexAkhir = middle-1;
                }
                else{
                    System.out.println("cari di kanan");
                    indexAwal = middle+1;
                }
            }
        }
        if (found == 1){
            System.out.println("Data ditemukan");
        }
        else{
            System.out.println("Data ditemukan");
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] nilai = {3, 10, 4, 2, 8, 13};
        System.out.println("--- before ---");
        printData(nilai);
        shellSort(nilai);
        System.out.println("\n--- after ---");
        printData(nilai);
        
        System.out.println("\nMasukan data yang ingin di cari:");
        int key = input.nextInt();
        
        binarySearch(nilai, key);
    }
}

