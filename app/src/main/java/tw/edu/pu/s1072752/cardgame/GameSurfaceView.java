package tw.edu.pu.s1072752.cardgame;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;

public class GameSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    public GameSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }

    public class Game extends Activity {

        ImageView imv[] = new ImageView[4];
        int im[] = { R.drawable.img0_first, R.drawable.img1_first, R.drawable.img3_second,
                R.drawable.img2_second };
        int v[]={R.id.imv5,R.id.imv6,R.id.imv7,R.id.imv8,};

        String msg[] = { "梅花", "菱形", "愛心", "黑桃" };

        int e=0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_game2);
            findView();

        }

        public void Touch(View v) {
            for (int i = 0; i < imv.length; i++) {
                if (v == imv[i]) {

                    if (e==0) {
                        imv[i].setImageResource(im[i]);
                        setTitle(msg[i]);
                        e=1;
                    } else {
                        imv[i].setImageResource(R.drawable.color);
                        setTitle("蓋牌");
                        e=0;
                    }
                }
            }

        }

        public void findView() {

            for (int i = 0; i < imv.length; i++) {
                imv[i] = (ImageView) this.findViewById(v[i]);
            }
        }

    }


}
