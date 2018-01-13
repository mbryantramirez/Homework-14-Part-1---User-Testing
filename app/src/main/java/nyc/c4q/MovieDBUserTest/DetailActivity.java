package nyc.c4q.MovieDBUserTest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Shant on 1/13/2018.
 */

public class DetailActivity extends AppCompatActivity {

    TextView title;
    TextView release;
    TextView rating;
    ImageView poster;
    TextView desc;


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        setVariables();

    }

    public void setVariables(){title = findViewById(R.id.detail_title);
        release = findViewById(R.id.detail_release);
        rating = findViewById(R.id.detail_rating);
        poster = findViewById(R.id.detail_image);
        desc = findViewById(R.id.detail_desc);
        getIntents();
    }

    public void getIntents(){
        Bundle extras = getIntent().getExtras();
        release.setText(extras.getString("release"));
        title.setText(extras.getString("title"));
        rating.setText(Double.toString(extras.getDouble("rating")));
        desc.setText(extras.getString("desc"));
        Picasso.with(getBaseContext()).load(extras.getString("poster")).into(poster);
    }

}
