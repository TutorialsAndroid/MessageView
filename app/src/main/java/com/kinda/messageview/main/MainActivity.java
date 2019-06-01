package com.kinda.messageview.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //UI
    private RecyclerView recyclerView;
    private EditText editText;
    private ImageView imageView;
    private FloatingActionButton floatingActionButton;

    //Class
    private MessageViewAdapter messageViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        } else if (id == R.id.action_single_view) {
            Intent intent = new Intent(this, SingleViewActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if ( v == floatingActionButton) {
            String message = editText.getText().toString();
            if (TextUtils.isEmpty(message)) {
                return;
            }
            sendMessage(message);
            editText.setText("");
        }

        if ( v == imageView) {
            sendMessage();
        }
    }

    private void initViews() {
        // initialize components
        recyclerView = findViewById(R.id.recyclerView);
        editText = findViewById(R.id.edit_message);
        floatingActionButton = findViewById(R.id.button_send);
        imageView = findViewById(R.id.iv_image);

        //click listener
        floatingActionButton.setOnClickListener(this);
        imageView.setOnClickListener(this);

        //edit text change listener
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (s.toString().trim().length() == 0) {
                    //gone and disable the send button
                    floatingActionButton.setEnabled(false);
                    floatingActionButton.hide();
                } else {
                    //visible and enables the send button
                    floatingActionButton.setEnabled(true);
                    floatingActionButton.show();
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {}

        });

        //initialize recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        messageViewAdapter = new MessageViewAdapter(this, new ArrayList<MessageV>());
        recyclerView.setAdapter(messageViewAdapter);
    }

    private void sendMessage(String message) {
        MessageV messageV = new MessageV(message, true, false);
        messageViewAdapter.add(messageV);

        mediaMessage(message);
    }

    private void sendMessage() {
        MessageV messageV = new MessageV(null, true, true);
        messageViewAdapter.add(messageV);

        mediaMessage();
    }

    private void mediaMessage(String message) {
        MessageV messageV = new MessageV(message, false, false);
        messageViewAdapter.add(messageV);

        recyclerView.scrollToPosition(messageViewAdapter.getItemCount() - 1);
    }

    private void mediaMessage() {
        MessageV messageV = new MessageV(null, false, true);
        messageViewAdapter.add(messageV);

        recyclerView.scrollToPosition(messageViewAdapter.getItemCount() - 1);
    }
}