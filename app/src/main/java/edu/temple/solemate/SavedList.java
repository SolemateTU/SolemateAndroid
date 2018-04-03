package edu.temple.solemate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by xxnoa_000 on 2/28/2018.
 */

public class SavedList extends Activity {

    ListView list;
    String[] web = {
            "Nike",
            "Addidas",
            "New Balance",
            "Under Armor",
            "Puma",
            "IDK",
            "Crocs"
    } ;
    String[] weeb = {
            "\nThis is a Nike shoe something something something",
            "\nThis is an Addidas shoe something something something",
            "\nThis is a New Balance shoe something something something",
            "\nThis is a Under Armor shoe something something something",
            "\nThis is a Puma shoe something something something",
            "\nIDK any other shoe types please help",
            "\nCrocs what are those what are those what are those"
    } ;
    Integer[] imageId = {
            R.drawable.closeicon,
            R.drawable.powerphases,
            R.drawable.powerphases,
            R.drawable.powerphases,
            R.drawable.powerphases,
            R.drawable.powerphases,
            R.drawable.powerphases

    };


    protected void onCreate (Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.s_list);

        CustomList adapter = new
                CustomList(SavedList.this, web, weeb, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(SavedList.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SavedList.this, Description.class));

            }
        });

    }
}