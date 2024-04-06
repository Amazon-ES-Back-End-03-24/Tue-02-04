package drinks;

public abstract class Drink {

    private boolean isFizzy;

    private boolean printIsFizzy(){
        System.out.println(isFizzy);
        return isFizzy;
    }

    abstract void printRecipe();
}
