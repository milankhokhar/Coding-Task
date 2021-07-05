package de.dynamaze.model;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DataModel {


    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DataModel(String headLine, String description, String hint, String link, Date date) {
        this.headLine = headLine;
        this.description = description;
        this.hint = hint;
        this.link = link;
        this.date = date;
    }

    private String headLine;
    private String description;
    private String hint;
    private String link;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date;

    public DataModel(){}





}
