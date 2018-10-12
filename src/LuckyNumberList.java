
import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thompson
 */
public class LuckyNumberList {
    
    LinkedPositionalList<LuckyNumber> list;
    public LuckyNumberList(){
        list = new LinkedPositionalList();
        
    }
    
    public void addLuckyNumber(LuckyNumber lucky){
        list.addLast(lucky);
    }
    
    
    public boolean isEven(int luckyTest){
        return luckyTest % 2 == 0;
    }
    
    private class EvenPositionIterator implements Iterator<Position<LuckyNumber>>{
        private Position<LuckyNumber> cursor = list.first();   // position of the next element to report
        private Position<LuckyNumber> recent = null;               // position of last reported element
        /** Tests whether the iterator has a next object. */
        @Override
        public boolean hasNext( ) { return ( cursor != null ); }
        /** Returns the next position in the iterator. */
        @Override
        public Position<LuckyNumber> next( ) throws NoSuchElementException {
            // On the first call to next (i.e. when recent == null) you need to      //<<< new code
            // advance recent until it is pointing to a vowel element.                //<<< new code
            if ( recent == null )                                                    //<<< new code 
            {                                                                        //<<< new code
                while ( cursor != null && !isEven( cursor.getElement().getLuckyNumber()) )    //<<< new code
                    cursor = list.after( cursor );                               //<<< new code
            }                                                                        //<<< new code
                
            if ( cursor == null ) throw new NoSuchElementException( "nothing left " );
            recent = cursor;
            cursor = list.after( cursor );
            
            // advance cursor to the next vowel
            
            while ( cursor != null && !isEven( cursor.getElement().getLuckyNumber()) )
                cursor = list.after( cursor );
            
            return recent;
        }
        /** Removes the element returned by most recent call to next. */
        @Override
        public void remove( ) throws IllegalStateException {
            if ( recent == null ) throw new IllegalStateException( "nothing to remove" );
            list.remove( recent );         // remove from outer list
            recent = null;              // do not allow remove again until next is called
        }
    } //----- end of nested PositionIterator class -----
    
    //----- nested PositionIterable class -----
    private class EvenPositionIterable implements Iterable<Position<LuckyNumber>>{
        @Override
        public Iterator<Position<LuckyNumber>> iterator( ) { return new EvenPositionIterator( ); }        
    } //----- end of nested PositionIterable class -----
    
    /** Returns an iterable representation of the list's positions.
     * @return  */
    public Iterable<Position<LuckyNumber>> evenPositions( ) {
        return new EvenPositionIterable( );  // create a new instace of the inner class
    }
    
    public boolean isPrime(int luckyTest){
        int half = (luckyTest % 2) +1;
        for(int i = 2; i <= half; i++){
            if(luckyTest % i == 0){
                return false;
            }
        }
        return true;
    }
    
    private class PrimePositionIterator implements Iterator<Position<LuckyNumber>>{
        private Position<LuckyNumber> cursor = list.first();   // position of the next element to report
        private Position<LuckyNumber> recent = null;               // position of last reported element
        /** Tests whether the iterator has a next object. */
        @Override
        public boolean hasNext( ) { return ( cursor != null ); }
        /** Returns the next position in the iterator. */
        @Override
        public Position<LuckyNumber> next( ) throws NoSuchElementException {
            // On the first call to next (i.e. when recent == null) you need to      //<<< new code
            // advance recent until it is pointing to a vowel element.                //<<< new code
            if ( recent == null )                                                    //<<< new code 
            {                                                                        //<<< new code
                while ( cursor != null && !isPrime( cursor.getElement().getLuckyNumber()) )    //<<< new code
                    cursor = list.after( cursor );                               //<<< new code
            }                                                                        //<<< new code
                
            if ( cursor == null ) throw new NoSuchElementException( "nothing left " );
            recent = cursor;
            cursor = list.after( cursor );
            
            // advance cursor to the next vowel
            
            while ( cursor != null && !isPrime( cursor.getElement().getLuckyNumber()) )
                cursor = list.after( cursor );
            
            return recent;
        }
        /** Removes the element returned by most recent call to next. */
        @Override
        public void remove( ) throws IllegalStateException {
            if ( recent == null ) throw new IllegalStateException( "nothing to remove" );
            list.remove( recent );         // remove from outer list
            recent = null;              // do not allow remove again until next is called
        }
    } //----- end of nested PositionIterator class -----
    
    //----- nested PositionIterable class -----
    private class PrimePositionIterable implements Iterable<Position<LuckyNumber>>{
        @Override
        public Iterator<Position<LuckyNumber>> iterator( ) { return new EvenPositionIterator( ); }        
    } //----- end of nested PositionIterable class -----
    
    /** Returns an iterable representation of the list's positions.
     * @return  */
    public Iterable<Position<LuckyNumber>> primePositions( ) {
        return new PrimePositionIterable( );  // create a new instace of the inner class
    }
    
}
