package mindful.representation;

import java.util.Date;

/**
 * Created by ben on 15-03-08.
 */
public class Note {

    private String text;
    private String createdBy;
    private Date dateCreated;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
