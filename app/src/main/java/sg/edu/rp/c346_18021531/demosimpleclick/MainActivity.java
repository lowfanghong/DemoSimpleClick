package sg.edu.rp.c346_18021531.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
 TextView tvDisplay;
 Button btnDisplay;
 EditText etInput;
 ToggleButton TB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.textView2);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        TB = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String response =  etInput.getText().toString();
              tvDisplay.setText(response);
            }
        });
       TB.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (TB.isChecked()){
                   etInput.setEnabled(true);
               }else{
                   etInput.setEnabled(false);
               }
           }
       });
    }
}
