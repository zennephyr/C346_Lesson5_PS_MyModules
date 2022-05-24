package sg.edu.rp.c346.id21015762.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView passc346;
    TextView passc349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passc346 = findViewById(R.id.passc346);
        passc349 = findViewById(R.id.passc349);

        passc346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C346");
                intent.putExtra("modulename", "Android Programming");
                intent.putExtra("acadyear", "2020");
                intent.putExtra("sem", "1");
                intent.putExtra("modcred", "4");
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });

        passc349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C349");
                intent.putExtra("modulename", "iPad Programming");
                intent.putExtra("acadyear", "2020");
                intent.putExtra("sem", "1");
                intent.putExtra("modcred", "4");
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });
    }
}