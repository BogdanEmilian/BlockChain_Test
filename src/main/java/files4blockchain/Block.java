package main.java.files4blockchain;

import java.util.Date;

public class Block {
    private int id;
    private int nonce;
    private long timestamp;
    private String hash;
    private String prevHash;
    private String transaction;

    public Block(int id, String transaction, String prevHash)
    {
        this.id = id;
        this.transaction = transaction;
        this.prevHash = prevHash;
        this.timestamp = new Date().getTime();
        generateHash();
    }

    public void incrementNonce()
    {
        this.nonce++;
    }

    public String getPreviousHash()
    {
        return prevHash;
    }

    public void setPreviousHash(String prevHash)
    {
        this.prevHash = prevHash;
    }

    public String getHash()
    {
        return this.hash;
    }

    public void setHash(String hash)
    {
        this.hash = hash;
    }

    @Override
    public String toString()
    {
        return "Block [id = " + id + ", hash = " + hash + ", previousHash = " + prevHash + ", transaction = " + transaction + "]";
    }

    public void generateHash()
    {
        String dataToHash = Integer.toString(id)+
                            prevHash+
                            Long.toString(timestamp)+
                            Integer.toString(nonce)+
                            transaction;

        this.hash = SHA256Controller.hash(dataToHash);
    }
}