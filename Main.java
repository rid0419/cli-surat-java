import document.Document;

public class Main {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

   public static void main(String []args) {
       Document suratbaru = new Document();
       System.out.println(suratbaru.getSubject());
       suratbaru.setSubject("MANTAP");
       System.out.println(suratbaru.getSubject());
   }
}
