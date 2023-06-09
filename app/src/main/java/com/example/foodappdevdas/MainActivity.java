package com.example.foodappdevdas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.example.foodappdevdas.Adapters.MainAdapter;
import com.example.foodappdevdas.Models.MainModel;
import com.example.foodappdevdas.databinding.ActivityMainBinding;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        //list.add(new MainModel(R.drawable.qrcode,"TABLE BOOKING","000","YOU CAN SCAN THIS QR"));
        list.add(new MainModel(R.drawable.burgerimg,"Burger","185","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.pizza,"Pizza","220","Pizza with extra cheese"));
        list.add(new MainModel(R.drawable.fries,"Fries","105","Fries with extra cheese"));
        list.add(new MainModel(R.drawable.coke,"Coke","55","Aaj kuch tufani krte hai"));
        list.add(new MainModel(R.drawable.momos,"Momos","150","Chicken momos"));
        list.add(new MainModel(R.drawable.pasta,"Pasta","240","pasta with extra spice"));
        list.add(new MainModel(R.drawable.biryani,"Biryani","320","Chicken Dum biryani"));
        list.add(new MainModel(R.drawable.paneertikka,"Paneer Tikka","235","Panner with extra crisp"));
        list.add(new MainModel(R.drawable.mcveggie,"McVeggie Burger","145","An everyday classic burger with a delectable patty"));
        list.add(new MainModel(R.drawable.noodels,"Chicken Noodels","200","Chicken noodels"));
        list.add(new MainModel(R.drawable.friedrice,"Chicken fried rice","140","Just eat it"));
        MainAdapter adapter = new MainAdapter(list,this);
        binding.recylerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this, OrderActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}