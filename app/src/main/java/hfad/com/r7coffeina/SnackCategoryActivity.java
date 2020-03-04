package hfad.com.r7coffeina;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SnackCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_category);

        ArrayAdapter<Snacks> arrayAdapter = new ArrayAdapter<Snacks>(this, android.R.layout.simple_list_item_1, Snacks.snacks);
        ListView listView = (ListView) findViewById(R.id.snackListID);
        listView.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SnackCategoryActivity.this, SnackActivity.class);
                intent.putExtra("snackID", (int) id);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);

    }
}
