package com.example.sqldatabase.DBActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sqldatabase.DBHelper.DBHelper;
import com.example.sqldatabase.R;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class ContactActivity extends AppCompatActivity {

    Button btn_Save,btn_update,btn_delete,btn_show;
    DBHelper myDB;
    private TextView name, email, street, place, phone;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.use_relative);
//        setContentView(R.layout.activity_contact);
        myDB = new DBHelper(this);
        tabLayout = findViewById(R.id.tablayout);

        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setText("tab1");
        tabLayout.addTab(firstTab);

        TabLayout.Tab secondTab = tabLayout.newTab();
        secondTab.setText("Second"); // set the Text for the second Tab
        secondTab.setIcon(R.drawable.ic_launcher_background); // set an icon for the second tab
        tabLayout.addTab(secondTab); // add  the tab  in the TabLayout
// Create a new Tab named "Third"
        TabLayout.Tab thirdTab = tabLayout.newTab();
        thirdTab.setText("Third"); // set the Text for the first Tab
        thirdTab.setIcon(R.drawable.ic_launcher_background); // set an icon for the first tab
        tabLayout.addTab(thirdTab);

     /*   btn_show = findViewById(R.id.btn_show);
        btn_Save = findViewById(R.id.btn_Save);
        btn_delete = findViewById(R.id.btn_delete);
        btn_update = findViewById(R.id.btn_update);

        name = (TextView) findViewById(R.id.editTextName);
        phone = (TextView) findViewById(R.id.editTextPhone);
        email = (TextView) findViewById(R.id.editTextStreet);
        street = (TextView) findViewById(R.id.editTextEmail);
        place = (TextView) findViewById(R.id.editTextCity);
        btn_Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDB.insertContact(name.getText().toString(),phone.getText().toString(),email.getText().toString(),street.getText().toString(),place.getText().toString());
                Toast.makeText(ContactActivity.this, "insert contact", Toast.LENGTH_SHORT).show();

            }
        });
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDB.deleteContact(1);
                Toast.makeText(ContactActivity.this, "delete contact", Toast.LENGTH_SHORT).show();
            }
        });
        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDB.updateContact(2,name.getText().toString(),phone.getText().toString(),email.getText().toString(),street.getText().toString(),place.getText().toString());
                Toast.makeText(ContactActivity.this, "update contact", Toast.LENGTH_SHORT).show();
            }
        });
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> data = myDB.getAllCotacts();
                if (data.size()>0)
                {
                    for (int i= 0 ; i<data.size();i++)
                    {
                        Log.e("Data is ","data is "+data.get(i));
                    }
                }
            }
        });*/


//        myDB.deleteContact(1);
//        myDB.updateContact(1,"kajal","78454578745","kajal565@gmail.com","ganesh nagar","surat");

    }
}