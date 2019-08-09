
public class BlockMain {

	public static void main(String[] args) {

		Block_Chain MyGenesisBlock=new Block_Chain("ThisIsMyGenesisBlock");
		System.out.println("This is my Genesis block: " +MyGenesisBlock.CalculateHash());
		
		//data is changed and hash also changes when data changes
		MyGenesisBlock.setData("ThisIsMyChangedData");
		System.out.println("This is my changed hash code: "+MyGenesisBlock.CalculateHash());

	}

}
