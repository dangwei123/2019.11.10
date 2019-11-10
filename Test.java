package animal.test;

/**
 * ClassName:Animal
 * Package:animal.test
 * Description:
 *
 * @Date:2019/11/10 10:04
 * @Author:DangWei
 */
public class Animal{
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(this.name+" is eating");
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public void fly(){
        System.out.println(this.name+" can fly");
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void bark(){
        System.out.println("Dog can wangwang");
    }
}
class Main {
    public static void main(String[] args) {
        Bird bird=new Bird("李烨1");
        bird.eat();
        bird.fly();
        System.out.println("=========================================");
        Dog dog=new Dog("李烨2");
        dog.eat();
        dog.bark();
    }
}


package animal.test;

/**
 * ClassName:Cat
 * Package:animal.test
 * Description:
 *
 * @Date:2019/11/10 9:59
 * @Author:DangWei
 */

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void miaomiao(){
        System.out.println(this.name+" can miaomiao");
    }
}
class Test{
    public static void main(String[] args) {
        Cat cat=new Cat("李烨3");
        cat.eat();
        cat.miaomiao();
    }
}



package com.test1;
import  animal.test.*;
/**
 * ClassName:Test
 * Package:com.test1
 * Description:
 *
 * @Date:2019/11/10 9:56
 * @Author:DangWei
 */
class Pig extends Animal{
    public Pig(String name){
        super(name);
    }
    public void love(){
        System.out.println(this.name+" love eating");
    }
}
public class Test {
    public static void main(String[] args) {
        Pig pig=new Pig("李烨4");
        pig.eat();
        pig.love();
        System.out.println("====================================");
        //Animal animal=new Animal("hh");
        //System.out.println(animal.name);
    }
}
