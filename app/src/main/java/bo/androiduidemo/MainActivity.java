package bo.androiduidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    private TextView mCancel;
    private TextView mPlusMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caculator_layout);
        //find the view
        initView();

        //init event
        initEvent();
    }

    private void initEvent() {

        // the first way to set it
        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "one be click");
                if (view instanceof TextView){
                    String text = ((TextView)view).getText().toString();
                    Log.d(TAG, "text = " + text);
                }
            }
        });

        mPlusMinus.setOnClickListener(this);
    }

    private void initView() {
        mCancel = this.findViewById(R.id.tv_cancel);
        mPlusMinus = this.findViewById(R.id.plusMinus);
    }

    public void oneOnClick(View view){
        Log.d(TAG, "one be click");
        if (view instanceof TextView){
            String text = ((TextView)view).getText().toString();
            Log.d(TAG, "text = " + text);
        }
    }

    public void onOrangeClick(View view){
        Log.d(TAG,"one orange be click");
        if (view instanceof TextView){
            String text = ((TextView)view).getText().toString();
            Log.d(TAG, "text = " + text);
        }
    }


    @Override
    public void onClick(View view) {
        // if there are many control set onclick events, you need to determine which control

        Log.d(TAG, "onClick");
        if (view == mPlusMinus){
            String text = ((TextView)view).getText().toString();
            Log.d(TAG, "text = " + text);
        }
        else if (view == mCancel){

        }

        // or switch case
        int id = view.getId();
        switch (id){
            case R.id.tv_cancel:
                Log.d(TAG, "");
                break;
            case R.id.plusMinus:
                //
                break;
        }
    }
}