package com.skatech.io;

import java.util.Objects;

public class Block {
    private final String transaction;
    private final int hash;

    public Block(String transaction, int hash) {
        this.transaction = transaction;
        this.hash = hash;
    }

    public int getHash() {
        return hash;
    }

    public String getTransaction() {
        return transaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return hash == block.hash && Objects.equals(transaction, block.transaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction, hash);
    }
}
