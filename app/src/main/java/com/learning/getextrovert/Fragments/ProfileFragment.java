package com.learning.getextrovert.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learning.getextrovert.Adapter.FriendAdapter;
import com.learning.getextrovert.Models.FriendModel;
import com.learning.getextrovert.R;

import java.util.ArrayList;
import java.util.List;


public class ProfileFragment extends Fragment {

    RecyclerView rv_friend;
    List<FriendModel> friendlist  = new ArrayList<>();

    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        rv_friend = view.findViewById(R.id.rv_friends);

//        friendlist.add(new FriendModel("https://picsum.photos/200/300\n"));
        friendlist.add(new FriendModel(R.drawable.model2));
        friendlist.add(new FriendModel(R.drawable.femalemodel));
        friendlist.add(new FriendModel(R.drawable.person1));

        FriendAdapter friendAdapter = new FriendAdapter(friendlist,getContext());
        rv_friend.setAdapter(friendAdapter);
        rv_friend.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        rv_friend.setNestedScrollingEnabled(false);
        return view;
    }
}