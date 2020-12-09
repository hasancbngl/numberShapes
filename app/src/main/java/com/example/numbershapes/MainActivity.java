package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number{
        int number;
        public boolean isSquare() {
            double squareRoot=Math.sqrt(number);
            if (squareRoot==Math.floor(squareRoot)){
                return true;
            }
            else {
                return false;
            }
        }

        public boolean isTriangular() {

            int x=1;
            int triangularNumber = 1;
            while(triangularNumber<number) {
                x++;
                triangularNumber=triangularNumber+x;
            }
            if(triangularNumber==number) {
                return true; }
            else {
                return false; }

        }

    }


    public void testNumber(View view) {
        String message="";
        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);
            if (usersNumber.getText().toString().isEmpty()) {
                message="Please enter a number";

            }
           else {
                Number myNumber = new Number();
                myNumber.number = Integer.parseInt(usersNumber.getText().toString());


                if (myNumber.isSquare()) {
                    if (myNumber.isTriangular()) {
                        message = myNumber.number + "  is both triangular and square number.";
                    } else {
                        message = myNumber.number + "  is only square but not triangular number.";
                    }
                } else {
                    if (myNumber.isTriangular()) {
                        message = myNumber.number + "  is triangular but not square number.";
                    } else {
                        message = myNumber.number + "  is neither triangular nor square number.";
                    }


                }

               }
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();




    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
