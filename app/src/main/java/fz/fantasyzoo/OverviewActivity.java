package fz.fantasyzoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OverviewActivity extends AppCompatActivity {

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

        ocean_overview = (TextView) findViewById(R.id.ocean_overview);
        swamp_overview = (TextView) findViewById(R.id.swamp_overview);
        forest_overview = (TextView) findViewById(R.id.forest_overview);
        mountain_overview = (TextView) findViewById(R.id.mountain_overview);


        ocean_overview.setText(ocean_report);
swamp_overview.setText(swamp_report);
        forest_overview.setText(forest_report);
        mountain_overview.setText(mountain_report);


    }
}
