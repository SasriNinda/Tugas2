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
	public void Penjumlahan()
    {
        while (c)
        {
            System.out.print("Masukkan Jawabannya : ");
            int tanya = a.nextInt();
            jumlah = jawab + jawab1;
            if (jumlah == tanya)
            {
                System.out.println("Jawaban Anda Benar");
                int Skor = 10;
                tambahSkor += Skor;
                System.out.println("Skor Anda : " + tambahSkor);
                c = false;
            }
            if (jumlah != tanya)
            {
                System.out.print("Jawaban Anda Salah ");
                c = true;
            }
        }
    }
    public void Pengurangan()
    {
        while (p)
        {
            System.out.print("Masukkan Jawabannya : ");
            int tanya1 = a.nextInt();
            jumlah1 = jawab - jawab1;
            if (jumlah1 == tanya1)
            {
                System.out.println("Jawaban Anda Benar");
                int Skor = 10;
                tambahSkor += Skor;
                System.out.println("Skor Anda : " + tambahSkor);
                p = false;
            }
            if (jumlah1 != tanya1)
            {
                System.out.print("Jawaban Anda Salah ");
                p = true;
            }
        }
    }
}
