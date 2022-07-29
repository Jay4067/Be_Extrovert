package com.learning.getextrovert.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.learning.getextrovert.Models.FriendModel;
import com.learning.getextrovert.R;

import java.util.ArrayList;
import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.viewHolder>{

    List<FriendModel>friendmodelList ;
    Context context;

    public FriendAdapter(List<FriendModel> friendmodelList, Context context) {
        this.friendmodelList = friendmodelList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.friend_rv_sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        FriendModel model = friendmodelList.get(position);
        holder.friendImage.setImageResource(model.getProfile());

//        Glide.with(context)
//                .asBitmap()
//                .load(model.getUrl())
//                .into(holder.friendImage);
    }

    @Override
    public int getItemCount() {
        return friendmodelList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView friendImage;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            friendImage = itemView.findViewById(R.id.image_frnd_rv);
        }
    }
}
