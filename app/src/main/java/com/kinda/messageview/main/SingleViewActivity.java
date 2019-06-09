package com.kinda.messageview.main;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import com.kinda.messageview.MessageView;

public class SingleViewActivity extends AppCompatActivity implements View.OnClickListener {

    //UI
    private MessageView mMessageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_view);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mMessageView = findViewById(R.id.chatMessageView);

        findViewById(R.id.btn_arrow_gravity_start).setOnClickListener(this);
        findViewById(R.id.btn_arrow_gravity_end).setOnClickListener(this);
        findViewById(R.id.btn_arrow_gravity_center).setOnClickListener(this);
        findViewById(R.id.btn_arrow_position_left).setOnClickListener(this);
        findViewById(R.id.btn_arrow_position_right).setOnClickListener(this);
        findViewById(R.id.btn_arrow_position_top).setOnClickListener(this);
        findViewById(R.id.btn_arrow_position_bottom).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_arrow_gravity_start) {
            mMessageView.setArrowGravity(MessageView.ArrowGravity.START);
        } else if (id == R.id.btn_arrow_gravity_center) {
            mMessageView.setArrowGravity(MessageView.ArrowGravity.CENTER);
        } else if (id == R.id.btn_arrow_gravity_end) {
            mMessageView.setArrowGravity(MessageView.ArrowGravity.END);
        } else if (id == R.id.btn_arrow_position_left) {
            mMessageView.setArrowPosition(MessageView.ArrowPosition.LEFT);
        } else if (id == R.id.btn_arrow_position_right) {
            mMessageView.setArrowPosition(MessageView.ArrowPosition.RIGHT);
        } else if (id == R.id.btn_arrow_position_top) {
            mMessageView.setArrowPosition(MessageView.ArrowPosition.TOP);
        } else if (id == R.id.btn_arrow_position_bottom) {
            mMessageView.setArrowPosition(MessageView.ArrowPosition.BOTTOM);
        }
    }
}
