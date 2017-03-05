package fz.fantasyzoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddAnimalActivity extends AppCompatActivity {

EditText buy_troll;
    EditText buy_vilefishman;
    EditText buy_gianteagle;
    EditText buy_selkie;
    EditText buy_ent;
    EditText buy_unicorn;
    EditText buy_dragon;

    Button ocean_btn;
    Button swamp_btn;
    Button forest_btn;
Button mountain_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_animal);
buy_troll = (EditText) findViewById(R.id.buy_troll);
        buy_vilefishman = (EditText) findViewById(R.id.buy_vilefishman);
                buy_gianteagle = (EditText) findViewById(R.id.buy_gianteagle);
        buy_selkie = (EditText) findViewById(R.id.buy_selkie);
        buy_ent = (EditText) findViewById(R.id.buy_ent);
        buy_unicorn = (EditText) findViewById(R.id.buy_unicorn);
        buy_dragon = (EditText) findViewById(R.id.buy_dragon);

        ocean_btn = (Button) findViewById(R.id.ocean_btn);
        swamp_btn = (Button) findViewById(R.id.swamp_btn);
        forest_btn = (Button) findViewById(R.id.forest_btn);
        mountain_btn = (Button) findViewById(R.id.mountain_btn);
    }
}
