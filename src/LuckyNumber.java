
import java.util.Random;

/**
 * Lucky Number class contains a person's name and
 * their lucky number
 * @author Graham Thompson
 * @version
 */
public class LuckyNumber {
    private String name;
    private int luckyNumber;
    
    /**
     * Initializes luckyNumber class and assigns a name and lucky number
     * @param name 
     */
    public LuckyNumber(String name){
        this.name = name;
        Random rand = new Random();
        luckyNumber = rand.nextInt(10);
    }
    /**
     * returns the name of LuckyNumber class
     * @return 
     */
    public String getName(){
        return name;
    }
    /**
     * Returns the luckyNumber of LuckyNumber
     * @return 
     */
    public int getLuckyNumber(){
        return luckyNumber;
    }
    
    /**
     * Tests if luckyNumber is even
     * @return 
     */
    public String isEven(){
        if(luckyNumber % 2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    /**
     * Tests if luckyNumber is prime
     * @return 
     */
    public String isPrime(){
        if(luckyNumber == 0 || luckyNumber == 1){
            return "Not Prime";
        }
        for(int i = 2; i < luckyNumber; i++){
            if(luckyNumber % i == 0){
                return "Not Prime";
            }
        }
        return "Prime";
    }
    
    /**
     * returns a string containing class name, name, and luckyNumber
     * @return 
     */
    public String toString(){
        return name + "\t" + luckyNumber + "\t" + isEven() + "\t" + isPrime();
    }
    /**
     * Tests to see if the object is the same LuckyNumber
     * @param o
     * @return 
     */
    public boolean equals(Object o){
        if(!(o instanceof LuckyNumber)){
            return false;
        }
        LuckyNumber test = (LuckyNumber) o;
        return this.luckyNumber == test.luckyNumber && 
                this.name.equals(test.name);
    }
}
