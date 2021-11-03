package ilia.volkov.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn = findViewById(R.id.button1);
        btn.setOnClickListener(v->{
            startActivity(new Intent(SecondActivity.this, CalendarViewActivity.class));
        });
    }
}
