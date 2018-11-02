package ws.tilda.anastasia.anrdoidarchapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import ws.tilda.anastasia.anrdoidarchapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    EditText mEditText;
    Button mButton;

    ActivityMainBinding mainBinding;
    MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mMainViewModel = mainBinding.getViewModel();
        mainBinding.setViewModel(mMainViewModel);

        mEditText = findViewById(R.id.editText);
        mButton = findViewById(R.id.button);

    }

}
