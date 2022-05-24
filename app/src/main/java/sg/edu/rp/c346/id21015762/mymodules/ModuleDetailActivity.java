package sg.edu.rp.c346.id21015762.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDisplay = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String module = intentReceived.getStringExtra("module");
        String modulename = intentReceived.getStringExtra("modulename");
        String acadyear = intentReceived.getStringExtra("acadyear");
        String sem = intentReceived.getStringExtra("sem");
        String modcred = intentReceived.getStringExtra("modcred");
        String venue = intentReceived.getStringExtra("venue");
        tvDisplay.setText(("Module Code: " + module)+("\nModule Name: " + modulename)+("\nAcademic Year: " + acadyear)+("\nSemester: " + sem)+("\nModule Credit: " + modcred)+("\nVenue: " + venue));

    }
}