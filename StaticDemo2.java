public class StaticDemo2{
    //Static Block
    static{
        System.out.println("1");
    }
    //init block aur instance block
    {
        System.out.println("3");
        System.out.println("4");
    }
    public static void main(String[]args){
        System.out.println("2");
        new StaticDemo2();
    }
}