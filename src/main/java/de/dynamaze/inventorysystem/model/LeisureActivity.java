package de.dynamaze.inventorysystem.model;

import de.dynamaze.inventorysystem.commands.CreateActivity;
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

    private UUID activityId;
    private String headLine;
    private String description;
    private List<Hint> hints;


    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date selectedDate;


    public LeisureActivity(CreateActivity command) {
        this.activityId=UUID.randomUUID();
        this.headLine = command.getHeadLine();
        this.description = command.getDescription();
        this.hints = command.getHints();
        this.selectedDate = command.getSelectedDate();
    }

}
