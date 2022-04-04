package com.example.Book_Shelf.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeServiceTest {

    CodeService codeService=new CodeService();

    @DisplayName("This test checks the length of short code if it is three")
    @Test
    void lengthOfShortCodeShouldBeThree(){
        //given

        //when
        String shortCode = codeService.getShortCode();

        //then
        assertEquals(3,shortCode.length());
    }


}