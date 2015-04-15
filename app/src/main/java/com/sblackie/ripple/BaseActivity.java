package com.sblackie.ripple;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by sblackie on 2015-04-14.
 */
public class BaseActivity extends ActionBarActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.traex:
                startActivity(new Intent(this, TraexActivity.class));
                break;
            case R.id.balysv:
                startActivity(new Intent(this, BalycsActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
