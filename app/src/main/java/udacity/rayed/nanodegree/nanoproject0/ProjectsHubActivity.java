package udacity.rayed.nanodegree.nanoproject0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProjectsHubActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects_hub);
    }

    @Override
    public void onClick(View v) {
        if (v instanceof Button) {
            String toastText = "This will launch " + ((Button)v).getText().toString();
            Toast.makeText(this,toastText,Toast.LENGTH_LONG).show();
        }
    }
}
