package ru.mirea.volegovaa.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textView2);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("Мой любимая книга: %s", university));
        }
    }

    public void send(View view)
    {
        EditText text_ed = (EditText) findViewById(R.id.textEdit);

        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, text_ed.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}