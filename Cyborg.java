public class Cyborg extends Uzayli
{
	private int lazerGucu;
	private int savunma;
	
	public Cyborg(int savunma, int lazerGücü)
	{
		super(savunma);
		this.lazerGucu = lazerGucu;
		this.savunma = savunma;
	}
	
	public void setLazerGucu(int lazerGucu)
	{
		this.lazerGucu = lazerGucu;
	}
	
	public int getLazerGucu()
	{
		return lazerGucu;
	}
	
	public int gucHesapla()
	{
		return savunma*lazerGucu;
	}
}
