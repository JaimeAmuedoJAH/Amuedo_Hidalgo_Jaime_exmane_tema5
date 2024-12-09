package com.jah.amuedo_hidalgo_jaime_exmane_tema5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    MaterialToolbar mtbMenu;
    RecyclerView rvEstudiantes;
    LinearLayoutManager disposicion;
    AdaptadorEstudiante adaptadorEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        setSupportActionBar(mtbMenu);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        adaptadorEstudiante = new AdaptadorEstudiante(GestionEstudiante.getArrEstudiante());
        rvEstudiantes.setAdapter(adaptadorEstudiante);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.item_salir){
            finishAffinity();
        }
        return false;
    }

    private void initComponents() {
        rvEstudiantes = findViewById(R.id.rvEstudiantes);
        mtbMenu = findViewById(R.id.mtbMenu);
        GestionEstudiante.cargarDatos();
        disposicion = new LinearLayoutManager(getApplicationContext());
        rvEstudiantes.setLayoutManager(disposicion);
        adaptadorEstudiante = new AdaptadorEstudiante(GestionEstudiante.getArrEstudiante());
        rvEstudiantes.setAdapter(adaptadorEstudiante);
    }
}