package com.exemple.final_rentalcar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class detaile extends AppCompatActivity {
    ImageView  mainImageView;
    TextView title;
    String data1;
    int ImageView;
    //  TextView description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaile);
        mainImageView = findViewById(R.id.mainImageView);
                title=findViewById(R.id.title);
                // description=findViewById(R.id.description);

                getData();
                setData();
            }

            private void getData(){

                if(getIntent().hasExtra("ImageView")&&(getIntent().hasExtra("data1")))
                {
                    data1= getIntent().getStringExtra("data1");
                    ImageView= getIntent().getIntExtra("ImageView", 1);

                }else{
                    Toast.makeText(this, "NO DATA", Toast.LENGTH_SHORT).show();
                }

            }
            private  void setData(){
                title.setText(data1);
                mainImageView.setImageResource(ImageView);

            }

        }

