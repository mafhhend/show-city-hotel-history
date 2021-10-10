package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Cities extends AppCompatActivity {
 List<String> cities;
 ListView listView;
 String history;
 ArrayAdapter<String> adapter;
 Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        cities=new ArrayList<>();
        cities.add("برازجان");
        cities.add("تهران");
        cities.add("مشهد");
        cities.add("اصفهان");
        cities.add("شیراز");
        cities.add("قم");
        cities.add("گیلان");
        cities.add("خرمشهر");
        listView=findViewById(R.id.listView);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,cities);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String city=cities.get(i);

                switch (city){
                    case "برازجان" : {
        history="شهر بُرازجان مرکز شهرستان دشتستان واقع در استان بوشهر در کشور ایران است.\n" +
                "برازجان دومین شهر بزرگ استان بوشهر از نظر جمعیت است و در ۶۵ کیلومتری شمال شرق بندر بوشهر و بر سر راه ارتباطی و بازرگانی شیراز به کازرون و بوشهر و در ارتفاع ۸۰ متری از سطح دریا واقع شده\u200Cاست. نام\u200Cهای قدیم شهر به ترتیب تااوکه، برازگان و برازجان بوده\u200Cاست.[نیازمند منبع] برازجان یکی از مراکز تمدنی در دوران عیلامی به\u200Cشمار می\u200Cآید.[۲]همچنین دژ برازجان بزرگ\u200Cترین بنای تاریخی استان بوشهر است.";


                         intent = new Intent(Cities.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "تهران" : {
                        history="تِهْران (دربارهٔ این پرونده آوا راهنما·اطلاعات) پرجمعیت\u200Cترین شهر و پایتخت ایران، مرکز استان تهران و شهرستان تهران است. این شهر با ۸٬۶۹۳٬۷۰۶ تن جمعیت، بیست و چهارمین شهر پرجمعیت جهان و پرجمعیت\u200Cترین شهر باختر آسیا به\u200Cشمار می\u200Cرود. کلان\u200Cشهر تهران نیز دومین کلان\u200Cشهر پرجمعیت خاورمیانه است.";

                        intent = new Intent(Cities.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "مشهد" : {
                    history="تاریخ شهرِ مشهد گام\u200Cبه\u200Cگام از دورهٔ صفوی آغاز می\u200Cشود و تاریخ منطقه\u200Cاش، پیشتر با ولایت\u200Cهای طوس و نیشابور و به\u200Cطور ویژه با حرم امام رضا وابسته است.\n" +
                            "حوضهٔ رودخانهٔ کشف\u200Cرود که شهر مشهد در آن قرار دارد،[۱] به خاطر شرایط مناسب طبیعی، از پیش از اسلام به عنوان یکی از بخش\u200Cهای مورد توجه برای سکونت در خراسان به حساب می\u200Cآمده است.";
                        intent = new Intent(Cities.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "اصفهان" : {
                         history="اِصفَهان شهری تاریخی و گردشگری در مرکز ایران است. این شهر مرکز استان اصفهان و نیز شهرستان اصفهان است. سومین شهر بزرگ ایران، سومین شهر پرجمعیت ایران پس از تهران و مشهد[۱۲] و همچنین یکصد و شصت و پنجمین شهر پرجمعیت جهان و نهمین شهر پرجمعیت باختر آسیا به\u200Cشمار می\u200Cرود.";
                        intent = new Intent(Cities.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "شیراز" : {
                      history="شیراز در بخش مرکزی استان فارس، در ارتفاع ۱۴۸۶ متر از سطح دریا و در منطقهٔ کوهستانی زاگرس واقع شده و آب و هوای معتدلی دارد. این شهر، از سمت غرب به کوه دراک، از سمت شمال به کوه\u200Cهای بمو، سبزپوشان، چهل\u200Cمقام و باباکوهی (از رشته\u200Cکوه\u200Cهای زاگرس) محدود شده\u200Cاست.";

                        intent = new Intent(Cities.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "قم" : {
                    history="شهرستان قم که در خرداد سال 1375 شمسی به استان تبدیل شد ، شهری است در حاشیه کویر که در فاصله 140 کیلومتری جنوب شهر تهران قرار دارد. این شهر، قرن\u200Fها پیش از ورود اسلام به آن، به صورت روستایی بزرگ، در میان روستاهای فراوانِ اطراف، منطقه\u200Fای مسکونی بوده و روایت\u200Fهای تاریخی متعددی در چگونگی تأسیس آن نقل شده است. ";
                        intent = new Intent(Cities.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "گیلان" : {
                        history = "گیلان منطقه\u200Cای تاریخی در حدود دلتای رود سفیدرود است که میهن مردم گیلک در دوران باستان بود. به ساکنان ایرانی کنونی آن که به زبان گیلکی تکلم می\u200Cکنند گیلک گفته می\u200Cشود.";

                        intent = new Intent(Cities.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }
                    case "خرمشهر" : {
                        history = "خرمشَهر یکی از شهرهای جنوبی استان خوزستان و مرکز شهرستان خرمشهر است. این شهر در محل تلاقی رودخانه\u200Cهای اروندرود و کارون و در ناحیه\u200Cای باتلاقی و پست در دلتای رودخانهٔ اروندرود قرار گرفته و ۲۳ کیلومتر مربع مساحت دارد.";

                        intent = new Intent(Cities.this, show_info.class);
                        intent.putExtra("history",history);
                        startActivity(intent);
                        break;
                    }

                }
            }
        });

    }
}