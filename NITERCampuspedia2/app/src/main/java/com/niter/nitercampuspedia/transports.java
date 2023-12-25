package com.niter.nitercampuspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class transports extends AppCompatActivity {

    TextView trans;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transports);
        setContentView(R.layout.activity_transports);
        getSupportActionBar().setTitle("Transports");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        trans=findViewById(R.id.trans);

        String url = "https://shaikat005.000webhostapp.com/Room-207/transports.json";

        JsonArrayRequest
                jsonArrayRequest
                = new JsonArrayRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {


                        try {
                            for(int i = 0; i< response.length();i++) {


                                JSONObject jsonObject = response.getJSONObject(i);
                                String id = jsonObject.getString("ID");
                                String rule = jsonObject.getString("rules");

                                if(id.equals("1")){
                                    trans.append(rule+ "\n\n");
                                } else if (id.equals("2")) {
                                    trans.append(rule + "\n\n");
                                } else if (id.equals("3")) {
                                    trans.append(rule + "\n\n");
                                }else if (id.equals("4")) {
                                    trans.append(rule + "\n\n");
                                }else if (id.equals("5")) {
                                    trans.append(rule + "\n\n");
                                }
                            }
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(transports.this, "Network error..!", Toast.LENGTH_LONG).show();

                    }
                });
        RequestQueue requestQueue = Volley.newRequestQueue(transports.this);
        requestQueue.add(jsonArrayRequest);

    }
}