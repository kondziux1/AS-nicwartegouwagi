package pl.kondziux1.vet;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
        View V = getCurrentFocus();
        ListView listView = findViewById(R.id.listviu);

        ArrayList<String> gatunki = new ArrayList<String>();
        gatunki.add("Pies");
        gatunki.add("Kot");
        gatunki.add("Świnka Morska");

        ArrayAdapter<String> arradapt = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,gatunki);

        listView.setAdapter(arradapt);

        listView.setSelector(R.color.mil);
        TextView kibel = findViewById(R.id.karwa);


        View vi  = getCurrentFocus();
        vi.setOnClickListener(v ->{
            int kebab = listView.getSelectedItemPosition();
            kibel.setText(""+kebab);
        });



    }
}