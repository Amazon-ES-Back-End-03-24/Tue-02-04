package animals;

import interfaces.Drink;
import interfaces.Flier;

public class Cat extends Animal implements Flier, Drink {
    private int age;
    private boolean hasClaws;

    public Cat(int age, boolean hasClaws){
        this.age = age;
        this.hasClaws= hasClaws;
    }
    @Override
    protected String sayHello() {
        System.out.println(name);
        return "Miau";
    }

    public static void salute(){
        System.out.println("Hello");
    }

    public void printHasClaws(){
        breathe();
        System.out.println(hasClaws);
    }

    @Override
    public boolean flying() {
        return false;
    }

    @Override
    public void drinking() {
        System.out.println("glu glu");
    }
}
