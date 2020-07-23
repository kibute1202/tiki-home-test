package com.sdt.tikihometest.utils;

import org.junit.Test;

import timber.log.Timber;

import static org.junit.Assert.*;

public class KeywordTest {

    @Test
    public void formatKeywords() {
        String keyword = "nguyễn nhật ánh";
        String expected = "nguyễn\nnhật ánh";
        String newKeyword = BindingUtils.formatKeyword(keyword);
        assertEquals(newKeyword, expected);
    }

}