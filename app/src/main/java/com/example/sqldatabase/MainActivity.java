package com.example.sqldatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    TextView txt_file, txt_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_file = findViewById(R.id.txt_file);
        txt_name = findViewById(R.id.txt_name);
        createDataBase();
    }

    public void createDataBase() {
        SQLiteDatabase database = openOrCreateDatabase("BackUpData", MODE_PRIVATE, null);
        database.execSQL("CREATE TABLE IF NOT EXISTS note(fileName VARCHAR,note VARCHAR)");
        //   database.execSQL("INSERT INTO note(fileName,note) VALUES('rohit.wav','hii this is my data')");

        Cursor c = database.rawQuery("SELECT * FROM note", null);
        int fileIndex = c.getColumnIndex("fileName");
        int noteIndex = c.getColumnIndex("note");

        c.moveToFirst();
        if (c != null) {

            do {
                Log.e(TAG, "file name is " + c.getString(fileIndex));
                Log.e(TAG, "file name is " + c.getString(noteIndex));
                txt_file.setText(c.getString(fileIndex));
                txt_name.setText(c.getString(noteIndex));

            } while (c.moveToNext());
        }
    }
}