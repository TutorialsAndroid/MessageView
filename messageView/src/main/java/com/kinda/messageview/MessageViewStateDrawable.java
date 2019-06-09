package com.kinda.messageview;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.NonNull;

public abstract class MessageViewStateDrawable extends ColorDrawable {

    private boolean Pressed;

    MessageViewStateDrawable(int color) {
        super(color);
    }

    @Override
    protected boolean onStateChange(int[] state) {

        boolean pressed = isPressed(state);
        if (Pressed != pressed) {
            Pressed = pressed;
            onIsPressed(Pressed);
        }
        return true;
    }

    protected abstract void onIsPressed(boolean isPressed);

    @Override
    public boolean setState(@NonNull int[] stateSet) {
        return super.setState(stateSet);
    }

    @Override
    public boolean isStateful() {
        return true;
    }

    private boolean isPressed(int[] state) {
        boolean pressed = false;
        for (int i = 0, j = state != null ? state.length : 0; i < j; i++) {
            if (state[i] == android.R.attr.state_pressed) {
                pressed = true;
                break;
            }
        }
        return pressed;
    }
}
