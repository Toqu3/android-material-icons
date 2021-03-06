package com.malinskiy.materialicons.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.malinskiy.materialicons.Iconify;

public class IconTextView extends TextView {

    public IconTextView(Context context) {
        super(context);
        init();
    }

    public IconTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public IconTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        if (!isInEditMode())
            Iconify.addIcons(this);
        else
            this.setText(this.getText());
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(Iconify.compute(text), type);
    }

}
