package com.sdt.tikihometest.utils;


import android.widget.ProgressBar;

import androidx.databinding.BindingAdapter;

public final class BindingUtils {

    private BindingUtils() {}

    @BindingAdapter({"colorFilter"})
    public static void setColorFilter(ProgressBar progressBar, int color) {
        ViewUtils.setColorFilter(progressBar.getIndeterminateDrawable(), color);
    }

}
