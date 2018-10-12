/**
 * Tests the iterator for even and prime numbers of the LuckyNumber class
 * @author Thompson
 * @version
 */
public class Client {

    /**
     * Tests the iterator for even and prime numbers of the LuckyNumber class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LuckyNumberList list = new LuckyNumberList();
        list.addLuckyNumber(new LuckyNumber("Joe"));
        list.addLuckyNumber(new LuckyNumber("Sam"));
        list.addLuckyNumber(new LuckyNumber("Ashley"));
        list.addLuckyNumber(new LuckyNumber("Karlie"));
        list.addLuckyNumber(new LuckyNumber("Jet"));
        list.addLuckyNumber(new LuckyNumber("Abby"));
        list.addLuckyNumber(new LuckyNumber("Nick"));
        list.addLuckyNumber(new LuckyNumber("Devin"));
        list.addLuckyNumber(new LuckyNumber("Richard"));
        list.addLuckyNumber(new LuckyNumber("Katie"));
        
        System.out.printf("Lucky Number List Contents (printed with default iterator)\n");
        
        Iterator<Position<LuckyNumber>> listEvenIterator = list.evenPositions().iterator();
        Iterator<Position<LuckyNumber>> listPrimeIterator = list.primePositions().iterator();
        Iterator<Position<LuckyNumber>> listDefaultIterator = list.positions().iterator();
        
        while(listDefaultIterator.hasNext()){
            LuckyNumber lucky = listDefaultIterator.next().getElement();
            System.out.printf("%s\t%d\t%s\t%s\n",lucky.getName(), lucky.getLuckyNumber(), lucky.isEven(), lucky.isPrime());
        }
        
        System.out.printf("\nLucky Number List Contents (printed with prime iterator)\n");
        
        while(listPrimeIterator.hasNext()){
            LuckyNumber lucky = listPrimeIterator.next().getElement();
            System.out.printf("%s\t%d\t%s\t%s\n",lucky.getName(), lucky.getLuckyNumber(), lucky.isEven(), lucky.isPrime());
        }
        
        System.out.printf("\nLucky Number List Contents (printed with Even iterator)\n");
        while(listEvenIterator.hasNext()){
            LuckyNumber lucky = listEvenIterator.next().getElement();
            System.out.printf("%s\t%d\t%s\t%s\n",lucky.getName(), lucky.getLuckyNumber(), lucky.isEven(), lucky.isPrime());
        }
    }
    
}
