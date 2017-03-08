package fz.fantasyzoo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 08/03/2017.
 */

public class OverviewTab extends Fragment {

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_overview, container, false);




        return rootView;

    }}