package animals;

public abstract class Animal {
    protected String name;

    abstract String sayHello();
    protected void breathe(){
        System.out.println("Breathing" + name);
    }
}
