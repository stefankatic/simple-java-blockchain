package com.skatech.io;

public class BlockchainApp {
    public static void main(String[] args) {
        Chain c = new Chain();
        c.addTransaction("Item 1");
        c.addTransaction("Item 2");
        c.addTransaction("Item 3");
        c.addTransaction("Item 4");
        c.addTransaction("Item 5");
        c.addTransaction("Item 6");
        c.addTransaction("Item 7");
        c.addTransaction("Item 8");
        c.addTransaction("Item 9");
        c.addTransaction("Item 10");
        c.printChain(System.out);
    }
}
