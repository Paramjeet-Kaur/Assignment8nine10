import java.util.ArrayList;

public class BlockMain {
	public static ArrayList<Block_Chain> blockchain = new ArrayList<Block_Chain>(); 
	public static void main(String[] args) {
	
		
			//add our blocks to the blockchain ArrayList:
			blockchain.add(new Block_Chain("Hi im the first block", "0"));		
			blockchain.add(new Block_Chain("Yo im the second block",blockchain.get(blockchain.size()-1).getHash())); 
			blockchain.add(new Block_Chain("Hey im the third block",blockchain.get(blockchain.size()-1).getHash()));
			
		}
		
		
	}


