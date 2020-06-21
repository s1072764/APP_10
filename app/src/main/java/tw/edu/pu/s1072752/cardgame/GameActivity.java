package tw.edu.pu.s1072752.cardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        //設定螢幕為橫式

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final ImageView iv,iv2,iv3,iv4;


        iv = (ImageView)findViewById(R.id.imv5);
        iv2 = (ImageView)findViewById(R.id.imv6);
        iv3 = (ImageView)findViewById(R.id.imv7);
        iv4 = (ImageView)findViewById(R.id.imv8);


        iv.setOnClickListener(new View.OnClickListener() {
            private TextView tv1;

            @Override
            public void onClick(View v) {
                tv1=(TextView)findViewById(R.id.tv1);
                // TODO Auto-generated method stub
                if (v == iv) {
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.img0_first));
                    tv1.setText("鼓");
                }

            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            private TextView tv2;
            @Override
            public void onClick(View v) {
                tv2=(TextView)findViewById(R.id.tv2);
                // TODO Auto-generated method stub
                if (v == iv2) {
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.img1_first));
                    tv2.setText("喇叭");
                }
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            private TextView tv3;
            @Override
            public void onClick(View v) {
                tv3=(TextView)findViewById(R.id.tv3);
                // TODO Auto-generated method stub
                if (v == iv3) {
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.img2_second));
                    tv3.setText("二胡");
                }
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            private TextView tv4;
            @Override
            public void onClick(View v) {
                tv4=(TextView)findViewById(R.id.tv4);
                // TODO Auto-generated method stub
                if (v == iv4) {
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.img3_second));
                    tv4.setText("吉他");
                }
            }
        });

    //設定全螢幕顯示

    }


}