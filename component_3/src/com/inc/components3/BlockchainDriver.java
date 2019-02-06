package com.inc.components3;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class BlockchainDriver {
	List<Block> blockchain = new ArrayList<Block>();
	 
  public static void main(String[] args) throws NoSuchAlgorithmException {
 
    // Genesis block
    String[] transactions = {"Hosang sent 1k Bitcoins to Zuckerberg."};
    @SuppressWarnings("rawtypes")
		Block genesisBlock = new Block(new Object(), transactions);
    System.out.println("Block Hash : " + genesisBlock.getBlockHash());
 
    // Second block
    String[] secondTransactions = {"Zuckerberg sent 500 Bitcoins to Hosang."};
    @SuppressWarnings("rawtypes")
		Block secondBlock = new Block(new Object(), secondTransactions);
    System.out.println("Second Block Hash : " + secondBlock.getBlockHash());
 
    // Third block
    String[] thirdTransactions = {"Hosang sent 500 Bitcoins to Moon."};
    @SuppressWarnings("rawtypes")
		Block thirdBlock = new Block(new Object(), thirdTransactions);
    System.out.println("Third Block Hash : " + thirdBlock.getBlockHash());
 
  }
	
	
}
