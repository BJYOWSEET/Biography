
package biography.of.famous.person;
import java.util.Scanner;

public class BiographyOfFamousPerson {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the name of famous person: ");
         String name = scanner.nextLine();
         
         System.out.print("Enter thier birth date");
         String dob = scanner.nextLine();
         
         System.out.print ("Enter their nationality");
         String nationality = scanner.nextLine();
         
         System.out.print ("Enter their primary occupation");
         String occupation = scanner.nextLine();
         
         
         System.out.print("Enter a notable achievement or contribution");
         String achievements = scanner.nextLine();
         
         System.out.print ("Enter the age they achieved their first major success");
         String ageatfirstmajorsuccess = scanner.nextLine ();
         
         System.out.print ("Enter the number of awards they have won");
         String awardswon = scanner.nextLine();
         
        
         System.out.print("Enter the year they passed away ");
         String deathDate = scanner.nextLine();
         
         System.out.print ("Enter net worth in millions");
         String networth = scanner.nextLine();
         
         System.out.print ("Enter one of their famous quotes");
         String famousquote = scanner.nextLine ();
         
    
         
         
         //Output
         System.out.println ("----biography----");
         System.out.println ("Name: " + name);
         System.out.println ("Date of birth" + dob);
         System.out.println ("Nationality" + nationality);
         System.out.println ("Occurpation" + occupation);
         System.out.println ("Achievements" + achievements);
         System.out.println ("Ageatfirstmajorsuccess" + ageatfirstmajorsuccess);
         System.out.println ("Awardswon" +  awardswon);
         System.out.println ("DeathDate" +  deathDate);
         System.out.println ("Networth" +  networth);
         System.out.println ("Famousquotes" + famousquote);
         
         
         

         
    
         
        
       
    }
    
}
