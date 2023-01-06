import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //bismillahirrahmanirrahim
        System.out.println("Hosgeldiniz. ekoku ve ebobu buluncak 1. sayiyi giriniz");
        int n = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int m = scan.nextInt();
        System.out.println("ekok: " + ekok(n,m));
        System.out.println("ebob: " + ebob(n,m,ekok(n,m)));
    }

    public static int ekok(int sayi1,int sayi2){
        int ekok = 0;
        int i =1;
        while(i<sayi1*sayi2){
            if(sayi1%i==0&&sayi2%i==0){
                ekok = i;
            }
            i++;
        }

        return ekok;
    }
    public static int ebob(int ekokuAlincakSayi1,int ekokuAlincakSayi2,int ekok){
int ebob = ekokuAlincakSayi1*ekokuAlincakSayi2/ekok;
return ebob;







    }
}