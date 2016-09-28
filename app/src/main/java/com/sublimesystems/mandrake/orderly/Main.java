package com.sublimesystems.mandrake.orderly;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/*
* Depending on what version of the android system a device may be using,
* the native action baar behaves differently. The most recent features
* are added to support Toolbar. So use Toolbar instead.
* */

public class Main extends AppCompatActivity {
    private String [] navOptions = {"Rick", "Ist", "Sehr", "Gut!"};;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        // Get it to function as an ActionBar
        setSupportActionBar(toolbar);
        // set a title
        //getActionBar().setTitle("Orderly");
        toolbar.setTitle("Orderly");
        // Set text color white
        toolbar.setTitleTextColor(0xFFFFFFFF);

        // Add a subtitle
        toolbar.setSubtitle("Home");
        toolbar.setSubtitleTextColor(0xFFAAAAAA);

        // Set the navigation menu
        //mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        //mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        //mDrawerList.setAdapter(new ArrayAdapter<String>(this,R.layout.drawer_list_item, navOptions));
        // Set the list's click listener
        //mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        // And set the menu color white

        // Add a home button
        //getSupportActionBar()

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /*
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
    }*/
    /*
    private class DrawerItemClickListener implements ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    }

    private void selectItem(int position) {
        // Create a new fragment and specify the option selected
        Fragment fragment = new PlanetFragment
    }*/
}


