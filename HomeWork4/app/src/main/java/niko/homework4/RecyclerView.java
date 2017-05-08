package niko.homework4;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class RecyclerView extends AppCompatActivity {
    private static final String TAG = RecyclerView.class.getSimpleName();

    Context context;
    android.support.v7.widget.RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    android.support.v7.widget.RecyclerView.Adapter recyclerViewAdapter;
    android.support.v7.widget.RecyclerView.LayoutManager recyclerViewLayoutManager;
    String[] subjects =
            {
                    "ANDROID", "Google",
                    "PHP", "Rasmus Lerdorf",
                    "BLOGGER", "Random Person",
                    "WORDPRESS", "Wordpress Foundation",
                    "JOOMLA", "The JOOMLA Project Team",
                    "ASP.NET", "Microsoft",
                    "JAVA", "Oracle",
                    "C++", "Bjarne Stroustrup",
                    "MATHS", "Numbers",
                    "HINDI", "Programming",
                    "ENGLISH", "Native"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(mToolbar);

        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        context = getApplicationContext();

        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout1);

        recyclerView = (android.support.v7.widget.RecyclerView) findViewById(R.id.recyclerview1);

        recyclerViewLayoutManager = new GridLayoutManager(context, 2);

        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(context, subjects);

        recyclerView.setAdapter(recyclerViewAdapter);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.my_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.home) {
            // Respond to the action bar's Up/Home button
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        if (item.getItemId() == R.id.action_setting) {
            Log.d(TAG, "User clicked action_setting");
            Toast.makeText(RecyclerView.this,
                    "You have clicked on setting action menu",
                    Toast.LENGTH_SHORT)
                    .show();
        }
        if (item.getItemId() == R.id.action_about_us) {
            Log.d(TAG, "User clicked action_about_us");
            Toast.makeText(RecyclerView.this,
                    "You have clicked on about us action menu",
                    Toast.LENGTH_SHORT)
                    .show();
        }
        if (item.getItemId() == R.id.action_home) {
            Intent intent = new Intent(RecyclerView.this, MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
