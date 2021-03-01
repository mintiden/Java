/*Ir dots cilvēka garums metros un svars kilogramos. 
Tiek uzskatīts, ka optimālā svara formula ir garums centimetros mīnus svars.
Uzrakstīt programmu, kas nosaka, cik optimāls ir dotā cilvēka svars. 
Ja svars neatšķiras no optimālā vairāk kā par 7kg, tiek uzskatīts, ka cilvēka svars ir normāls.
Ja svars pārsniedz optimālo vairāk kā par 7kg, tiekuzskatīts, ka cilvēks sver pārāk daudz.
Ja līdz optimālajam svaram pietrūkst vairāk kā 7kg, tiek uzskatīts, ka cilvēks sver nepietiekami. 
Uzrakstīt programmu, kas izvada paziņojumu par cilvēka svaru. */
import java.util.Scanner;
public class uzd2{
    public static void main(String[] args) {
        double svars;
        double garums;
        Scanner scn = new Scanner(System.in);
        System.out.print("svars: ");
        svars = scn.nextDouble();
        System.out.print("garums: ");
        garums = scn.nextDouble();
        double optSvars = garums * 100 - svars;

        if(svars - optSvars < -7) {
            System.out.print("Svars ir nepietiekams.");
        } else if(svars - optSvars > 7 ) {
            System.out.print("Svars ir pārāk daudz.");
        } else{ 
            System.out.print("Svars ir normāls.");
        }
    }
}