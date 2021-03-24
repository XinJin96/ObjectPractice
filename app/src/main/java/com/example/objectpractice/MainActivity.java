package com.example.objectpractice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view)
    {
        ImageView image=findViewById(R.id.android_cookie_image_view);
        image.setImageResource(R.drawable.after_cookie);

        TextView text=findViewById(R.id.status_text_view);
        text.setText("I am so full!");

    }
}
