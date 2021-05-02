package com.ayhanunal.mycustombutton.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.ayhanunal.mycustombutton.R;

public class CustomButton extends androidx.appcompat.widget.AppCompatButton {

    private boolean isRed = true;

    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomButton(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);
    }

    public void setIsRed(boolean isRed){
        this.isRed = isRed;
        changeBgColor();

    }

    private void changeBgColor() {
        setBackgroundResource(isRed ? R.drawable.bg_red : R.drawable.bg_green);
        setText(isRed? "Red" : "Green");
    }



}
