public class Human {

    private String name;
    private String dateOfBirth;
    private int age;
    private boolean isSingle;

    public Human(String name, String dateOfBirth, int age, boolean isSingle){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.isSingle = isSingle;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }

    public boolean isOver18(){
        return age > 18;
    }
}
