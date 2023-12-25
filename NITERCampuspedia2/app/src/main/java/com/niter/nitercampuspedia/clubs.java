package com.niter.nitercampuspedia;

import androidx.appcompat.app.AppCompatActivity;

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

public class clubs extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
        setContentView(R.layout.activity_clubs);
        getSupportActionBar().setTitle("Clubs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txt = findViewById(R.id.txt);
        String url = "https://shaikat005.000webhostapp.com/Room-207/club.json";

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
                                String notice = jsonObject.getString("Notice");

                                if(id.equals("1")){
                                    txt.append("Notice:1- "+notice + "\n\n");
                                } else if (id.equals("2")) {
                                    txt.append("Notice:2- "+notice + "\n\n");
                                } else if (id.equals("3")) {
                                    txt.append("Notice:3- "+notice + "\n\n");
                                } else if (id.equals("4")) {
                                    txt.append("Notice:4- "+notice + "\n\n");
                                } else if (id.equals("6")) {
                                    txt.append("Notice:6- "+notice + "\n\n");
                                }else if (id.equals("7")) {
                                    txt.append("Notice:7- "+notice + "\n\n");
                                }else if (id.equals("8")) {
                                    txt.append("Notice:8- "+notice + "\n\n");
                                }else if (id.equals("8")) {
                                    txt.append("Notice:8- "+notice + "\n\n");
                                }else if (id.equals("9")) {
                                    txt.append("Notice:9- "+notice + "\n\n");
                                }else if (id.equals("10")) {
                                    txt.append("Notice:10- "+notice + "\n\n");
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

                        Toast.makeText(clubs.this, "Network error..!", Toast.LENGTH_LONG).show();

                    }
                });
        RequestQueue requestQueue = Volley.newRequestQueue(clubs.this);
        requestQueue.add(jsonArrayRequest);

    }

}