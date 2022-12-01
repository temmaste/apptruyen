package com.example.apptruyen.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.apptruyen.R;
import com.example.apptruyen.adapter.CollectionPagerAdapter;
import com.example.apptruyen.model.Truyen;
import com.google.android.material.tabs.TabLayout;

public class xem_tt_truyen extends AppCompatActivity {
    TabLayout tabLayout ;
    ViewPager viewPager;
    TextView tenTruyen,tenTacGia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xem_tt_truyen);
        addControl();
        CollectionPagerAdapter adapter = new CollectionPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        //lay truyen ve
        Truyen truyen = (Truyen)getIntent().getSerializableExtra("truyen_tt");
        //hien chi tiet truyen
        tenTruyen.setText(truyen.getTentruyen());
        tenTacGia.setText(truyen.getTacgia().getTentacgia());

        addEvent();
    }

    private void addEvent() {
        
    }

    private void addControl() {
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.pager);
        tenTruyen=findViewById(R.id.tv_xemtt_tentruyen);
        tenTacGia=findViewById(R.id.tv_xemtt_tentacgia);
    }
}