package com.example.animation_in_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView text;
     Button scale1,rotate,alpha,translate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        scale1=findViewById(R.id.scale1);
        rotate=findViewById(R.id.rotate);
        alpha=findViewById(R.id.alpha);
        translate=findViewById(R.id.translate);



     translate.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Animation translate_animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate_animation);

             text.startAnimation(translate_animation);
         }
     });
     scale1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Animation scale_animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale_animation);
             text.startAnimation(scale_animation);
         }
     });
     alpha.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Animation alpha_animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha_animation);
             text.startAnimation(alpha_animation);
         }
     });
      rotate.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Animation rotate_animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate_animation);
              text.startAnimation(rotate_animation);
          }
      });
    }
}