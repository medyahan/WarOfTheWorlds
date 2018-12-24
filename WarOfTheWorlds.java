import java.util.Random;
import java.util.Scanner;

public class DunyalarSavasi 
{
	public static void main(String[] args) 
	{
		int son = 0;
		
		int toplamPuan = 0;
		
		int sayac = 1;
		
		Scanner klavye = new Scanner(System.in);
    Random rand = new Random();
        
    Dunyali []dunyali = new Dunyali[500]; 
    Uzayli []uzayli = new Uzayli[500]; 
		
		while(son != -1)
		{
			int uzayliGucu  = 0;
			int dunyaliGucu = 0;
			
			for(int i=0 ; i<500 ; i++)
			{	
				switch(rand.nextInt(2)+1) 
				{
					case 1: 
					{
						Asker a = new Asker(rand.nextInt(10)+1, rand.nextInt(10)+1); 
						dunyali[i] = a;
						break;
					}
					case 2: 
					{
						Ciftci c = new Ciftci(rand.nextInt(10)+1, rand.nextInt(10)+1);
						dunyali[i] = c;
						break;
					}
				}
			}
			
			for(int i=0 ; i<500 ; i++)
			{
				switch(rand.nextInt(2)+1) 
				{
					case 1: 
					{
						Cyborg a = new Cyborg(rand.nextInt(10)+1, rand.nextInt(10)+1); 
						uzayli[i] = a;
						break;
					}
					case 2: 
					{
						Madenci c = new Madenci(rand.nextInt(10)+1, rand.nextInt(10)+1);
						uzayli[i] = c;
						break;
					}
				}
			}
			
			for(int i=0 ; i<500 ; i++)
			{
				dunyaliGucu += dunyali[i].gucHesapla();
				uzayliGucu += uzayli[i].gucHesapla();
			}
			
			int puan = dunyaliGucu-uzayliGucu;
			
			System.out.printf("%d. El Puani: %d\n", sayac, puan);
			
			sayac++;
			
			toplamPuan += puan;
			
			System.out.println("Oyunu devam ettirmek icin -1 haric bir deger girin: ");
			son = klavye.nextInt();
		}
		System.out.printf("Oyun Bitti!\nToplam Oyun Puanı: %d", toplamPuan);
	}
} 
