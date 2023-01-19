public class Exercise12{
   public static void main(String[]args){
       int n = 5;
       float avg = 0.0f;
       int sum = 0;
       System.out.println("Numbers are ");
       for(int i = 1; i<=n; i++){
           System.out.println(i);
           sum = sum+i;
       }
       System.out.println(sum);
       avg = sum/n;
       System.out.println(avg);
   }
}