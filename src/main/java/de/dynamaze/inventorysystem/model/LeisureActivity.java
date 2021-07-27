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
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeisureActivity {

    private UUID activityId=UUID.randomUUID();
    private String headLine;
    private String description;


    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date selectedDate;
}
