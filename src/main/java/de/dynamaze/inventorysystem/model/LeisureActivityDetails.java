package de.dynamaze.inventorysystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeisureActivityDetails {

    private String headLine;
    private String description;
    private List<String> hint;

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date selectedDate;
}
