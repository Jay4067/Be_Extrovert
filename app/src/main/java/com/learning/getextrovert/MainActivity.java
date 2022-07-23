package com.learning.getextrovert;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.iammert.library.readablebottombar.ReadableBottomBar;
import com.learning.getextrovert.Fragments.AddFragment;
import com.learning.getextrovert.Fragments.HomeFragment;
import com.learning.getextrovert.Fragments.NotificationFragment;
import com.learning.getextrovert.Fragments.ProfileFragment;
import com.learning.getextrovert.Fragments.SearchFragment;
import com.learning.getextrovert.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,new HomeFragment());
        transaction.commit();


        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {

                //Every time you consider transaction you need to define FragmentTransaction
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                switch(i){
                    case 0:
                        transaction.replace(R.id.container,new HomeFragment());
                        Toast.makeText(MainActivity.this, "Home selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        transaction.replace(R.id.container,new NotificationFragment());
                        break;
                    case 2:
                        transaction.replace(R.id.container,new AddFragment());
                        break;
                    case 3:
                        transaction.replace(R.id.container,new SearchFragment());
                        break;
                    case 4:
                        transaction.replace(R.id.container,new ProfileFragment());
                        break;


                }
                transaction.commit();
            }
        });
    }
}