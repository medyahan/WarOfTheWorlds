public class Asker extends Dunyali
{
	private int silahGucu;
	private int savunma;
	
	public Asker(int savunma, int silahGücü)
	{
		super(savunma);
		this.silahGucu = silahGucu;
		this.savunma = savunma;
	}
	
	public void setSilahGucu(int silahGucu)
	{
		this.silahGucu = silahGucu;
	}
	
	public int getSilahGucu()
	{
		return silahGucu;
	}
	
	public int gucHesapla()
	{
		return savunma*silahGucu;
	}
}
