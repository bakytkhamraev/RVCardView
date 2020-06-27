package com.example.recyclerviewcardview;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //Book+RVAdapter

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));
        lstBook.add(new Book("Парные свитшоты ", "Цена: 990с", R.drawable.one));

        RecyclerView myRV = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstBook);
        myRV.setLayoutManager(new GridLayoutManager(this, 2));
        myRV.setAdapter(myAdapter);
    }
}
