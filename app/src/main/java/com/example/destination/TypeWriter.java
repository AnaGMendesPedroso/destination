package com.example.destination;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;

public class TypeWriter extends androidx.appcompat.widget.AppCompatTextView {
    private  CharSequence text;
    private int index;
    private long delay = 80; // in milisegundos

    public TypeWriter(Context context) {
        super(context);
    }

    public  TypeWriter(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    private Handler handler = new Handler();

    private Runnable characterAdder = new Runnable() {
        @Override
        public void run() {
            setText(text.subSequence(0, index++));
            if (index <= text.length()) {
                handler.postDelayed(characterAdder, delay);
            }
        }
    };

    public void animateText(CharSequence txt){
        text = txt;
        index = 0;

        setText("");
        handler.removeCallbacks(characterAdder);
        handler.postDelayed(characterAdder, delay);
    }

    public void setCharacterAdder(long m){
        delay = m;
    }
}
