package com.didikee.hweather.ui.customviews;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;

/**
 * Created by didik on 2017/2/16.
 */

public class SamsungWeatherScrollView extends NestedScrollView{
    public SamsungWeatherScrollView(Context context) {
        this(context,null);
    }

    public SamsungWeatherScrollView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SamsungWeatherScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
