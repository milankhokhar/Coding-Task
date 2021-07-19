package de.dynamaze.inventorysystem.model;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Providers extends LeisureActivityResponse {

    private Long id;
    private String url;
    private String providerName;


}
