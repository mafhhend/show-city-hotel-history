package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Hotels extends AppCompatActivity {
    List<String> cities;
    ListView listView;
    String history;
    ArrayAdapter<String> adapter;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        cities=new ArrayList<>();
        cities.add("هتل اسپیناس پالاس تهران");
        cities.add("هتل اسکان الوند تهران");
        cities.add("هتل رکسان (نووتل سابق) تهران");
        cities.add("هتل استقلال تهران");
        cities.add("هتل آزادی تهران");
        cities.add("هتل اسپیناس بلوار تهران");

        listView=findViewById(R.id.listView);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,cities);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String city=cities.get(i);

                switch (city){
                    case "هتل اسپیناس پالاس تهران" : {
                        history = "400\n" +
                                "تعداد طبقه\n" +
                                "20\n" +
                                "هتل پنج ستاره اسپیناس پالاس، شیکترین و بزرگترین هتل تهران با معماری مدرن و بینظیر می باشد";

                        intent = new Intent(Hotels.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "هتل اسکان الوند تهران" : {
                       history="گروه هتل های اسکان با بیش از نیم قرن تجربه در صنعت گردشگری و هتلداری این بار هتلی چهار ستاره با نام اسکان الوند در مکانی دنج و آرام بر بام شهر پر هیاهوی تهران با چشم اندازی زیبا و با امکان دسترسی به مرکز شهر، مراکز اداری، تجاری، دولتی و خصوصی افتتاح کرده است.";

                        intent = new Intent(Hotels.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "هتل رکسان (نووتل سابق) تهران" : {
                        history = "هتل پنج ستاره رکسان تهران یکی از اولین هتل های فرودگاهی کشور می باشد که در ضلع جنوبی ترمینال اصلی فرودگاه بین المللی امام خمینی واقع شده است.";

                        intent = new Intent(Hotels.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "هتل استقلال تهران" : {
                        history = "هتل 5 ستاره پارسیان استقلال، یا هتل رویال هیلتون سابق، با دو برج شرقی (بازسازی شده) و غربی (ساختمان قدیمی) خود، نه تنها بزرگ ترین هتل بین المللی تهران است؛";

                        intent = new Intent(Hotels.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "هتل آزادی تهران" : {
                        history="این هتل پنج ستاره با قدمتی طولانی در عرصه هتلداری مطابق با استانداردهای بین المللی روز دنیا، بی شک بهترین، محبوبترین و مجلل ترین هتل کشور و تهران می باشد.";

                        intent = new Intent(Hotels.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "هتل اسپیناس بلوار تهران" : {
                        history="هتل مجلل اسپیناس خلیج فارس تهران اولین هتل پنج ستاره بعد از انقلاب اسلامی می باشد که در یکی از بهترین، خوش آب و هواترین و زیباترین مناطق مرکز شهر تهران، بلوار کشاورز در زمستان 1389 افتتاح شد. ";
                        intent = new Intent(Hotels.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }

                }
            }
        });


    }
}