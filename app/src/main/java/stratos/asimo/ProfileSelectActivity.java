package stratos.asimo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.database.sqlite.*;
import android.content.Context;

public class ProfileSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(this);
        ll.setGravity(LinearLayout.HORIZONTAL);
        TextView profile1 = new TextView(this);
        profile1.setText("Profile1");
        TextView profile2 = new TextView(this);
        profile2.setText("Profile2");
        TextView profile3 = new TextView(this);
        profile3.setText("Profile3");
        ll.addView(profile1);
        ll.addView(profile2);
        ll.addView(profile3);
        setContentView(ll);

    }
}