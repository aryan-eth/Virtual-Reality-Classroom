package com.example.org.gvrfapplication;

import android.os.Bundle;

import org.gearvrf.GVRActivity;
import org.gearvrf.GVRAndroidResource;
import org.gearvrf.GVRContext;
import org.gearvrf.GVRMain;
import org.gearvrf.GVRSceneObject;
import org.gearvrf.GVRTexture;

public class MainActivity extends GVRActivity {


    MainScene main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Set Main Scene
         * It will be displayed when app starts
         */
        main = new MainScene();
        setMain(new MainScene());
    }

    private final class Main extends GVRMain {

        Main main = new Main();
        @Override
        public void onInit(GVRContext gvrContext) throws Throwable {

            //Load texture
//            GVRTexture texture = gvrContext.getAssetLoader().loadTexture(new GVRAndroidResource(gvrContext, R.drawable.__default_splash_screen__));
//
//            //Create a rectangle with the texture we just loaded
//            GVRSceneObject quad = new GVRSceneObject(gvrContext, 4, 2, texture);
//            quad.getTransform().setPosition(0, 0, -3);
//
//            //Add rectangle to the scene
//            gvrContext.getMainScene().addSceneObject(quad);
        }

        @Override
        public SplashMode getSplashMode() {
            return SplashMode.NONE;
        }

        @Override
        public void onStep() {
            //Add update logic here
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        main.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        main.onPause();
    }
}