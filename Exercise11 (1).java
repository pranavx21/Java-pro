import java.util.Scanner;
public class Exercise11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp;
        int sum = 0;
        for(temp = 1; temp<=n; temp++){
            System.out.println("List of Natural Numbers " +temp);
            sum = sum+temp;
        }
        System.out.println(sum);
        sc.close();
    }
}