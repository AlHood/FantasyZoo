package fz.fantasyzoo;

import android.support.design.widget.TabLayout;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class NewMainActivity extends AppCompatActivity {

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
    String buyingArrayString;

    TextView ocean_overview;
    TextView swamp_overview;
    TextView forest_overview;
    TextView mountain_overview;
    String ocean_report;
    String swamp_report;
    String forest_report;
    String mountain_report;
    int enclosureIndex;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        zoo = new Zoo();

        setContentView(R.layout.activity_new_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    AddAnimalTab tab1 = new AddAnimalTab();
                    return tab1;
                case 1:
                    OverviewTab tab2 = new OverviewTab();
                    return tab2;
                case 2:
                    ReportTab tab3 = new ReportTab();
                    return tab3;
            }
            return null;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Add Animal";
                case 1:
                    return "Overview";
                case 2:
                    return "Weekly Report";
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

    }

    public void onOceanButtonClicked(View button) {
        ArrayList<Integer> buyingArray = new ArrayList<Integer>();
        EditText trollNumbersET = (EditText) button.getRootView().findViewById(R.id.buy_troll);
        String trollNumbers = trollNumbersET.getText().toString();
        trolls = Integer.parseInt(trollNumbers);
        buyingArray.add(0, trolls);

        EditText vFMET = (EditText) button.getRootView().findViewById(R.id.buy_vilefishman);
        String vFmenNumbers = vFMET.getText().toString();
        vFmen = Integer.parseInt(vFmenNumbers);
        buyingArray.add(1, vFmen);

        EditText gEagleET = (EditText) button.getRootView().findViewById(R.id.buy_gianteagle);
        String gEagleNumbers = gEagleET.getText().toString();
        gEagles = Integer.parseInt(gEagleNumbers);
        buyingArray.add(2, gEagles);

        EditText selkieET = (EditText) button.getRootView().findViewById(R.id.buy_selkie);
        String selkieNumbers = selkieET.getText().toString();
        selkies = Integer.parseInt(selkieNumbers);
        buyingArray.add(3, selkies);

        EditText entET = (EditText) button.getRootView().findViewById(R.id.buy_ent);
        String entNumbers = entET.getText().toString();
        ents = Integer.parseInt(entNumbers);
        buyingArray.add(4, ents);

        EditText unicornET = (EditText) button.getRootView().findViewById(R.id.buy_unicorn);
        String unicornNumbers = unicornET.getText().toString();
        unicorns = Integer.parseInt(unicornNumbers);
        buyingArray.add(5, unicorns);

        EditText dragonET = (EditText) button.getRootView().findViewById(R.id.buy_dragon);
        String dragonNumbers = dragonET.getText().toString();
        dragons = Integer.parseInt(dragonNumbers);
        buyingArray.add(6, dragons);
        buyingArray.add(7, 0);

zoo.buyingAnimals(buyingArray, 0);

    }

    public void onSwampButtonClicked(View button) {
        ArrayList<Integer> buyingArray = new ArrayList<Integer>();
        EditText trollNumbersET = (EditText) button.getRootView().findViewById(R.id.buy_troll);
        String trollNumbers = trollNumbersET.getText().toString();
        trolls = Integer.parseInt(trollNumbers);
        buyingArray.add(0, trolls);

        EditText vFMET = (EditText) button.getRootView().findViewById(R.id.buy_vilefishman);
        String vFmenNumbers = vFMET.getText().toString();
        vFmen = Integer.parseInt(vFmenNumbers);
        buyingArray.add(1, vFmen);

        EditText gEagleET = (EditText) button.getRootView().findViewById(R.id.buy_gianteagle);
        String gEagleNumbers = gEagleET.getText().toString();
        gEagles = Integer.parseInt(gEagleNumbers);
        buyingArray.add(2, gEagles);

        EditText selkieET = (EditText) button.getRootView().findViewById(R.id.buy_selkie);
        String selkieNumbers = selkieET.getText().toString();
        selkies = Integer.parseInt(selkieNumbers);
        buyingArray.add(3, selkies);

        EditText entET = (EditText) button.getRootView().findViewById(R.id.buy_ent);
        String entNumbers = entET.getText().toString();
        ents = Integer.parseInt(entNumbers);
        buyingArray.add(4, ents);

        EditText unicornET = (EditText) button.getRootView().findViewById(R.id.buy_unicorn);
        String unicornNumbers = unicornET.getText().toString();
        unicorns = Integer.parseInt(unicornNumbers);
        buyingArray.add(5, unicorns);

        EditText dragonET = (EditText) button.getRootView().findViewById(R.id.buy_dragon);
        String dragonNumbers = dragonET.getText().toString();
        dragons = Integer.parseInt(dragonNumbers);
buyingArray.add(6, dragons);

        buyingArray.add(7, 0);


        zoo.buyingAnimals(buyingArray, 1);


    }
    public void onForestButtonClicked(View button) {
        ArrayList<Integer> buyingArray = new ArrayList<Integer>();
        EditText trollNumbersET = (EditText) button.getRootView().findViewById(R.id.buy_troll);
        String trollNumbers = trollNumbersET.getText().toString();
        trolls = Integer.parseInt(trollNumbers);
        buyingArray.add(0, trolls);

        EditText vFMET = (EditText) button.getRootView().findViewById(R.id.buy_vilefishman);
        String vFmenNumbers = vFMET.getText().toString();
        vFmen = Integer.parseInt(vFmenNumbers);
        buyingArray.add(1, vFmen);

        EditText gEagleET = (EditText) button.getRootView().findViewById(R.id.buy_gianteagle);
        String gEagleNumbers = gEagleET.getText().toString();
        gEagles = Integer.parseInt(gEagleNumbers);
        buyingArray.add(2, gEagles);

        EditText selkieET = (EditText) button.getRootView().findViewById(R.id.buy_selkie);
        String selkieNumbers = selkieET.getText().toString();
        selkies = Integer.parseInt(selkieNumbers);
        buyingArray.add(3, selkies);

        EditText entET = (EditText) button.getRootView().findViewById(R.id.buy_ent);
        String entNumbers = entET.getText().toString();
        ents = Integer.parseInt(entNumbers);
        buyingArray.add(4, ents);

        EditText unicornET = (EditText) button.getRootView().findViewById(R.id.buy_unicorn);
        String unicornNumbers = unicornET.getText().toString();
        unicorns = Integer.parseInt(unicornNumbers);
        buyingArray.add(5, unicorns);

        EditText dragonET = (EditText) button.getRootView().findViewById(R.id.buy_dragon);
        String dragonNumbers = dragonET.getText().toString();
        dragons = Integer.parseInt(dragonNumbers);
        buyingArray.add(6, dragons);
        buyingArray.add(7, 0);


        zoo.buyingAnimals(buyingArray, 2);


    }

    public void onMountainButtonClicked(View button) {
        ArrayList<Integer> buyingArray = new ArrayList<Integer>();
        EditText trollNumbersET = (EditText) button.getRootView().findViewById(R.id.buy_troll);
        String trollNumbers = trollNumbersET.getText().toString();
        trolls = Integer.parseInt(trollNumbers);
        buyingArray.add(0, trolls);

        EditText vFMET = (EditText) button.getRootView().findViewById(R.id.buy_vilefishman);
        String vFmenNumbers = vFMET.getText().toString();
        vFmen = Integer.parseInt(vFmenNumbers);
        buyingArray.add(1, vFmen);

        EditText gEagleET = (EditText) button.getRootView().findViewById(R.id.buy_gianteagle);
        String gEagleNumbers = gEagleET.getText().toString();
        gEagles = Integer.parseInt(gEagleNumbers);
        buyingArray.add(2, gEagles);

        EditText selkieET = (EditText) button.getRootView().findViewById(R.id.buy_selkie);
        String selkieNumbers = selkieET.getText().toString();
        selkies = Integer.parseInt(selkieNumbers);
        buyingArray.add(3, selkies);

        EditText entET = (EditText) button.getRootView().findViewById(R.id.buy_ent);
        String entNumbers = entET.getText().toString();
        ents = Integer.parseInt(entNumbers);
        buyingArray.add(4, ents);

        EditText unicornET = (EditText) button.getRootView().findViewById(R.id.buy_unicorn);
        String unicornNumbers = unicornET.getText().toString();
        unicorns = Integer.parseInt(unicornNumbers);
        buyingArray.add(5, unicorns);

        EditText dragonET = (EditText) button.getRootView().findViewById(R.id.buy_dragon);
        String dragonNumbers = dragonET.getText().toString();
        dragons = Integer.parseInt(dragonNumbers);
        buyingArray.add(6, dragons);
        buyingArray.add(7, 0);

        zoo.buyingAnimals(buyingArray, 3);


    }

public void onRefreshButtonClicked(View button){
    ocean_report = (zoo.getEnclosures().get(0).enclosureOverviewGen());
    swamp_report = (zoo.getEnclosures().get(1).enclosureOverviewGen());
    forest_report = (zoo.getEnclosures().get(2).enclosureOverviewGen());
    mountain_report = (zoo.getEnclosures().get(3).enclosureOverviewGen());


    ocean_overview = (TextView) button.getRootView().findViewById(R.id.ocean_overview);
    swamp_overview = (TextView) button.getRootView().findViewById(R.id.swamp_overview);
    forest_overview = (TextView) button.getRootView().findViewById(R.id.forest_overview);
    mountain_overview = (TextView) button.getRootView().findViewById(R.id.mountain_overview);



    ocean_overview.setText(ocean_report);
    swamp_overview.setText(swamp_report);
    forest_overview.setText(forest_report);
    mountain_overview.setText(mountain_report);


}

public void onAdvanceButtonClicked(View button) throws InstantiationException, IllegalAccessException {
    zoo.performWeeklyAdvance();
}

}
