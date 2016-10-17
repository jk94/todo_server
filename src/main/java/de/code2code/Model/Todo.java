package de.code2code.Model;

import java.util.Date;

/**
 * Created by Jan Koschke on 17.10.2016.
 */
public class Todo {

    private Date created_at;
    private String text;
    private boolean status = false;

    public Todo(){
    }

    public Todo(Date created_at, String text, boolean status) {
        this.created_at = created_at;
        this.text = text;
        this.status = status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
