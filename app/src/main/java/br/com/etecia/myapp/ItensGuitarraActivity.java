package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

public class ItensGuitarraActivity extends AppCompatActivity {

    ViewPager2 idViewPagerItensGuitarra;
    TabLayout idTabLayoutItensGuitar;

    MaterialToolbar idToolBarItens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.itens_guitarra_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        idToolBarItens = findViewById(R.id.idToolBarItens);

        idViewPagerItensGuitarra = findViewById(R.id.idViewPagerItensGuitarra);
        idTabLayoutItensGuitar = findViewById(R.id.idTabLayoutItensGuitar);

        idToolBarItens.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),
                        MenuPrincipalActivity.class));
            }
        });

        AdapterItensGuitarra adapterItensMiniatura = new AdapterItensGuitarra(this);

        idViewPagerItensGuitarra.setAdapter(adapterItensMiniatura);

        idTabLayoutItensGuitar.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                idViewPagerItensGuitarra.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        idViewPagerItensGuitarra.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                idTabLayoutItensGuitar.getTabAt(position).select();
            }
        });




    }
}