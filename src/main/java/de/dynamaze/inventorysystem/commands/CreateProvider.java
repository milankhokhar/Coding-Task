package de.dynamaze.inventorysystem.commands;

import de.dynamaze.inventorysystem.model.LeisureActivity;
import lombok.Getter;

import java.util.Map;
import java.util.UUID;

@Getter
public class CreateProvider {

    private String url;
    private String providerName;


    public CreateProvider(String url, String providerName) {

        this.url = url;
        this.providerName = providerName;

    }
}
