package com.sdt.tikihometest.ui.home;

import androidx.lifecycle.MutableLiveData;

import com.sdt.tikihometest.data.source.keyword.KeywordRepository;
import com.sdt.tikihometest.ui.base.BaseViewModel;
import com.sdt.tikihometest.utils.rx.SchedulerProvider;

import java.util.Arrays;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;
import timber.log.Timber;

public class HomeViewModel extends BaseViewModel {

    private KeywordRepository keywordRepository;

    private MutableLiveData<String> keywordsLiveData;

    @Inject
    public HomeViewModel(SchedulerProvider schedulerProvider,
                         KeywordRepository keywordRepository) {
        super(schedulerProvider);
        this.keywordRepository = keywordRepository;
        loadData();
    }

    private void loadData() {
        if (keywordsLiveData == null) {
            keywordsLiveData = new MutableLiveData<>();
        }

        Disposable disposable = keywordRepository.getKeywords()
            .subscribeOn(io())
            .observeOn(ui())
            .subscribe(keywords -> {
                Timber.i("Keywords: %s", Arrays.toString(keywords.toArray()));
            }, this::onLoadingError);

        addDisposable(disposable);
    }

}
