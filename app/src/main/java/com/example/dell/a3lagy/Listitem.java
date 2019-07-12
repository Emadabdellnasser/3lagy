package com.example.dell.a3lagy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.HorizontalScrollView;

/**
 * Created by DELL on 9/25/2018.
 */

public class Listitem extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
//        final HorizontalScrollView hsv = (HorizontalScrollView) findViewById(R.id.scroll);
//
//        // Scrolling to button 5.
//        hsv.post(new Runnable() {
//            @Override
//            public void run() {
//                // Get the button.
//                View Liner = findViewById(R.id.lay);
//
//                // Locate the button.
//                int x, y;
//                x = Liner.getRight();
//                y = Liner.getTop();
//
//                // Scroll to the button.
//                hsv.scrollTo(x, y);
//            }
//        });
    }
}
