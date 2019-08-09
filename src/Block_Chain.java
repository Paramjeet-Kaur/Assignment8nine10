
public class Block_Chain 
{
	private String hash;
	private String data;
	
public Block_Chain(String data)
{
	this.data=data;
	this.hash=hash;
}

public String getHash() {
	return hash;
}

public void setHash(String hash) {
	this.hash = hash;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}
public int CalculateHash()
{
	int CalculatedHash=data.hashCode();
	return CalculatedHash;
}
}

