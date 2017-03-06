package fz.fantasyzoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
    String zooString;
Zoo zoo;
    Intent intent;
    String buyingArrayString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_animal);
        Intent intent = getIntent();

        GsonBuilder gsonbuilder = new GsonBuilder();
        gsonbuilder.registerTypeAdapter(VileFishman.class, new AnimalDeserializer());
        gsonbuilder.registerTypeAdapter(Dragon.class, new AnimalDeserializer());
        gsonbuilder.registerTypeAdapter(Troll.class, new AnimalDeserializer());
        gsonbuilder.registerTypeAdapter(GiantEagle.class, new AnimalDeserializer());
        gsonbuilder.registerTypeAdapter(Selkie.class, new AnimalDeserializer());
        gsonbuilder.registerTypeAdapter(Ent.class, new AnimalDeserializer());
        gsonbuilder.registerTypeAdapter(Unicorn.class, new AnimalDeserializer());
        gsonbuilder.registerTypeAdapter(Ghost.class, new AnimalDeserializer());


        Gson gson = gsonbuilder.create();
        Bundle extras = intent.getExtras();

        zooString = extras.getString("zoo");
        Zoo zoo = gson.fromJson(zooString, Zoo.class);

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
        buyingArray = new ArrayList<Integer>();
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


        Gson gson = new Gson();
        zooString = gson.toJson(zoo);
        buyingArrayString = gson.toJson(buyingArray);


        Intent intent = new Intent(AddAnimalActivity.this, OverviewActivity.class);
        intent.putExtra("buyingArray", buyingArrayString);
        intent.putExtra("enclosureIndex", 0);
        intent.putExtra("zoo", zooString);

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



        Gson gson = new Gson();
        zooString = gson.toJson(zoo);
        buyingArrayString = gson.toJson(buyingArray);


        Intent intent = new Intent(AddAnimalActivity.this, OverviewActivity.class);
        intent.putExtra("buyingArray", buyingArrayString);
        intent.putExtra("enclosureIndex", 1);
        intent.putExtra("zoo", zooString);

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



        Gson gson = new Gson();
        zooString = gson.toJson(zoo);
        buyingArrayString = gson.toJson(buyingArray);


        Intent intent = new Intent(AddAnimalActivity.this, OverviewActivity.class);
        intent.putExtra("buyingArray", buyingArrayString);
        intent.putExtra("enclosureIndex", 2);
        intent.putExtra("zoo", zooString);

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

        Gson gson = new Gson();
        zooString = gson.toJson(zoo);
        buyingArrayString = gson.toJson(buyingArray);


        Intent intent = new Intent(AddAnimalActivity.this, OverviewActivity.class);
        intent.putExtra("buyingArray", buyingArrayString);
        intent.putExtra("enclosureIndex", 3);
        intent.putExtra("zoo", zooString);

        startActivity(intent);
    }





}
