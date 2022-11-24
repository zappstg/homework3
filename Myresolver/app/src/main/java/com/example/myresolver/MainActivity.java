package com.example.myresolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ContentResolver resolver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);

        Uri uri=Uri.parse("content://myz.provider/person");
        ContentResolver resolver=getContentResolver();
        ContentValues values=new ContentValues();
        values.put("name","myz");
        values.put("age",20);

        Integer.parseInt("20");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resolver.insert(uri,values);
            }
        });
    }
}