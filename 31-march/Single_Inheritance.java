class animal{
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks...");
    }
}
public class Main{

    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.sound();
    }
}
