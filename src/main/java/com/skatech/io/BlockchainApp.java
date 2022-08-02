package com.skatech.io;

public class BlockchainApp {
    public static void main(String[] args) {
        Chain c = new Chain();
        c.addTransaction("stefan rocks");
        c.addTransaction("stefan rocks2");
        c.addTransaction("stefan rocks3");
        c.addTransaction("stefan rocks4");
        c.addTransaction("stefan rocks5");
        c.addTransaction("stefan rocks6");
        c.addTransaction("stefan rocks7");
        c.printChain(System.out);
    }
}
