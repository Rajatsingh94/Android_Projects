package rajatsingh.tic_tac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 0 for red || 1 for yellow

    int activeplayer =0;

    int[] gamestats = {2,2,2,2,2,2,2,2,2};
    int[][] wining = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    public void dropIn(View view)
    {
        ImageView img = (ImageView) view;

        int tapCounter = Integer.parseInt(img.getTag().toString());

        if(gamestats[tapCounter]==2) {

            gamestats[tapCounter] = activeplayer;
            img.setTranslationY(-1000f);

            if (activeplayer == 0) {
                img.setImageResource(R.drawable.yellow);
                activeplayer = 1;
            } else {
                img.setImageResource(R.drawable.red);
                activeplayer = 0;
            }


            img.animate().translationYBy(1000f).setDuration(300);
        }

        for(int[] winposition : wining)
        {
            if(gamestats[winposition[0]]== gamestats[winposition[1]]
                    && gamestats[winposition[1]]==gamestats[winposition[2]]
                    && gamestats[winposition[0]] !=2)
            {

            }

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
