/*Ir dota preces cena 2.35Ls un daudzums – vesels skaitlis, kas nosaka, cik preces vienības tika iegādātas. 
Uzrakstīt programmu, kas aprēķina un izvada uz ekrāna maksu par pirkumu,ņemot vēra, ka, ja pērk vairāk kā 2 vienādas preces, pienākas atlaide 10%. */
import java.util.Scanner;
public class uzd1{
    public static void main(String[] args) {
        double cena = 2.35;
        int daudzums;
        Scanner scn = new Scanner(System.in);
        System.out.print("Ievadiet preces daudzums: ");
        daudzums = scn.nextInt();
        double atlaide = 0;

        if(daudzums > 2) { 
            atlaide = 0.1;
        }  
        System.out.printf("%.2f", cena * daudzums * (1 - atlaide));
    }
}
