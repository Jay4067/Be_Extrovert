package com.learning.getextrovert.Adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.learning.getextrovert.Models.NotificationModel;
import com.learning.getextrovert.R;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.viewHolder>{

    List<NotificationModel> notification_list;
    Context context;

    public NotificationAdapter(List<NotificationModel> notification_list, Context context) {
        this.notification_list = notification_list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.notification_rv_item_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        NotificationModel model =notification_list.get(position);
        holder.profile_image.setImageResource(model.getProfile());

        //Use html tag
        holder.tv_notification.setText(Html.fromHtml(model.getNotification()));
        holder.tv_time.setText(model.getTime());

    }

    @Override
    public int getItemCount() {
        return notification_list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView profile_image;
        TextView tv_notification,tv_time;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            profile_image = itemView.findViewById(R.id.profile_image_notification);
            tv_notification = itemView.findViewById(R.id.tv_notification);
            tv_time = itemView.findViewById(R.id.tv_time_notification);

        }
    }
}
