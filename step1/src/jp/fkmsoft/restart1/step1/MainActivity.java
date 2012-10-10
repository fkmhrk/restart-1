package jp.fkmsoft.restart1.step1;

import android.app.Activity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView text = new TextView(this);
        text.setText("こんにちはーーーー");
        text.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 24);
        setContentView(text);
    }
}
