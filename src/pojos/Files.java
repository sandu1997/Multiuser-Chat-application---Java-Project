package pojos;
// Generated 15-May-2022 10:19:19 by Hibernate Tools 4.3.1



/**
 * Files generated by hbm2java
 */
public class Files  implements java.io.Serializable {


     private int id;
     private int chatId;
     private String link;

    public Files() {
    }

    public Files(int id, int chatId, String link) {
       this.id = id;
       this.chatId = chatId;
       this.link = link;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getChatId() {
        return this.chatId;
    }
    
    public void setChatId(int chatId) {
        this.chatId = chatId;
    }
    public String getLink() {
        return this.link;
    }
    
    public void setLink(String link) {
        this.link = link;
    }




}


