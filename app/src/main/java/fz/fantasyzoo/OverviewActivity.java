//package fz.fantasyzoo;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import java.util.ArrayList;
//
//public class OverviewActivity extends AppCompatActivity {
//
//
//    Button add_animal_button;
//    TextView ocean_overview;
//    TextView swamp_overview;
//    TextView forest_overview;
//    TextView mountain_overview;
//    String ocean_report;
//    String swamp_report;
//    String forest_report;
//    String mountain_report;
//    Zoo zoo;
//    Intent intent;
//    String zooString;
//    ArrayList<Integer> buyingArray;
//    int enclosureIndex;
//String buyingArrayString;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_overview);
//if (intent == null) {intent = new Intent();
//            intent.putExtra("zoo", "");
//            intent.putExtra("buyingArray", "");
//    intent.putExtra("enclosureIndex", 0);
//} else {
//    Intent intent = getIntent();
//}
//
//
//    Bundle extras = intent.getExtras();
//        if (extras.getString("zoo") == "") {zoo = new Zoo();}
//
//Gson gson = new Gson();
//
//        if (extras.getString("zoo") != "") {
//            zooString = extras.getString("zoo");
//        }
//
//        if (extras.getString("buyingArray") != "") {
//            buyingArrayString = extras.getString("buyingArray");
//            buyingArray = (ArrayList<Integer>) gson.fromJson(buyingArrayString, ArrayList.class);
//            enclosureIndex = (extras.getInt("enclosureIndex"));
//            zoo.buyingAnimals(buyingArray, enclosureIndex);
//        }
//
//
//        add_animal_button = (Button) findViewById(R.id.add_animal_btn);
//
//        ocean_overview = (TextView) findViewById(R.id.ocean_overview);
//        swamp_overview = (TextView) findViewById(R.id.swamp_overview);
//        forest_overview = (TextView) findViewById(R.id.forest_overview);
//        mountain_overview = (TextView) findViewById(R.id.mountain_overview);
//
//        ocean_report = (zoo.getEnclosures().get(0).enclosureOverviewGen());
//        swamp_report = (zoo.getEnclosures().get(1).enclosureOverviewGen());
//        forest_report = (zoo.getEnclosures().get(2).enclosureOverviewGen());
//        mountain_report = (zoo.getEnclosures().get(3).enclosureOverviewGen());
//
//
//        ocean_overview.setText(ocean_report);
//        swamp_overview.setText(swamp_report);
//        forest_overview.setText(forest_report);
//        mountain_overview.setText(mountain_report);
//    }
//
//    public void onAddAnimalButtonClicked(View button) {
//        GsonBuilder gsonbuilder = new GsonBuilder();
//        gsonbuilder.registerTypeAdapter(VileFishman.class, new AnimalSerializer());
//        gsonbuilder.registerTypeAdapter(Dragon.class, new AnimalSerializer());
//        gsonbuilder.registerTypeAdapter(Troll.class, new AnimalSerializer());
//        gsonbuilder.registerTypeAdapter(GiantEagle.class, new AnimalSerializer());
//        gsonbuilder.registerTypeAdapter(Selkie.class, new AnimalSerializer());
//        gsonbuilder.registerTypeAdapter(Ent.class, new AnimalSerializer());
//        gsonbuilder.registerTypeAdapter(Unicorn.class, new AnimalSerializer());
//        gsonbuilder.registerTypeAdapter(Ghost.class, new AnimalSerializer());
////        gsonbuilder.registerTypeAdapter(Animal.class, new AnimalDeserializer());
//
//        Gson gson = gsonbuilder.create();
//        zooString = gson.toJson(zoo);
//
//        intent = new Intent(OverviewActivity.this, AddAnimalActivity.class);
//        intent.putExtra("zoo", zooString);
//        startActivity(intent);
//    }
//
//
//
//
//
//}
//
