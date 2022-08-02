package com.skatech.io;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Chain {
    private final List<Block> blocks = new LinkedList<>();

    public void addTransaction(String transaction) {
        if(blocks.size() == 0) {
            blocks.add(new Block(transaction, 0));
        } else {
            Block lastBlock = blocks.get(blocks.size()-1);
            blocks.add(new Block(transaction, lastBlock.hashCode()));
        }
    }
    public void printChain(PrintStream printStream) {
        for (Block block : blocks) {
            printStream.println(block.hashCode());
        }
    }
}
