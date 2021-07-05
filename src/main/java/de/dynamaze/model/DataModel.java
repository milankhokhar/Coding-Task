package de.dynamaze.model;


public class DataModel {

    public DataModel(String headLine, String description, String hint, String link) {
        this.headLine = headLine;
        this.description = description;
        this.hint = hint;
        this.link = link;
    }

    private String headLine;
    private String description;
    private String hint;

    public DataModel(){}



    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

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

    private String link;

    @Override
    public String toString() {
        return "DataModel{" +
                "link='" + link + '\'' +
                ", headLine='" + headLine + '\'' +
                ", description='" + description + '\'' +
                ", hint='" + hint + '\'' +
                '}';
    }


}
