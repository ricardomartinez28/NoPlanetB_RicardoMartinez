package com.example.noplanetb_ricardomartinez;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.CircularPropagation;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.mikhaellopez.circularimageview.CircularImageView;

public class SplashScreen extends AppCompatActivity {

    private CircularImageView cohete;
    private TextView titulo;
    private TextView subtitulo;
    private ImageView fondo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        fondo=findViewById(R.id.ivfondo);
        cohete=findViewById(R.id.coheteCirculo);
        titulo=findViewById(R.id.txtTituloSplash);
        subtitulo=findViewById(R.id.txtSubtitulo);

        Glide.with(this).load(R.drawable.planetearth).apply(new RequestOptions().centerCrop().diskCacheStrategy(DiskCacheStrategy.ALL)).into(fondo);

        Animation animTitulo = AnimationUtils.loadAnimation(this, R.anim.fadein);
        titulo.setAnimation(animTitulo);
        Animation animSub= AnimationUtils.loadAnimation(this,R.anim.fadein);
        subtitulo.setAnimation(animSub);
        Animation animCohete= AnimationUtils.loadAnimation(this,R.anim.slideup);
        cohete.setAnimation(animCohete);
        getSupportActionBar().hide();






        siguienteActivity();

    }

    private void siguienteActivity() {
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(SplashScreen.this, Login.class);
                startActivity(i);
                finish();
            }
        },5000);
    }

}
