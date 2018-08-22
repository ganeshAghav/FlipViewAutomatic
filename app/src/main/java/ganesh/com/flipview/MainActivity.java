package ganesh.com.flipview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ganesh.com.flipview.flip.FlipViewGroup;

public class MainActivity extends AppCompatActivity {

    private FlipViewGroup contentView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.activity_title);

        contentView = new FlipViewGroup(this);

        contentView.addFlipView(View.inflate(this, R.layout.second_page, null));
        contentView.addFlipView(View.inflate(this, R.layout.first_page, null));

        setContentView(contentView);

        contentView.startFlipping(); //make the first_page view flipping
    }
    @Override
    protected void onResume() {
        super.onResume();
        contentView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        contentView.onPause();
    }


}
