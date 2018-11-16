import java.util.Scanner;
public class GameMain
{
    public static void main()
    {
        Scanner b = new Scanner(System.in);
        Game a = new Game();
        boolean e = true;
        while(e)
        {
            a.Tampil();
            System.out.print("Masukkan Pilihan : ");
            String pilihan = b.next();
            a.GameHitung();
            if (pilihan.equals("Penjumlahan"))
            {
                a.Penjumlahan();
                if (a.c == false)
                {
                    System.out.print("Apakah Anda Ingin Melanjutkan Y/T : ");
                    String pilihan1 = b.next();
                    if(pilihan1.equals("Y"))
                    {
                        e = true;
                        a.b = true;
                        a.c = true;
                    }
                    else
                    {
                        System.out.print("Permaian Berakhir");
                        e = false;
                    }
                }
            }
            else
            {
                a.Pengurangan();
                if (a.p == false)
                {
                    System.out.print("Apakah Anda Ingin Melanjutkan Y/T : ");
                    String pilihan2 = b.next();
                    if(pilihan2.equals("Y"))
                    {
                        e = true;
                        a.b = true;
                        a.p = true;
                    }
                    else
                    {
                        System.out.print("Permaian Berakhir");
                        e = false;
                    }
                }
            }
        }
    }
}
