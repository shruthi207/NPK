package com.example.myagriapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class moisture extends AppCompatActivity {


    Button btn;
    TextView txt;

    private static final String TAG = "moisture";
    TextView results;
    String JsonURL = "https://api.thingspeak.com/channels/1322214/feeds.json";
    String data = "";
    // Defining the Volley request queue that handles the URL request concurrently
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moisture);
        requestQueue = Volley.newRequestQueue(this);
        results = (TextView) findViewById(R.id.textView15);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, JsonURL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray feeds = response.getJSONArray("feeds");
                            for(int i=0; i<feeds.length();i++) {
                                JSONObject jo = feeds.getJSONObject(i);
                                String moist = jo.getString("field1");
                                results.setText(moist);
                            }
                        } catch (JSONException e) {
                            // If an error occurs, this prints the error to the log
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Volley", "Error");
                    }
                });
        //add request to queue
        requestQueue.add(jsonObjectRequest);
    }
}
/*
        txt = findViewById(R.id.textView15);
        btn = findViewById(R.id.button1);
     //   getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("message");

        // myRef.setValue("Hello, World!");
        //myRef.setValue(2);


        // myRef= new Firebase("soil-moisture-ea910.firebaseio.com");
        btn.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                final DatabaseReference myRef = database.getReference("LiveData");
                final DatabaseReference myRef1 = database.getReference("read");
                String i;

                //Log.d(TAG, "message");
                // }

                //          });
                //    }
                //}


                // Read from the database
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String i = dataSnapshot.getValue().toString();
                        txt.setText(i);


                        /*System.out.println(dataSnapshot.getValue());

                    }

                    @Override
                    public void onCancelled(DatabaseError error) {

                    }


                });
            }
        });
    }
}

*/
