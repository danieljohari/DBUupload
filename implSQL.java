import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class implSQL {
    private static UI ui;
    private static String CPR;
    private static String Fornavn;
    private static String Efternavn;
    private static String Mail;
    private static String Password;

    public static void main(String[] args)
    {

        try {

            ui = new UI();
            CPR = ui.askForCPR();
            System.out.println("Brugeren tastede: " + CPR);

            Fornavn = ui.askForFornavn();
            System.out.println("Brugeren indtastede: " + Fornavn);

            Efternavn = ui.askForEfternavn();
            System.out.println("Brugeren indtastede: " + Efternavn);

            Mail = ui.askForMail();
            System.out.println("Brugeren indtastede: " + Mail);

            Password = ui.askForPassword();
            System.out.println("Brugeren indtastede: " + Password);

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=Europe/Amsterdam&amp", "root", "Johari");


            String query = " insert into sys.persondata (CPR, Fornavn, Efternavn, Mail, Password)"
                    + " values (?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, CPR);
            preparedStmt.setString (2, Fornavn);
            preparedStmt.setString   (3, Efternavn);
            preparedStmt.setString(4, Mail);
            preparedStmt.setString   (5, Password);

            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();
        }
        catch (Exception e)
        {
           System.err.println("Got an exception!" + e);
           // System.err.println(e.getMessage());
        }
    }
}

