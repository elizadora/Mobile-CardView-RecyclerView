package com.example.cardviewatv;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<CardView> newList;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_languages);
        newList = new ArrayList<>();

        CardView card1 = new CardView("Java", "Linguagem orientada a objetos para aplicativos corporativos.", R.drawable.java, R.color.card1);

        CardView card2 = new CardView("C++","Linguagem de alto desempenho para sistemas variados.", R.drawable.cplusplus, R.color.card2);

        CardView card3= new CardView("Ruby", "Linguagem dinâmica e simples para desenvolvimento.", R.drawable.ruby, R.color.card1);

        CardView card4 = new CardView("PHP","Linguagem de script popular para web.", R.drawable.php, R.color.card2);

        CardView card5 = new CardView("Haskell", "Linguagem funcional para aplicações complexas.", R.drawable.haskell, R.color.card1);


        newList.add(card1);
        newList.add(card2);
        newList.add(card3);
        newList.add(card4);
        newList.add(card5);

        adapter = new Adapter(newList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}