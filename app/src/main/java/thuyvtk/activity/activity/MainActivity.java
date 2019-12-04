package thuyvtk.activity.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smarteist.autoimageslider.CircularSliderHandle;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import thuyvtk.activity.R;
import thuyvtk.activity.adapter.IconAdapters;
import thuyvtk.activity.adapter.SliderAdapter;

public class MainActivity extends Activity {

    SliderView imageSlider;
    LinearLayout search_bar_main;
    LinearLayout lnSearchBar;
    TextView txtContainer;
    RecyclerView rcIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defineView();

        // show thumnail
        showThumbnails();
        // show icon
        showIcon();
    }

    private void defineView() {
        imageSlider = findViewById(R.id.imageSlider);
        search_bar_main = findViewById(R.id.search_bar_main);
        lnSearchBar = findViewById(R.id.lnSearchBar);
        txtContainer = findViewById(R.id.txtContainer);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rcIcon = findViewById(R.id.rcIcon);
        rcIcon.setLayoutManager(layoutManager);
    }

    private void showThumbnails() {
        imageSlider.setSliderAdapter(new SliderAdapter(getApplicationContext()));
        imageSlider.setAutoCycle(false);
        imageSlider.startAutoCycle();
        imageSlider.setIndicatorAnimation(IndicatorAnimations.WORM);
        imageSlider.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        imageSlider.setScrollTimeInSec(10);
        imageSlider.setCurrentPageListener(new CircularSliderHandle.CurrentPageListener() {
            @Override
            public void onCurrentPageChanged(int currentPosition) {
                switch (currentPosition) {
                    case 0:
                    case 2:
                        search_bar_main.setBackgroundColor(getResources().getColor(R.color.main));
                        txtContainer.setBackgroundColor(getResources().getColor(R.color.main));
                        lnSearchBar.setBackground(getResources().getDrawable(R.drawable.border_radius));
                        break;
                    case 1:
                        search_bar_main.setBackgroundColor(getResources().getColor(R.color.main_pink));
                        txtContainer.setBackgroundColor(getResources().getColor(R.color.main_pink));
                        lnSearchBar.setBackground(getResources().getDrawable(R.drawable.border_radius_white));
                        setTheme(R.style.PinkTheme);

                        break;
                    case 3:
                        search_bar_main.setBackgroundColor(getResources().getColor(R.color.main_orange));
                        txtContainer.setBackgroundColor(getResources().getColor(R.color.main_orange));
                        lnSearchBar.setBackground(getResources().getDrawable(R.drawable.border_radius_white));
                        break;

                }
            }
        });
    }

    private void showIcon() {
        rcIcon.setAdapter(new IconAdapters(getApplicationContext()));
    }
}
