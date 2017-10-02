package in.shgupta.testingcoverage;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;



/**
 * Created by shubhanshugupta on 02/10/17.
 */
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class MainactivityTest {
    MainActivity mainActivity;

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void startActivity(){

        mainActivity=activityActivityTestRule.getActivity();
    }

    @Test
    public void calcfareonUIthread(){
        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ((EditText)mainActivity.findViewById(R.id.etkm)).setText("0");
                ((EditText)mainActivity.findViewById(R.id.etmin)).setText("0");
                ((Button)mainActivity.findViewById(R.id.btncalc)).performClick();

                String result=((TextView)mainActivity.findViewById(R.id.tvresult)).getText().toString();

                assertEquals("50.0",result);
            }
        });
    }
}


