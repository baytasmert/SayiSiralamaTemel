import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1,s2,s3;
        Scanner oku=new Scanner(System.in);
        System.out.print("\nS1 giriniz : ");
        s1=oku.nextInt();
        System.out.print("\nS2 giriniz : ");
        s2=oku.nextInt();
        System.out.print("\nS3 giriniz : ");
        s3=oku.nextInt();

        if(s1>=s2 && s1>=s3){
            if(s2>=s3){
                System.out.println("s1 > s2 > s3");
            } else {
                System.out.println("s1 > s3 > s2");
            }
        }

        if(s2>=s1 && s2>=s3){
            if(s1>=s3){
                System.out.println("s2 > s1 > s3");
            } else {
                System.out.println("s2 > s3 > s1");
            }
        }

        if(s3>=s2 && s3>=s1){
            if(s2>=s1){
                System.out.println("s3 > s2 > s1");
            } else {
                System.out.println("s3 > s1 > s2");
            }
        }

    }
}