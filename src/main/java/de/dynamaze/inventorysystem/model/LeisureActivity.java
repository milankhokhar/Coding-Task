package de.dynamaze.inventorysystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
public class LeisureActivity {

    private UUID activityId=UUID.randomUUID();
    private String headLine;
    private String description;
    private List<Hint> hints;


    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date selectedDate;


    public LeisureActivity(String headLine, String description, List<Hint> hints, Date selectedDate) {
        this.headLine = headLine;
        this.description = description;
        this.hints = hints;
        this.selectedDate = selectedDate;
    }

}
