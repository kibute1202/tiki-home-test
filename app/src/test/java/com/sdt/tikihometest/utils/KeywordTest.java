package com.sdt.tikihometest.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class KeywordTest {

    @Test
    public void formatKeywords() {
        String[] keywords = {
            "bitis hunter",
            "bitis hunter x",
            "tai nghe",
            "harry potter",
            "balo nữ",
            "nguyễn nhật ánh",
            "đắc nhân tâm",
            "tai nghe bluetooth",
            "kem chống nắng",
            "anh chính là thanh xuân của em",
            "trung tâm kiểm soát"
        };

        for (String keyword : keywords) {
            String newKeyword = BindingUtils.formatKeyword(keyword);
            // It's true if newKeyword != keyword
            assertNotEquals(newKeyword, keyword);
        }
    }

}