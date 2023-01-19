import java.util.Scanner;
public class Exercise8{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u")){
            System.out.println("Vowel");
        }
        else if(str.length()>1){
            System.out.println("ERROR");
        }
        else{
            System.out.println("Consonant");
        }
    }
}