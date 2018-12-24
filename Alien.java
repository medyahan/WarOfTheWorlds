public abstract class Uzayli 
{
	private int savunma;
	
	public Uzayli(int savunma)
	{
		this.savunma = savunma;
	}
	
	public void setSavunma(int savunma)
	{
		this.savunma = savunma;
	}
	
	public int getSavunma()
	{
		return savunma;
	}
  
	public abstract int gucHesapla();
}
