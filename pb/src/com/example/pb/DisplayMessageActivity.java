package com.example.pb;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * <code>DisplayMessageActivity</code>
 *
 * @author nikunj   $Date: 5/31/14$
 * @version $Revision:
 */
public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        //super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        setContentView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        //return id == R.id.action_settings;
        return super.onOptionsItemSelected(item);
    }

    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////

    public static class PlaceholderFragment extends Fragment{

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_display_message, container, false);
            return rootView;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////

}
