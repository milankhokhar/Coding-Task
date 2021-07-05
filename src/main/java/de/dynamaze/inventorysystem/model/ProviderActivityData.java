package de.dynamaze.inventorysystem.model;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProviderActivityData {


    private List<String> headLine;
    private List<String> description;
    private List<String> hint;
    private String link;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date;



}
