package pkg;

public class Mail {

    // attribute declarations
    private String subject;
    private String ref_number;
    private String sender;
    private String receiver;
    private String type;

    // constructor
    public Mail(){

    }

    public Mail(String subject, String ref_number, String sender, String receiver, String type){
        this.subject = subject;
        this.ref_number = ref_number;
        this.sender = sender;
        this.receiver = receiver;
        this.type = type;
    }

    // method definitons
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

    public String getSender(){
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

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

}
