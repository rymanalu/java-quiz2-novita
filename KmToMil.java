import java.util.Scanner;

public class KmToMil
{
    private int km;

    public KmToMil(int km)
    {
        this.km = km;
    }

    public double convert()
    {
        return this.km * 1.609;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Masukkan berapa KM yang akan dikonversi ke Mil: ");
        
        Scanner scan = new Scanner(System.in);
        int km = scan.nextInt();
        
        KmToMil kmToMil = new KmToMil(km);
        System.out.println(km + " KM sama dengan " + kmToMil.convert() + " Mil");
    }
}
