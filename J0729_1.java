import java.util.Scanner;
class J0729_1{
    public static void main(String[] args) {
        int x;
        System.out.println("Enter first number:");
        Scanner myObj1 = new Scanner(System.in);
        x = myObj1.nextInt();
        int y;
        System.out.println("Enter second number: ");
        Scanner myObj2 = new Scanner(System.in);
        y = myObj2.nextInt();
        System.out.println("The armstrong numbers are: ");
        for (int i = x; i < y; i++){
            int flag, rem, sum;
            flag = i;
            sum = 0;
            while (flag!=0){
                rem = flag % 10;
                sum = sum + (rem * rem * rem);
                flag = flag / 10;
            }
            if (sum == i){
                System.out.println(i);
                System.out.println("\t");
            }
        }
    }
}