package com.learning.getextrovert.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.learning.getextrovert.Models.DashBoard;
import com.learning.getextrovert.R;

import java.util.List;

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.viewHolder> {

    List<DashBoard> dashboardPostlist;
    Context context;

    public DashBoardAdapter(List<DashBoard> dashboardPostlist, Context context) {
        this.dashboardPostlist = dashboardPostlist;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dashboard_post_rv,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        DashBoard model = dashboardPostlist.get(position);

        holder.profile.setImageResource(model.getProfile());
        holder.postImage.setImageResource(model.getPostImage());
        holder.name.setText(model.getName());
        holder.about.setText(model.getAbout());
        holder.like.setText(model.getLike());
        holder.comment.setText(model.getComment());
        holder.share.setText(model.getShare());



    }

    @Override
    public int getItemCount() {
       return dashboardPostlist.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView profile,postImage,save;
        TextView name,about,like,comment,share;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            profile = itemView.findViewById(R.id.profile_image_dash);
            postImage = itemView.findViewById(R.id.post_image_dash);
            save = itemView.findViewById(R.id.save);
            name = itemView.findViewById(R.id.usern_rv_dash);
            about = itemView.findViewById(R.id.user_about_dash);
            like = itemView.findViewById(R.id.like_dash);
            comment = itemView.findViewById(R.id.comment_dash);
            share = itemView.findViewById(R.id.share_dash);
        }
    }
}
