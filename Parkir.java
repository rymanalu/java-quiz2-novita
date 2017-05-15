import java.util.Scanner;

public class Parkir
{
    private int tipe;
    
    private int jam;

    public Parkir(int tipe, int jam)
    {
        this.tipe = tipe;
        this.jam = jam;
    }
    
    public int biaya()
    {
        int biaya = 0;
        
        if (this.tipe == 1) {
            for (int i = 0; i < this.jam; i++) {
                if (i > 0) {
                    biaya += 1000;
                } else {
                    biaya += 2000;
                }
            }
        } else if (this.tipe == 2) {
            for (int i = 0; i < this.jam; i++) {
                if (i > 0) {
                    biaya += 2000;
                } else {
                    biaya += 3000;
                }
            }
        } else if (this.tipe == 3) {
            for (int i = 0; i < this.jam; i++) {
                if (i > 0) {
                    biaya += 3000;
                } else {
                    biaya += 5000;
                }
            }
        }
        
        return biaya;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tipe kendaraan: ");
        int tipe = scan.nextInt();
        
        System.out.println("Lama waktu parkir: ");
        int jam = scan.nextInt();
        
        Parkir parkir = new Parkir(tipe, jam);
        System.out.println("Biaya parkir: " + parkir.biaya());
    }
}
