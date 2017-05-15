import java.util.Scanner;

public class AmPm
{
    private int time;

    public AmPm(int time)
    {
        this.time = time;
    }

    public String convert()
    {
        if (this.time > 11 && this.time < 24) {
            if ((this.time - 12) == 0) {
                return "12 PM";
            }
            
            return (this.time - 12) + " PM";
        }
        
        if (this.time == 24) {
            return "12 AM";
        }
        
        return this.time + " AM";
    }
    
    public static void main(String[] args)
    {
        System.out.println("Input jam: ");
        
        Scanner scan = new Scanner(System.in);
        int jam = scan.nextInt();
        
        AmPm ampm = new AmPm(jam);
        System.out.println("Waktu dalam format AM/PM: " + ampm.convert());
    }
}
