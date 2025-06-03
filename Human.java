import java.util.Random;
import java.util.Date;

public class Human {
    private int age;
    private boolean happy;
    private boolean sad;
    private int hungry;
    private final int birthday;

    public Human(int age, boolean happy, boolean sad, int hungry, int birthday){
        this.age = age;
        this.happy = happy;
        this.hungry = hungry;
        this.sad = sad;
        Random k = new Random();
        this.birthday = k.nextInt();
    }

    public void eat(){
        if(hungry > 50){
            System.out.println("Nom Nom Nom");
        }
    }

    public int birthDay(){
        Date b = new Date();
        if(birthday == b.getDate()){
            age++;
        }
        return age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getBirthday() {
        return birthday;
    }
    public boolean getSad(){
        return sad;
    }
    public void setSad(boolean sad){
        this.sad = sad;
    }
}
