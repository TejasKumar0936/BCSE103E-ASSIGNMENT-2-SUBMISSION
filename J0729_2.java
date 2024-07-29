import java.util.Scanner;
class J0729_2{
    public static void main(String[] args) {
        int x;
        System.out.printf("ENTER LENGTH: ");
        Scanner myObj1 = new Scanner(System.in);
        x = myObj1.nextInt();
        float ratio = 22/8;
        System.out.println("");
        for (int i = 0; i <= (x); i++){
            for (int j = 0; j <= x*ratio; j++){
                if (i!=0 && i!=(x)){
                    if (j!=0 && j!= x*ratio){
                        System.out.printf(" ");
                    }
                    else{
                        System.out.printf("*");
                    }
                }
                else{
                    System.out.printf("*");
                }
                
            }
            System.out.println("");
        }
    }
}