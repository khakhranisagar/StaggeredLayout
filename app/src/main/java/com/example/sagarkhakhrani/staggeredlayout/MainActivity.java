package com.example.sagarkhakhrani.staggeredlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private StaggeredGridLayoutManager stagaggeredGridLayoutManager;
    Button button;


    RecyclerView recyclerView;
    int togglelayout=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            button=(Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Navigation.class);
                startActivity(intent);
            }
        });

         recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        stagaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(stagaggeredGridLayoutManager);

        List<ItemObjects> gaggeredList = getListItemData();

        MyAdapter rcAdapter = new MyAdapter(MainActivity.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

            if(togglelayout==1) {
                StaggeredGridLayoutManager staggeredhorizontalGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
                       recyclerView.setLayoutManager(staggeredhorizontalGridLayoutManager);
                togglelayout=2;
            }else if(togglelayout==2){
                StaggeredGridLayoutManager staggeredverticalGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(staggeredverticalGridLayoutManager);
                togglelayout=1;
            }

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();
        listViewItems.add(new ItemObjects("Photo1", R.drawable.album1));
        listViewItems.add(new ItemObjects("Photo2", R.drawable.album3));
        listViewItems.add(new ItemObjects("Photo3", R.drawable.album4));
        listViewItems.add(new ItemObjects("Photo4", R.drawable.album5));
        listViewItems.add(new ItemObjects("Photo5", R.drawable.album6));
        listViewItems.add(new ItemObjects("Photo6", R.drawable.album7));
        listViewItems.add(new ItemObjects("Photo7", R.drawable.album8));
        listViewItems.add(new ItemObjects("Photo8", R.drawable.album9));
        listViewItems.add(new ItemObjects("Photo9", R.drawable.album10));
        listViewItems.add(new ItemObjects("Photo10", R.drawable.album11));
        listViewItems.add(new ItemObjects("Photo1", R.drawable.album2));




        return listViewItems;
    }
}
