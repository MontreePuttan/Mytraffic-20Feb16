package treconweb.puttan.montree.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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




    }   // Main Method

    private void buttonController() {
        aboutButton.setOnClickListener(new View.OnClickListener() {
            //กด ctrl+space หลัง new
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cow);
                mediaPlayer.start();

                //Web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/VTj_glwit6M"));
                startActivity(intent);



            }   //event
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);


    }   // bidWidget

}   // Main Class
// Code Format [option+cmd+l]