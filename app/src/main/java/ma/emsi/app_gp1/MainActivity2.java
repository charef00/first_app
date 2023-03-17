package ma.emsi.app_gp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{

    private Button ok;
    private EditText nbr;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ok=findViewById(R.id.convert);
        nbr=findViewById(R.id.nbr1);
        txt=findViewById(R.id.textView2);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                double rst=Integer.parseInt(nbr.getText().toString())*0.096;
                txt.setText(rst+" $");
            }
        });

    }
}