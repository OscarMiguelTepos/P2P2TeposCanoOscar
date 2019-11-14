package omtc.itics.tesoem.edu.p2p2teposcanooscar;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> ListaEstados;
    String[] strEstados;
    Spinner objSpiner;
    ArrayAdapter<String> listEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objSpiner = findViewById(R.id.cargalista);
        strEstados =new  String[]{"CDMX","Estado de Mexico","Sonora","Yucatan"};
        ListaEstados = new ArrayList<String>();
        Collections.addAll(ListaEstados, strEstados);
        listEstados = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ListaEstados);
        objSpiner.setAdapter(listEstados);


    }
}
