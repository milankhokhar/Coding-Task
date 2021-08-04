package de.dynamaze.inventorysystem.commands;

import de.dynamaze.inventorysystem.model.Hint;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class CreateActivity {
    private UUID activityId=UUID.randomUUID();
    private String headLine;

    public CreateActivity(UUID activityId, String headLine, String description, List<Hint> hints, Date selectedDate) {
        this.activityId = activityId;
        this.headLine = headLine;
        this.description = description;
        this.hints = hints;
        this.selectedDate = selectedDate;
    }

    private String description;
    private List<Hint> hints;


    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date selectedDate;
}
