package com.example.myagriapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Register extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
  //  private Calendar mcalendar;
   // private EditText mdob_et;
    //private int day, month, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //ActionBar actionbar= getActionBar();
       //actionbar.setDisplayHomeAsUpEnabled(true);
        Spinner spinnerdist = (Spinner) findViewById(R.id.spinnerdistrict);
        spinnerdist.setOnItemSelectedListener(this);
      //  mdob_et = (EditText) findViewById(R.id.dob_et);
        //mdob_et.setOnClickListener(mClickListener);
        //day = mcalendar.get(Calendar.DAY_OF_MONTH);
        //year = mcalendar.get(Calendar.YEAR);

        //  spinnerdist.setOnItemSelectedListener(Register.this);
        List<String> districts = new ArrayList<String>();
        districts.add("Ariyalur");
        districts.add("Chengalpattu");
        districts.add("Chennai");
        districts.add("Coimbatore");
        districts.add("Cuddalore");
        districts.add("Dharmapuri");
        districts.add("Dindigul");
        districts.add("Erode");
        districts.add("Kallakurichi");
        districts.add("Kanchipuram");
        districts.add("Kanniyakumari");
        districts.add("Karur");
        districts.add("Krishnagiri");
        districts.add("Madurai");
        districts.add("Mayiladuthurai");
        districts.add("Nagapattinam");
        districts.add("Namakkal");
        districts.add("Nilgiris");
        districts.add("Perambalur");
        districts.add("Pudukottai");
        districts.add("Ramanathapuram");
        districts.add("Ranipet");
        districts.add("Salem");
        districts.add("Sivagangai");
        districts.add("Tenkasi");
        districts.add("Thanjavur");
        districts.add("Theni");
        districts.add("Thoothukudi");
        districts.add("Thiruchirapalli");
        districts.add("Thirunelveli");
        districts.add("Thirupattur");
        districts.add("/thiruppur");
        districts.add("Thiruvallur");
        districts.add("Thiruvarur");
        districts.add("Vellore");
        districts.add("Villupuram");
        districts.add("Virudhunagar");


        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(Register.this,
                android.R.layout.simple_spinner_item, districts);
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerdist.setAdapter(myadapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}
/*
     mdob_et=(EditText)findViewById(R.id.dob_et);
        mdob_et.setOnClickListener(mClickListener);
        day=mcalendar.get(Calendar.DAY_OF_MONTH);
        year=mcalendar.get(Calendar.YEAR);
        month=mcalendar.get(Calendar.MONTH);
    }
    View.OnClickListener mClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DateDialog();
        }
    };
    public void DateDialog(){
        DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
            {
                mdob_et.setText(dayOfMonth + "/" + monthOfYear + "/" + year);
            }};
        DatePickerDialog dpDialog=new DatePickerDialog(this, listener, year, month, day);
        dpDialog.show();
    }
}
        } */