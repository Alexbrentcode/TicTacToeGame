package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int counter = 1;
    ArrayList<String> usedSpaces = new ArrayList();
    int a1, a2, a3, b1, b2, b3, c1, c2, c3 = 0;

    public boolean isEqual(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void clickTile(View view) {
        ImageView topLeft = (ImageView) findViewById(R.id.a1);
        ImageView topMiddle = (ImageView) findViewById(R.id.a2);
        ImageView topRight = (ImageView) findViewById(R.id.a3);

        ImageView middleLeft = (ImageView) findViewById(R.id.a4);
        ImageView middleMiddle = (ImageView) findViewById(R.id.a5);
        ImageView middleRight = (ImageView) findViewById(R.id.a6);

        ImageView bottomLeft = (ImageView) findViewById(R.id.a7);
        ImageView bottomMiddle = (ImageView) findViewById(R.id.a8);
        ImageView bottomRight = (ImageView) findViewById(R.id.a9);

        String tag = view.getTag().toString();
            for (int x = 0; x < usedSpaces.size(); x++) {
                if (usedSpaces.get(x).equals(tag)) {
                    Toast.makeText(this, "Space already used.", Toast.LENGTH_SHORT).show();
                    counter--;
                    break;
                }
            }

            switch (tag) {
                case "1.1":
                    if (isEqual(counter)) {
                        topLeft.setImageResource(R.drawable.whitecircle);
                        topLeft.animate().alpha(1).setDuration(1000);
                        a1 = 1;
                    } else {
                        topLeft.animate().alpha(1).setDuration(1000);
                        a1 = 5;
                    }
                    counter++;
                    usedSpaces.add("1.1");
                    break;
                case "1.2":
                    if (isEqual(counter)) {
                        topMiddle.setImageResource(R.drawable.whitecircle);
                        topMiddle.animate().alpha(1).setDuration(1000);
                        a2 = 1;
                    } else {
                        topMiddle.animate().alpha(1).setDuration(1000);
                        a2 = 5;
                    }
                    counter++;
                    usedSpaces.add("1.2");
                    break;
                case "1.3":
                    if (isEqual(counter)) {
                        topRight.setImageResource(R.drawable.whitecircle);
                        topRight.animate().alpha(1).setDuration(1000);
                        a3 = 1;
                    } else {
                        topRight.animate().alpha(1).setDuration(1000);
                        a3 = 5;
                    }
                    counter++;
                    usedSpaces.add("1.3");
                    break;
                case "2.1":
                    if (isEqual(counter)) {
                        middleLeft.setImageResource(R.drawable.whitecircle);
                        middleLeft.animate().alpha(1).setDuration(1000);
                        b1 = 1;
                    } else {
                        middleLeft.animate().alpha(1).setDuration(1000);
                        b1 = 5;
                    }
                    counter++;
                    usedSpaces.add("2.1");
                    break;
                case "2.2":
                    if (isEqual(counter)) {
                        middleMiddle.setImageResource(R.drawable.whitecircle);
                        middleMiddle.animate().alpha(1).setDuration(1000);
                        b2 = 1;
                    } else {
                        middleMiddle.animate().alpha(1).setDuration(1000);
                        b2 = 5;
                    }
                    counter++;
                    usedSpaces.add("2.2");
                    break;
                case "2.3":
                    if (isEqual(counter)) {
                        middleRight.setImageResource(R.drawable.whitecircle);
                        middleRight.animate().alpha(1).setDuration(1000);
                        b3 = 1;
                    } else {
                        middleRight.animate().alpha(1).setDuration(1000);
                        b3 = 5;
                    }
                    counter++;
                    usedSpaces.add("2.3");
                    break;
                case "3.1":
                    if (isEqual(counter)) {
                        bottomLeft.setImageResource(R.drawable.whitecircle);
                        bottomLeft.animate().alpha(1).setDuration(1000);
                        c1 = 1;
                    } else {
                        bottomLeft.animate().alpha(1).setDuration(1000);
                        c1 = 5;
                    }
                    counter++;
                    usedSpaces.add("3.1");
                    break;
                case "3.2":
                    if (isEqual(counter)) {
                        bottomMiddle.setImageResource(R.drawable.whitecircle);
                        bottomMiddle.animate().alpha(1).setDuration(1000);
                        c2 = 1;
                    } else {
                        bottomMiddle.animate().alpha(1).setDuration(1000);
                        c2 = 5;
                    }
                    counter++;
                    usedSpaces.add("3.2");
                    break;
                case "3.3":
                    if (isEqual(counter)) {
                        bottomRight.setImageResource(R.drawable.whitecircle);
                        bottomRight.animate().alpha(1).setDuration(1000);
                        c3 = 1;
                    } else {
                        bottomRight.animate().alpha(1).setDuration(1000);
                        c3 = 5;
                    }
                    counter++;
                    usedSpaces.add("3.3");
                    break;
            }

            Log.i("inf", "" + a1);
            Log.i("inf", "" + a2);
            Log.i("inf", "" + a3);

            if (a1 + a2 + a3 == 3 || b1 + b2 + b3 == 3 || c1 + c2 + c3 == 3 || a1+ b1+ c1 == 3 || a2 + b2 + c2 == 3 || a3 + b3 + c3 == 3 || a1+ b2+ c3 == 3 || a3 + b2 + c1 ==3) {
                Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            }
            if (a1 + a2 + a3 == 15 || b1 + b2 + b3 == 15 || c1 + c2 + c3 == 15 || a1+ b1+ c1 == 15 || a2 + b2 + c2 == 15 || a3 + b3 + c3 == 15 || a1+ b2+ c3 == 15 || a3 + b2 + c1 == 15) {
                Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
        }
        }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}