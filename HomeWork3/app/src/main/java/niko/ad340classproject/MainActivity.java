package niko.ad340classproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "niko.ad340classproject.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    GridView gridview = (GridView) findViewById(R.id.gridview);
    gridview.setAdapter(new ImageAdapter(this));

    gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> parent, View v,
                                int position, long id) {
            if (position == 0) {
                setContentView(R.layout.new_display);

            }
            Toast.makeText(MainActivity.this, "" + position,
                    Toast.LENGTH_SHORT).show();
        }
    });
}

    /** Called when user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.editText);

        String message = editText.getText().toString();


        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }
}
