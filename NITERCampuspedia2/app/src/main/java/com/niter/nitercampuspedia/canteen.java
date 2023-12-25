package com.niter.nitercampuspedia;
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


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class canteen extends AppCompatActivity {

    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);
        setContentView(R.layout.activity_canteen);
        getSupportActionBar().setTitle("Canteen and Cafeteria");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtview=findViewById(R.id.txtview);
        String url = "https://shaikat005.000webhostapp.com/Room-207/canteen.json";


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
                                    txtview.append(notice + "\n\n");
                                } else if (id.equals("2")) {
                                    txtview.append(notice + "\n\n");
                                } else if (id.equals("3")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("4")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("5")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("6")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("7")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("8")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("9")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("10")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("11")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("12")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("13")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("14")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("15")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("16")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("17")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("18")) {
                                    txtview.append(notice + "\n\n");
                                }else if (id.equals("19")) {
                                    txtview.append(notice + "\n\n");
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

                        Toast.makeText(canteen.this, "Network error..!", Toast.LENGTH_LONG).show();

                    }
                });
        RequestQueue requestQueue = Volley.newRequestQueue(canteen.this);
        requestQueue.add(jsonArrayRequest);

    }
}