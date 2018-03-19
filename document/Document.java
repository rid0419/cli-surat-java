package document;

public class Document {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

    private String subject;
    private String ref_number;
    private String sender;
    private String receiver;


    public Document(){

    }

    public Document(String subject, String ref_number, String sender, String receiver){
        this.subject = subject;
        this.ref_number = ref_number;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getRefNumber(){
        return this.ref_number;
    }

    public void setRefNumber(String ref_number){
        this.ref_number = ref_number;
    }

    public String getSendert(){
        return this.sender;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public String getReceiver(){
        return this.receiver;
    }

    public void setReceiver(String receiver){
        this.receiver = receiver;
    }

}
