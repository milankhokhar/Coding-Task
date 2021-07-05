package de.dynamaze.model;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DataModel {


    private String headLine;
    private String description;
    private String hint;
    private String link;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date;

    

}
