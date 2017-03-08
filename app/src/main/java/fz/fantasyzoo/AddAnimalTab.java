package fz.fantasyzoo;

/**
 * Created by user on 08/03/2017.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class AddAnimalTab extends Fragment{


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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_add_animal, container, false);

        buy_troll = (EditText) rootView.findViewById(R.id.buy_troll);
        buy_vilefishman = (EditText) rootView.findViewById(R.id.buy_vilefishman);
        buy_gianteagle = (EditText) rootView.findViewById(R.id.buy_gianteagle);
        buy_selkie = (EditText) rootView.findViewById(R.id.buy_selkie);
        buy_ent = (EditText) rootView.findViewById(R.id.buy_ent);
        buy_unicorn = (EditText) rootView.findViewById(R.id.buy_unicorn);
        buy_dragon = (EditText) rootView.findViewById(R.id.buy_dragon);

        ocean_btn = (Button) rootView.findViewById(R.id.ocean_btn);
        swamp_btn = (Button) rootView.findViewById(R.id.swamp_btn);
        forest_btn = (Button) rootView.findViewById(R.id.forest_btn);
        mountain_btn = (Button) rootView.findViewById(R.id.mountain_btn);
        buyingArray = new ArrayList<Integer>();

        return rootView;

    }




    public void onOceanButtonClicked(View button) {
//        ( (NewMainActivity)getActivity()).onOceanButtonClicked(button);

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


    }


}

