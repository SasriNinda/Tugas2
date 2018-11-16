import java.util.Scanner;
public class Game
{
    String pilihan;
    String d;
    String e;
    boolean b = true;
    boolean c = true;
    boolean p = true;
    int jawab;
    int jawab1;
    int jumlah;
    int jumlah1;
    int tambahSkor;
    Scanner a = new Scanner(System.in);
    public void Tampil()
    {
        System.out.println("Pilihan Game     : ");
        System.out.println("Game Penjumlahan ");
        System.out.println("Game Pengurangan ");
    }
	public void GameHitung()
    {
        while(b)
        {
            System.out.print("Masukkan Angka 1 : ");
            jawab = a.nextInt();
            System.out.print("Masukkan Angka 2 : ");
            jawab1 = a.nextInt();
            if (jawab < 20 && jawab1 < 20)
            {
                b = false;
            }
            else
            {
                System.out.println("Angka Harus Lebih Kecil Dari 20");
                b = true;
            }
        }
    }
}
