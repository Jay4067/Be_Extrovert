package com.learning.getextrovert.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learning.getextrovert.Adapter.DashBoardAdapter;
import com.learning.getextrovert.Adapter.StoryAdapter;
import com.learning.getextrovert.Models.DashBoard;
import com.learning.getextrovert.Models.StoryModel;
import com.learning.getextrovert.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    RecyclerView storyRv,dashboardRv;
    ArrayList<StoryModel> storylist = new ArrayList<>();
    ArrayList<DashBoard> dashBoardArrayList = new ArrayList<>();


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        storyRv = view.findViewById(R.id.rv_story);
        storylist.add(new StoryModel(R.drawable.person1,R.drawable.live,R.drawable.b_beard,"User 1"));
        storylist.add(new StoryModel(R.drawable.g_red,R.drawable.live,R.drawable.b_blue,"User 2"));
        storylist.add(new StoryModel(R.drawable.b_beard,R.drawable.live,R.drawable.g_red,"User 3"));
        storylist.add(new StoryModel(R.drawable.profile,R.drawable.live,R.drawable.person1,"User 4"));

        StoryAdapter storyAdapter =new StoryAdapter(storylist,getContext());
        storyRv.setAdapter(storyAdapter);
        storyRv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        storyRv.setNestedScrollingEnabled(false);

        dashboardRv = view.findViewById(R.id.dashboard_rv);

        //This is for the post in dashboard
        DashBoardAdapter dashBoardAdapter = new DashBoardAdapter(dashBoardArrayList,getContext());
        dashboardRv.setAdapter(dashBoardAdapter);
        dashboardRv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        dashboardRv.setNestedScrollingEnabled(false);
        


        return view;
    }
}