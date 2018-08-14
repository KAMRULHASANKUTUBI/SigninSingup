package c.tanvir.signinsingup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SingUp extends AppCompatActivity {
    EditText email,phone,password;
    Preference preference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        email=findViewById(R.id.savemailem);
        phone=findViewById(R.id.savephone);
        password=findViewById(R.id.savePassword);
        preference=new Preference(this);
    }

    public void insertData(View view) {
        String saveEmail=email.getText().toString();
        String savePhone=phone.getText().toString();
        String savePassword=password.getText().toString();
        preference.saveEmail(saveEmail);
        preference.savePassword(savePassword);
        preference.savePhone(savePhone);
        Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();

    }
}
