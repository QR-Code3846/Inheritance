import java.util.Random;
public class Adult extends Human {
    public Adult(int age, boolean happy, boolean sad, int hungry, int birthday){
        super(age, happy, sad, hungry, birthday);
        Random k = new Random();
        age = k.nextInt(82) + 18;
        System.out.println(age);
    }

    public boolean hasJob(){
        Random N = new Random();
        if(N.nextInt(3) == 2){
            return true;
        }
        return false;
    }
    
    public boolean work(){
        if(hasJob() == true){
            setSad(true);
        }
        return false;
    }
}
