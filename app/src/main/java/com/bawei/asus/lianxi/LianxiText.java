package com.bawei.asus.lianxi;

import android.widget.TextView;

/**
 * Created by asus on 2016/11/2.
 */
public class LianxiText extends LianxiView<TextView> {

    public static final float MIN_TEXT_SIZE = 10f;
    public static final float MAX_TEXT_SIZE = 100.0f;

    float scale;
    float textSize;

    public LianxiText(TextView view, float scale) {
        super(view);
        this.scale = scale;
        textSize = view.getTextSize();
    }

    @Override
    protected void zoomIn() {
        textSize -= scale;
        if (textSize < MIN_TEXT_SIZE)
        {
            textSize = MIN_TEXT_SIZE;
        }
        view.setTextSize(textSize);
    }

    @Override
    protected void zoomOut() {
        textSize += scale;
        if (textSize > MAX_TEXT_SIZE)
        {
            textSize = MAX_TEXT_SIZE;
        }
        view.setTextSize(textSize);
    }
}
