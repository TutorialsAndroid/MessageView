package com.developer.kinda.messageview;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.developer.kinda.MessageView;

public class MessageViewAdapter extends RecyclerView.Adapter<MessageViewAdapter.MessageHolder> {

    private static final int MY_MESSAGE = 0, OTHER_MESSAGE = 1;
    private final List<MessageV> mMessages;
    private final Context context;

    MessageViewAdapter(Context context, List<MessageV> data) {
        this.context = context;
        mMessages = data;
    }

    @Override
    public int getItemCount() {
        return mMessages == null ? 0 : mMessages.size();
    }

    @Override
    public int getItemViewType(int position) {
        MessageV item = mMessages.get(position);

        if (item.isMine()) return MY_MESSAGE;
        else return OTHER_MESSAGE;
    }

    @NonNull
    @Override
    public MessageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == MY_MESSAGE) {
            return new MessageHolder(LayoutInflater.from(context).inflate(R.layout.item_mine_message, parent, false));
        } else {
            return new MessageHolder(LayoutInflater.from(context).inflate(R.layout.item_other_message, parent, false));
        }
    }

    void add(MessageV message) {
        mMessages.add(message);
        notifyItemInserted(mMessages.size() - 1);
    }

    @Override
    public void onBindViewHolder(@NonNull final MessageHolder holder, final int position) {
        MessageV messageV = mMessages.get(position);
        if (messageV.isImage()) {
            holder.ivImage.setVisibility(View.VISIBLE);
            holder.tvMessage.setVisibility(View.GONE);

            holder.ivImage.setImageResource(R.drawable.img_sample);
        } else {
            holder.ivImage.setVisibility(View.GONE);
            holder.tvMessage.setVisibility(View.VISIBLE);

            holder.tvMessage.setText(messageV.getContent());
        }

        String date = new SimpleDateFormat("hh:mm aa", Locale.getDefault()).format(new Date());
        holder.tvTime.setText(date);

        holder.messageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    class MessageHolder extends RecyclerView.ViewHolder {
        final TextView tvMessage;
        final TextView tvTime;
        final ImageView ivImage;
        final MessageView messageView;

        MessageHolder(View itemView) {
            super(itemView);
            messageView = itemView.findViewById(R.id.chatMessageView);
            tvMessage = itemView.findViewById(R.id.tv_message);
            tvTime = itemView.findViewById(R.id.tv_time);
            ivImage = itemView.findViewById(R.id.iv_image);
        }
    }
}