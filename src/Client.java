/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thompson
 */
public class Client {

    /**
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
        list.addLuckyNumber(new LuckyNumber("Nicholas"));
        list.addLuckyNumber(new LuckyNumber("Devin"));
        list.addLuckyNumber(new LuckyNumber("Richard"));
        list.addLuckyNumber(new LuckyNumber("Katie"));
    }
    
}
