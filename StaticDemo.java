public class StaticDemo{
    void show(){
        System.out.println("UDAY");
    }
    static void display(){
        System.out.println("AGARWAL");
    }
    public static void main(String[]args){
        display();
        StaticDemo obj=new StaticDemo();
        obj.show();
    }
}


//Here,we learn to call a static and an instance method.
//In the above program,to call the static method ,we could have also used the following syntax: new StaticDemo().show();