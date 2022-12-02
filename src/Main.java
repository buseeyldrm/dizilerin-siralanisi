import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int n = klavye.nextInt();
        System.out.println("Dizinin elemanlarını girin: ");


        int [] dizi=new int[n];
        for (int i = 0; i < dizi.length ; i++) {
            System.out.print((i+1)+ ".Elemanı: ");
            dizi[i]= klavye.nextInt();

        }
        Arrays.sort(dizi);


        System.out.print("Sıralama: ");
        for (int i: dizi){
            System.out.print(i+ " ");
        }
    }
}