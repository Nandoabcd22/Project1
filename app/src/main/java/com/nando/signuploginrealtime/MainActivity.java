package com.nando.signuploginrealtime;
import com.nando.signuploginrealtime.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
                R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i};
        String[] name = {"Setia Nanda Pangestu","Riskiana Febi Hardianti","Sofyan Priya Ahmadi","Febri","Gesang Agung","Seli Handayani","Rohim Maulana","Ichi Revan","Rifki Bahtiar"};
        String[] lastMessage = {"Teknologi Informasi","Manejemen Agribisnis","Teknologi Informasi","Teknik","Teknologi Informasi",
                "Teknologi Informasi","Teknik","Teknologi Informasi","Teknologi Informasi"};
        String[] lastmsgTime = {"8:45 pm","9:00 am","7:34 pm","6:32 am","5:76 am",
                "5:00 am","7:34 pm","2:32 am","7:76 am"};
        String[] nim = {"E41220141","E41220555","E41220999","E41220333","E41220888",
                "E41220666","E41220111","E41220131","E41220987"};
        String[] prodi = {"Teknik Informatika","Manejemen Agribisnis","Teknik Informatika","Teknik Informatika","Teknik Komputer","Teknik Komputer","Teknik","Teknik Informatika","Teknik Informatika"};

        ArrayList<User> userArrayList = new ArrayList<>();

        for(int i = 0;i< imageId.length;i++){

            User user = new User(name[i],lastMessage[i],lastmsgTime[i],nim[i],prodi[i],imageId[i]);
            userArrayList.add(user);

        }


        ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this, UserActivity.class);
                i.putExtra("name",name[position]);
                i.putExtra("nim",nim[position]);
                i.putExtra("prodi",prodi[position]);
                i.putExtra("imageid",imageId[position]);
                startActivity(i);

            }
        });

    }
}