package de.dynamaze.inventorysystem.commands;

import de.dynamaze.inventorysystem.model.Hint;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
public class CreateActivity {

    private String headLine;

    public CreateActivity(String headLine, String description, List<Hint> hints, Date selectedDate) {

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
