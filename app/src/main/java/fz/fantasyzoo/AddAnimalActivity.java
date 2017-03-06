package fz.fantasyzoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AddAnimalActivity extends AppCompatActivity {

EditText buy_troll;
    Integer trolls;
    EditText buy_vilefishman;
    Integer vFmen;
    EditText buy_gianteagle;
    Integer gEagles;
    EditText buy_selkie;
    Integer selkies;
    EditText buy_ent;
    Integer ents;
    EditText buy_unicorn;
    Integer unicorns;
    EditText buy_dragon;
    Integer dragons;

    Button ocean_btn;
    Button swamp_btn;
    Button forest_btn;
Button mountain_btn;
    ArrayList<Integer> buyingArray;


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


    public void onOceanButtonClicked(View button) {
        trolls = Integer.parseInt((buy_troll.getText().toString()));
        buyingArray.add(0, trolls);

        vFmen = Integer.parseInt((buy_vilefishman.getText().toString()));
        buyingArray.add(1, vFmen);

        gEagles = Integer.parseInt((buy_gianteagle.getText().toString()));
        buyingArray.add(2, gEagles);

        selkies = Integer.parseInt((buy_selkie.getText().toString()));
        buyingArray.add(3, selkies);

        ents = Integer.parseInt((buy_ent.getText().toString()));
        buyingArray.add(4, ents);

        unicorns = Integer.parseInt((buy_unicorn.getText().toString()));
        buyingArray.add(5, unicorns);

        dragons = Integer.parseInt((buy_dragon.getText().toString()));
        buyingArray.add(6, dragons);



        Intent intent = new Intent(AddAnimalActivity.this, OverviewActivity.class);
        intent.putExtra("buyingArray", buyingArray);
        intent.putExtra("enclosureIndex", 0);
        startActivity(intent);
    }

    public void onSwampButtonClicked(View button) {
        trolls = Integer.parseInt((buy_troll.getText().toString()));
        buyingArray.add(0, trolls);

        vFmen = Integer.parseInt((buy_vilefishman.getText().toString()));
        buyingArray.add(1, vFmen);

        gEagles = Integer.parseInt((buy_gianteagle.getText().toString()));
        buyingArray.add(2, gEagles);

        selkies = Integer.parseInt((buy_selkie.getText().toString()));
        buyingArray.add(3, selkies);

        ents = Integer.parseInt((buy_ent.getText().toString()));
        buyingArray.add(4, ents);

        unicorns = Integer.parseInt((buy_unicorn.getText().toString()));
        buyingArray.add(5, unicorns);

        dragons = Integer.parseInt((buy_dragon.getText().toString()));
        buyingArray.add(6, dragons);



        Intent intent = new Intent(AddAnimalActivity.this, OverviewActivity.class);
        intent.putExtra("buyingArray", buyingArray);
        intent.putExtra("enclosureIndex", 1);

        startActivity(intent);
    }

    public void onForestButtonClicked(View button) {
        trolls = Integer.parseInt((buy_troll.getText().toString()));
        buyingArray.add(0, trolls);

        vFmen = Integer.parseInt((buy_vilefishman.getText().toString()));
        buyingArray.add(1, vFmen);

        gEagles = Integer.parseInt((buy_gianteagle.getText().toString()));
        buyingArray.add(2, gEagles);

        selkies = Integer.parseInt((buy_selkie.getText().toString()));
        buyingArray.add(3, selkies);

        ents = Integer.parseInt((buy_ent.getText().toString()));
        buyingArray.add(4, ents);

        unicorns = Integer.parseInt((buy_unicorn.getText().toString()));
        buyingArray.add(5, unicorns);

        dragons = Integer.parseInt((buy_dragon.getText().toString()));
        buyingArray.add(6, dragons);



        Intent intent = new Intent(AddAnimalActivity.this, OverviewActivity.class);
        intent.putExtra("buyingArray", buyingArray);
        intent.putExtra("enclosureIndex", 2);

        startActivity(intent);
    }

    public void onMountainButtonClicked(View button) {
        trolls = Integer.parseInt((buy_troll.getText().toString()));
        buyingArray.add(0, trolls);

        vFmen = Integer.parseInt((buy_vilefishman.getText().toString()));
        buyingArray.add(1, vFmen);

        gEagles = Integer.parseInt((buy_gianteagle.getText().toString()));
        buyingArray.add(2, gEagles);

        selkies = Integer.parseInt((buy_selkie.getText().toString()));
        buyingArray.add(3, selkies);

        ents = Integer.parseInt((buy_ent.getText().toString()));
        buyingArray.add(4, ents);

        unicorns = Integer.parseInt((buy_unicorn.getText().toString()));
        buyingArray.add(5, unicorns);

        dragons = Integer.parseInt((buy_dragon.getText().toString()));
        buyingArray.add(6, dragons);



        Intent intent = new Intent(AddAnimalActivity.this, OverviewActivity.class);
        intent.putExtra("buyingArray", buyingArray);
        intent.putExtra("enclosureIndex", 3);

        startActivity(intent);
    }




}
