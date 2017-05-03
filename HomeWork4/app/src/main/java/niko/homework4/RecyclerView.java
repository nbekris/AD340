package niko.homework4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class RecyclerView extends AppCompatActivity {
    Button button;

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

        context = getApplicationContext();

        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout1);

        recyclerView = (android.support.v7.widget.RecyclerView) findViewById(R.id.recyclerview1);

        recyclerViewLayoutManager = new GridLayoutManager(context, 2);

        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(context, subjects);

        recyclerView.setAdapter(recyclerViewAdapter);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(myhandler1);

    }
    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View view) {
            Intent intent = new Intent(RecyclerView.this, MainActivity.class);
            startActivity(intent);
        }
    };
}
