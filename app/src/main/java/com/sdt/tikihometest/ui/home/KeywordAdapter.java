package com.sdt.tikihometest.ui.home;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.DiffUtil;

import com.sdt.tikihometest.R;
import com.sdt.tikihometest.databinding.ItemKeyWordBinding;
import com.sdt.tikihometest.ui.base.BaseAdapter;

import java.util.Random;

public class KeywordAdapter extends BaseAdapter<String, ItemKeyWordBinding> {

    private final String[] randomColors = {
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

    private final ArrayMap<String, Integer> selectedColorMap = new ArrayMap<>();

    private OnItemClickListener itemClickListener;

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
        Integer color;
        if (!selectedColorMap.containsKey(item)) {
            color = randomColor();
            selectedColorMap.put(item, color);
        } else {
            color = selectedColorMap.get(item);
            if (color == null) {
                color = randomColor();
            }
        }
        viewDataBinding.tvKeyword.setBackground(
            createCornerBackground(viewDataBinding.getRoot().getContext(), color));

        viewDataBinding.getRoot().setOnClickListener(v -> {
            if (itemClickListener != null)
                itemClickListener.onClick(item);
        });
    }

    private ShapeDrawable createCornerBackground(Context context, int color) {
        float cornerRadius = context.getResources().getDimension(R.dimen.keyword_radius);
        RoundRectShape roundRectShape = new RoundRectShape(new float[]{
            cornerRadius, cornerRadius, cornerRadius, cornerRadius,
            cornerRadius, cornerRadius, cornerRadius, cornerRadius}
            , null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(color);
        return shapeDrawable;
    }

    private int randomColor() {
        Random random = new Random();
        int randomIndex = random.nextInt(randomColors.length);
        return Color.parseColor(randomColors[randomIndex]);
    }

    public void setItemClickListener(OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public interface OnItemClickListener {
        void onClick(String item);
    }
}
