package com.ankita.embedded;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Ankita on 13-Jun-17.
 */

public class Connection extends AppCompatActivity{


    EditText ipAdd;
    EditText portNo;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connection);

       ipAdd = (EditText) findViewById(R.id.ipadd);


        portNo = (EditText) findViewById(R.id.port);


         button = (Button) findViewById(R.id.btnLogin);


        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String ip = ipAdd.getText().toString();
              //  Intent intent1 = new Intent(getBaseContext(), ClientActivity.class);
                //intent1.putExtra("ipaddress", ip);

               // int port = Integer.parseInt(portNo.getText().toString());


                String port = portNo.getText().toString();

                Intent intent = new Intent(getBaseContext(), ClientActivity.class);
                Bundle extras = new Bundle();
                extras.putString("","my_username");
                extras.putString("EXTRA_PASSWORD","my_password");
                intent.putExtras(extras);
                startActivity(intent);


/*                int port = Integer.parseInt( portNo.getText().toString() );
                Intent intent2 = new Intent(getBaseContext(), ClientActivity.class);
                intent2.putExtra("portnumber", port);*/

              //  Intent intent = new Intent(getApplicationContext(), ClientActivity.class);
//                startActivity(intent1);
              //  startActivity(intent2);



               /* if (pass.equals("abc")) {
                    Toast toast = Toast.makeText(getApplicationContext(), "pass ok", Toast.LENGTH_SHORT);
                    toast.show();


                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "wrong pass", Toast.LENGTH_SHORT);
                    toast.show();
                }*/
            }
        });
    }
}
