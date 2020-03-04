package hfad.com.r7coffeina;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SnackActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        int snackID = (Integer) getIntent().getExtras().get("snackID");

        Snacks snack = Snacks.snacks[snackID];

        ImageView imageView = (ImageView) findViewById(R.id.snackPhoto);
        TextView snackName = (TextView) findViewById(R.id.snackName);
        TextView snackDescription = (TextView) findViewById(R.id.snackDescription);

        imageView.setImageResource(snack.getImageId());
        imageView.setContentDescription(snack.getName());
        snackName.setText(snack.getName());
        snackDescription.setText(snack.getDescription());


    }
}
