package niko.recyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;


public class DisplayActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
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
        setContentView(R.layout.activity_display);

        context = getApplicationContext();

        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout1);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);

        recyclerViewLayoutManager = new GridLayoutManager(context, 2);

        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(context, subjects);

        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
