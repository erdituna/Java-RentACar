package com.etiya.RentACar.business.requests.LanguageWord;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageWordRequest {
    private int id;
    private int messageKeyId;

    private int languageId;

    private String translation;
}
