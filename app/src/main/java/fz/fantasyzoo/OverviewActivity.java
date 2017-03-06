package fz.fantasyzoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OverviewActivity extends AppCompatActivity {


    Button add_animal_button;
    TextView ocean_overview;
    TextView swamp_overview;
    TextView forest_overview;
    TextView mountain_overview;
    String ocean_report;
    String swamp_report;
    String forest_report;
    String mountain_report;
    Zoo zoo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        zoo = new Zoo();

        add_animal_button = (Button) findViewById(R.id.add_animal_btn);

        ocean_overview = (TextView) findViewById(R.id.ocean_overview);
        swamp_overview = (TextView) findViewById(R.id.swamp_overview);
        forest_overview = (TextView) findViewById(R.id.forest_overview);
        mountain_overview = (TextView) findViewById(R.id.mountain_overview);

        ocean_report = (zoo.getEnclosures().get(0).enclosureOverviewGen());
        swamp_report = (zoo.getEnclosures().get(1).enclosureOverviewGen());
        forest_report = (zoo.getEnclosures().get(2).enclosureOverviewGen());
        mountain_report = (zoo.getEnclosures().get(3).enclosureOverviewGen());


        ocean_overview.setText(ocean_report);
        swamp_overview.setText(swamp_report);
        forest_overview.setText(forest_report);
        mountain_overview.setText(mountain_report);
    }

    public void onAddAnimalButtonClicked(View button) {

        Intent intent = new Intent(OverviewActivity.this, AddAnimalActivity.class);
        startActivity(intent);
    }





}

