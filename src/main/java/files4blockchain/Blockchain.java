package main.java.files4blockchain;

import java.util.List;
import java.util.LinkedList;

public class Blockchain {
    
    private List<Block> blockChain;

    public Blockchain()
    {
        this.blockChain = new LinkedList<>();
    }

    public void addBlock(Block block)
    {
        this.blockChain.add(block);
    }

    public List<Block> getBlockChain()
    {
        return this.blockChain;
    }

    public int getSize()
    {
        return this.blockChain.size();
    }

    @Override
    public String toString()
    {
        String string = "";

        for (Block block : this.blockChain)
        {
            string += block.toString()+"\n";
        }
        
        return string;
    }
}
