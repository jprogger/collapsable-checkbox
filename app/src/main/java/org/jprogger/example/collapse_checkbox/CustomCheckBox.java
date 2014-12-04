package org.jprogger.example.collapse_checkbox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;

import org.jprogger.example.collapse_checkbox.org.collapsablecheckbox.R;

public class CustomCheckBox extends CheckBox {

    private Context context;

    public CustomCheckBox(Context context) {
        super(context);
        this.context = context;
    }

    public CustomCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public CustomCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onPreDraw() {
        return super.onPreDraw();
    }

    @Override
    public void setChecked(boolean checked) {
        if (context != null) {
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.expand);
            this.startAnimation(animation);
        }
        super.setChecked(checked);
    }
}
