class Animal{
    void eat(){
        System.out.println("animal is eating");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat meows");
    }

}
class Puppy extends Cat{
    void play(){
        System.out.println("puppy is playing");
    }

}
public class Main{
    public static void main(String[] args){
        Puppy p=new Puppy();
        p.eat();
        p.sound();
        p.play();
    }
}
