public abstract class Dunyali 
{
  private int savunma;
	
	public Dunyali(int savunma)
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
