package android.example.sqliteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {
    EditText editNama;
    EditText editAlamat;
    Button buttonSubmit;
    DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editNama = findViewById(R.id.edit_nama);
        editAlamat = findViewById(R.id.edit_alamat);
        buttonSubmit = findViewById(R.id.button_submit);
        databaseHelper = new DatabaseHelper(this);

        buttonSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        });
    }
    private void submitData(){
        //pengecekan bahwa user sudah input nama dan alamat
        if (editNama.getText().toString().length() > 0 && editAlamat.getText().toString().length() > 0) {
            databaseHelper.addStudent(editNama.getText().toString(), editAlamat.getText().toString());
            onBackPressed();
        }
    }
}

