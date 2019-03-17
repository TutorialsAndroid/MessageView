package com.kinda.postui.example;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.kinda.postui.PostMessageView;

public class SingleViewActivity extends AppCompatActivity implements View.OnClickListener {

    //UI
    private PostMessageView mPostMessageView;

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

        mPostMessageView = findViewById(R.id.chatMessageView);

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
            mPostMessageView.setArrowGravity(PostMessageView.ArrowGravity.START);
        } else if (id == R.id.btn_arrow_gravity_center) {
            mPostMessageView.setArrowGravity(PostMessageView.ArrowGravity.CENTER);
        } else if (id == R.id.btn_arrow_gravity_end) {
            mPostMessageView.setArrowGravity(PostMessageView.ArrowGravity.END);
        } else if (id == R.id.btn_arrow_position_left) {
            mPostMessageView.setArrowPosition(PostMessageView.ArrowPosition.LEFT);
        } else if (id == R.id.btn_arrow_position_right) {
            mPostMessageView.setArrowPosition(PostMessageView.ArrowPosition.RIGHT);
        } else if (id == R.id.btn_arrow_position_top) {
            mPostMessageView.setArrowPosition(PostMessageView.ArrowPosition.TOP);
        } else if (id == R.id.btn_arrow_position_bottom) {
            mPostMessageView.setArrowPosition(PostMessageView.ArrowPosition.BOTTOM);
        }
    }
}
