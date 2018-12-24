public class Madenci extends Uzayli
{
	private int madenSayisi;
	
	public Madenci(int savunma, int madenSayisi)
	{
		super(savunma);
		this.madenSayisi = madenSayisi;
	}
	
	public void setMadenSayisi()
	{
		this.madenSayisi = madenSayisi;
	}
	
	public int getMadenSayisi()
	{
		return madenSayisi;
	}
	
	public int gucHesapla()
	{
		return madenSayisi;
	}
}
