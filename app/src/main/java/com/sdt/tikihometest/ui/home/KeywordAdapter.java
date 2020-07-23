package com.sdt.tikihometest.ui.home;

import android.graphics.Color;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.DiffUtil;

import com.sdt.tikihometest.R;
import com.sdt.tikihometest.databinding.ItemKeyWordBinding;
import com.sdt.tikihometest.ui.base.BaseAdapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import timber.log.Timber;

public class KeywordAdapter extends BaseAdapter<String, ItemKeyWordBinding> {

    private String[] randomColors = {
        "#b71c1c",
        "#880e4f",
        "#9c27b0",
        "#673ab7",
        "#3f51b5",
        "#2196f3",
        "#03a9f4",
        "#00bcd4",
        "#009688",
        "#4caf50",
        "#ff5722",
        "#795548",
        "#607d8b",
    };

    private ArrayMap<String, Integer> selectedColorMap = new ArrayMap<>();

    public KeywordAdapter() {
        super(new DiffUtil.ItemCallback<String>() {
            @Override
            public boolean areItemsTheSame(@NonNull String oldItem, @NonNull String newItem) {
                return oldItem.equals(newItem);
            }

            @Override
            public boolean areContentsTheSame(@NonNull String oldItem, @NonNull String newItem) {
                return oldItem.equals(newItem);
            }
        });
    }

    @Override
    protected int getLayoutRes(int viewType) {
        return R.layout.item_key_word;
    }

    @Override
    protected void bindView(ItemKeyWordBinding viewDataBinding, String item, int position) {
        if (!selectedColorMap.containsKey(item)) {
            int color = randomColor();
            selectedColorMap.put(item, color);
            viewDataBinding.cardView.setCardBackgroundColor(color);
        } else {
            Integer color = selectedColorMap.get(item);
            if (color == null) {
                color = randomColor();
            }
            viewDataBinding.cardView.setCardBackgroundColor(color);
        }
    }

    private int randomColor() {
        Random random = new Random();
        int randomIndex = random.nextInt(randomColors.length);
        return Color.parseColor(randomColors[randomIndex]);
    }
}
