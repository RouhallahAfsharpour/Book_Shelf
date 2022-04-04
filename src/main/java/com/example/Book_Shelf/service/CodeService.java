package com.example.Book_Shelf.service;

import org.springframework.stereotype.Service;

@Service
public class CodeService {

    private final String POSSIBLE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public String getShortCode(){
        StringBuilder shortCode = new StringBuilder();

        while (shortCode.length() != 3) {
            //Generate random alphanumeric string
            int character = (int) (Math.random() * POSSIBLE_CHARACTERS.length());
            shortCode.append(POSSIBLE_CHARACTERS.charAt(character));
        }

        return shortCode.toString();
    }

}
