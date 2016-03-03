package treconweb.puttan.montree.mytraffic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Widget
        bindWidget();//Create method [option+enter]  //Compleatement [shift+cmd+enter]


        //Button Controller
        buttonController();


        //Listview Controller
        listviewController();


    }   // Main Method


    private void listviewController() {

        //Create Listview

        //Type1
        final int[] iconInts = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};

        //Type2
        final String[] titleStrings = new String[20];
        titleStrings[0] = "ห้ามเลี้ยวซ้าย";
        titleStrings[1] = "ห้ามเลี้ยวขวา";
        titleStrings[2] = "ให้เดินรถทางเดียวไปข้างหน้า";
        titleStrings[3] = "ให้เลี้ยวขวา";
        titleStrings[4] = "ให้เลี้ยวซ้าย";
        titleStrings[5] = "ให้ออก";
        titleStrings[6] = "ให้เข้า";
        titleStrings[7] = "ให้ออก";
        titleStrings[8] = "หยุด";
        titleStrings[9] = "ห้ามรถสูงเกินกำหนด";
        titleStrings[10] = "ให้เลี้ยวซ้ายหรือเลี้ยวขวา";
        titleStrings[11] = "ห้ามกลับรถไปทางขวา";
        titleStrings[12] = "ห้ามจอดรถ";
        titleStrings[13] = "ให้รถสวนทางมาก่อน";
        titleStrings[14] = "ห้ามแซง";
        titleStrings[15] = "ห้ามเข้า";
        titleStrings[16] = "หยุดตรวจ";
        titleStrings[17] = "จำกัดความเร็ว";
        titleStrings[18] = "ห้ามรถกว้างเกินกำหนด";
        titleStrings[19] = "ห้ามรถสูงเกินกำหนด";

        //Type3
        String[] detailShortStrings = getResources().getStringArray(R.array.detail_short);


        //Send Value to Adapter
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, iconInts, titleStrings, detailShortStrings);
        trafficListView.setAdapter(myAdapter);


        //ListView Active When Click
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                intent.putExtra("Title", titleStrings);
                intent.putExtra("Image", iconInts);
                intent.putExtra("Index", i);


                startActivity(intent);
            }   // even
        });


    }   // listviewController

    private void buttonController() {
        aboutButton.setOnClickListener(new View.OnClickListener() {
            //กด ctrl+space หลัง new
            @Override
            public void onClick(View v) {

                //Sound Effect
                //MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cow);
                //mediaPlayer.start();

                //Web View
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("https://youtu.be/VTj_glwit6M"));
                //startActivity(intent);

                Intent objIntent = new Intent (MainActivity.this, AboutActivity.class);
                startActivity(objIntent);


            }   //event
        });
    }   // buttonController


    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);


    }   // bidWidget

}   // Main Class
// Code Format [option+cmd+l]