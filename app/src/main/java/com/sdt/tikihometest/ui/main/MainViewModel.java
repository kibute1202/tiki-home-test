package com.sdt.tikihometest.ui.main;

import com.sdt.tikihometest.data.source.keyword.KeywordRepository;
import com.sdt.tikihometest.ui.base.BaseViewModel;

import javax.inject.Inject;

public class MainViewModel extends BaseViewModel {

    private KeywordRepository keywordRepository;

    @Inject
    public MainViewModel(KeywordRepository keywordRepository) {
        this.keywordRepository = keywordRepository;
    }

}
