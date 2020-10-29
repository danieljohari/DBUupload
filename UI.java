import java.util.Scanner;

// Scanner keyboard = bruger indtaster med given værdi fra keyboard
public class UI{


    //Hvad gør de tre metoder, vi har? Den konfigurerer programmet fra start af.
    Scanner keyboard = new Scanner(System.in);



    // Fra Scanner keyboard indsættes kritisk værdi i terminal
    public String askForCPR(){
        System.out.println("Indtast CPR");
        String CPR = keyboard.nextLine();
        return CPR;

    }

    // Fra Scanner keyboard indsættes max temperatur i terminal
    public String askForFornavn() {
        System.out.println("Indtast Fornavn ");
        String Fornavn = keyboard.nextLine();
        return Fornavn;
    }
    // Fra Scanner keyboard indsættes min temperatur i terminal
    public String askForEfternavn() {
        System.out.println("Indtast Efternavn ");
        String Efternavn = keyboard.nextLine();
        return Efternavn;
    }
    public String askForMail() {
        System.out.println("Indtast Mail ");
        String Mail = keyboard.nextLine();
        return  Mail;
    }
    public String askForPassword() {
        System.out.println("Indtast Password ");
        String Password = keyboard.nextLine();
        return Password;
    }

    }



