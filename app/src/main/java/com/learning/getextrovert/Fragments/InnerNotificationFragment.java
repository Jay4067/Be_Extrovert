
package com.learning.getextrovert.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learning.getextrovert.Adapter.NotificationAdapter;
import com.learning.getextrovert.Models.NotificationModel;
import com.learning.getextrovert.R;

import java.util.ArrayList;


public class InnerNotificationFragment extends Fragment {

    RecyclerView recyclerView_noti;
    ArrayList<NotificationModel> notiifcation_list = new ArrayList<>();


    public InnerNotificationFragment() {
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
        View view = inflater.inflate(R.layout.fragment_inner_notification, container, false);

        recyclerView_noti = view.findViewById(R.id.notification_recycler_view);

        //We can use html tag in java syntax for more refer to adapter class
        notiifcation_list.add(new NotificationModel(R.drawable.person1,"<b>Arina </b>hi this is a humani being nice to meet you",
                "just now"));
        notiifcation_list.add(new NotificationModel(R.drawable.femalemodel,"<b>Jacob </b>hi this is a humani being nice to meet you",
                "just now"));
        notiifcation_list.add(new NotificationModel(R.drawable.women2,"<b>Winona </b>hi this is a humani being nice to meet you",
                "just now"));

        NotificationAdapter adapter =new NotificationAdapter(notiifcation_list,getContext());
        recyclerView_noti.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView_noti.setAdapter(adapter);
        recyclerView_noti.setHasFixedSize(true);

        return view;
    }
}