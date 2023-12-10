import java.util.Scanner;

public class Siral {
    public static void main(String[] args) {
        Scanner vr = new Scanner(System.in);
        int a , b , c ;
        System.out.println("A sayısını girin : ");
        a = vr.nextInt();
        System.out.println("B sayısını girin : ");
        b = vr.nextInt();
        System.out.println("C sayısını girin : ");
        c = vr.nextInt();

        if ((a>c)&&(a>b)){
            if (b>c){
                System.out.println("a>b>c");
            }else {
                System.out.println("a>c>b");
            }
        }else if ((b>a)&&(b>c)){
            if (a>c){
                System.out.println("b>a>c");
            }else {
                System.out.println("b>c>a");
            }
        }else if ((c>a)&&(c>b)){
            if (a>b){
                System.out.println("c>a>b");
            }else {
                System.out.println("c>b>a");
            }
        }
    }
}
