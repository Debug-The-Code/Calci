package com.example.akhil.calculator;

import android.app.AppComponentFactory;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

public class IconTextView extends android.support.v7.widget.AppCompatTextView {
    public IconTextView(Context context){
        super(context);
        init();
    }

    public IconTextView(Context context,AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public IconTextView(Context context,AttributeSet attrs,int defStyleAttr) {
        super(context, attrs,defStyleAttr);
        init();
    }

    private void init(){
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"fonts/fa-solid-900.ttf");
        setTypeface(typeface);
    }
}
