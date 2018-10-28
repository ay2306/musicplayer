package codingclub.tech.codingclubtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Show this layout that i am passing to you
        setContentView(R.layout.activity_result);

        final TextView textView = findViewById(R.id.hello_text);

        String name = getIntent().getStringExtra("name");
        textView.setText("Hey "+name+"! Your feedback has been recorded.");
    }
}
