package app.com.example.bakayokomo.gdgabidjan;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.text.Html;

import static android.text.Html.ImageGetter;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnHome = (ImageButton) findViewById(R.id.home);
        ImageButton btnAbout = (ImageButton) findViewById(R.id.about);
        ImageButton btnCellules = (ImageButton) findViewById(R.id.cellules);
        ImageButton btnContacts = (ImageButton) findViewById(R.id.contacts);

        btnHome.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnCellules.setOnClickListener(this);
        btnContacts.setOnClickListener(this);

    }



        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.home:
                    Toast.makeText(getApplicationContext(), "VOUS ETES DEJA A L'ACCUEIL!", Toast.LENGTH_LONG).show();
                    setContentView(R.layout.activity_main);
                    break;
                case R.id.about:
                    Toast.makeText(getApplicationContext(), "GDG ABIDJAN...", Toast.LENGTH_LONG).show();
                    setContentView(R.layout.about_layout);
                    break;
                case R.id.cellules:
                    setContentView(R.layout.cellules_layout);
                    Toast.makeText(getApplicationContext(), "CELLULES...", Toast.LENGTH_LONG).show();
                    break;
                case R.id.contacts:
                    setContentView(R.layout.contacts_layout);
                    Toast.makeText(getApplicationContext(), "CONTACTS...", Toast.LENGTH_LONG).show();
                    break;
                case R.id.retour:
                    Toast.makeText(getApplicationContext(), "RETOUR ACCUEIL...", Toast.LENGTH_LONG).show();
                    setContentView(R.layout.activity_main);
                    break;
                default:
                    break;
            }
        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


