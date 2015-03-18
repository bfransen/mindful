package mindful.representation;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Created by ben on 15-03-08.
 */
public class Note {

    @Id
    private String id;

    private String referenceKey;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReferenceKey() {
        return referenceKey;
    }

    public void setReferenceKey(String referenceKey) {
        this.referenceKey = referenceKey;
    }
}
