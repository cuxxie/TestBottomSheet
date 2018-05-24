package com.example.nakama.testbottomsheet.activities;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nakama.testbottomsheet.R;
import com.example.nakama.testbottomsheet.adapter.BottomSheetContentAdapter;
import com.example.nakama.testbottomsheet.model.BaseModel;
import com.example.nakama.testbottomsheet.model.ButtonViewHolderModel;
import com.example.nakama.testbottomsheet.model.ImageViewHolderModel;
import com.example.nakama.testbottomsheet.model.TextViewHolderModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BottomSheetBehavior bottomSheetBehavior;
    RecyclerView bottomSheetContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayout bottomSheetViewgroup = (LinearLayout) findViewById(R.id.bottom_sheet_map);
        bottomSheetContent = (RecyclerView)bottomSheetViewgroup.findViewById(R.id.recycleview);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetViewgroup);
        bottomSheetBehavior.setHideable(false);
        setupBottomSheet();
    }

    private void setupBottomSheet(){
        bottomSheetContent.setLayoutManager(new LinearLayoutManager(this));
        ButtonViewHolderModel button1 = new ButtonViewHolderModel("First button is this","First");
        ImageViewHolderModel image = new ImageViewHolderModel("http://lorempixel.com/800/600/");
        TextViewHolderModel text = new TextViewHolderModel("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec commodo ullamcorper libero, a laoreet libero mattis eget. Sed sagittis efficitur lacinia. Nunc eu nibh in ligula convallis pretium sit amet nec dolor. Fusce gravida dolor eu ante rutrum eleifend. Ut pretium dui ac maximus porttitor. Mauris vitae fringilla enim. Ut luctus neque vitae porttitor consequat. Proin vitae lorem at nisl lobortis viverra id eu justo. Fusce at ipsum non nisl fringilla mattis quis at purus. Aliquam finibus risus eros, vel vestibulum diam finibus quis. Sed at molestie erat. Pellentesque vulputate sed mi a rutrum. Vivamus aliquet tellus sem, eu ultrices arcu molestie vel. Vivamus sollicitudin risus quis lorem vehicula dapibus.");
        TextViewHolderModel text2 = new TextViewHolderModel("Praesent vitae est id risus sodales rutrum a a nulla. Nullam maximus augue augue, faucibus feugiat quam dignissim ut. Nunc ut quam tincidunt, placerat nisi quis, finibus nibh. Morbi tristique faucibus auctor. Cras eget sodales justo. Morbi nec aliquam sem. Morbi varius magna sit amet massa tincidunt, in rutrum mi posuere. Maecenas turpis ligula, eleifend ut luctus at, maximus fermentum purus. Sed viverra non urna in euismod.");
        ButtonViewHolderModel button2 = new ButtonViewHolderModel("Second button is this","Second");
        ImageViewHolderModel image2 = new ImageViewHolderModel("http://lorempixel.com/900/600/");
        ArrayList<BaseModel> bottomSheetData = new ArrayList<>();
        bottomSheetData.add(text);
        bottomSheetData.add(image);
        bottomSheetData.add(button1);
        bottomSheetData.add(text2);
        bottomSheetData.add(button2);
        bottomSheetData.add(image2);
        BottomSheetContentAdapter adapter = new BottomSheetContentAdapter(bottomSheetData);
        bottomSheetContent.setAdapter(adapter);
    }
}
