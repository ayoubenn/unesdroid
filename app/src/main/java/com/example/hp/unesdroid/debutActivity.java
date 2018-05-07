package com.example.hp.unesdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class debutActivity extends AppCompatActivity {
    private static final String NT = debutActivity.class.getSimpleName();


    /*@BindView(R.id.connect)
     Button connect;

    @OnClick (R.id.connect)
    public void onButtonClicked(){
        Toast.makeText(getApplicationContext(), "f", Toast.LENGTH_LONG).show();
        startActivity();
    }*/



   @BindView(R.id.list)
    ListView list;

    BlankFragment newFragment =  BlankFragment.newInstance("younes","ben");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debut);
        Log.d(NT,"onCreate invoked");
        ButterKnife.bind(this);

        /*ArrayList<Movie> movies = new ArrayList<Movie>();

        movies.add(new Movie ("Independence day", R.drawable.independence_day));
        movies.add(new Movie ("The fifth element", R.drawable.the_fifth_element));
        movies.add(new Movie ("the last samurai", R.drawable.the_last_samurai));

        MovieAdapter adapter = new MovieAdapter(getApplicationContext(), R.layout.activity_debut, movies);

        list.setAdapter(adapter);*/

        getSupportFragmentManager().beginTransaction().add(R.id.fragment, newFragment).commit();

    }

    @Override
    protected void  onStart(){
        super.onStart();
        Log.d(NT,"onStart invoked");
    }
    @Override
    protected void  onResume(){
        super.onResume();
        Log.d(NT,"onResume invoked");
        newFragment.color();
    }
    @Override
    protected void  onPause(){
        super.onPause();
        Log.d(NT,"onPause invoked");
    }
    @Override
    protected void  onStop(){
        super.onStop();
        Log.d(NT,"onStop invoked");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(NT,"onDestroy invoked");
    }
    @Override
    protected void  onRestart(){
        super.onRestart();
        Log.d(NT,"onRestart invoked");
    }



  /*  public void startActivity(){
        Intent intent = new Intent(this, suitActivity.class);
        startActivity(intent);
    }*/






}

