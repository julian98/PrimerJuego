package com.example.a41615045.tpfinalandroid;

import android.util.Log;

import org.cocos2d.layers.Layer;
import org.cocos2d.nodes.CocosNode;
import org.cocos2d.nodes.Director;
import org.cocos2d.nodes.Scene;
import org.cocos2d.nodes.Sprite;
import org.cocos2d.opengl.CCGLSurfaceView;
import org.cocos2d.types.CCSize;

/**
 * Created by 41615045 on 13/9/2016.
 */
public class clsJuego {
    CCGLSurfaceView _VistaDelJuego;
    CCSize PantallaDelDispositivo;
    Sprite NaveJugador;

    public clsJuego(CCGLSurfaceView VistaDelJuego) {
        Log.d("Bob", "Comienza el constructor de la clase");
    _VistaDelJuego=VistaDelJuego;
    }
    public void ComenzarJuego(){
        Log.d("Comenzar", "Comienza el juego");
        Director.sharedDirector().attachInView(_VistaDelJuego);

        PantallaDelDispositivo=Director.sharedDirector().displaySize();
        Log.d("Comenzar", "Pantalla del dispositivo - ancho:"+PantallaDelDispositivo.width+ " - alto: " +PantallaDelDispositivo.height);


        Director.sharedDirector().runWithScene(EscenaDelJuego());

    }
    private Scene EscenaDelJuego(){
        Log.d("EscenaDelJuego", "Comienza el armado de escena");

        Log.d("EscenaDelJuego", "Declaro e instancio la escena del juego en si");
        Scene EscenaADevolver;
        EscenaADevolver=Scene.node();

        Log.d("EscenaDelJuego", "Declaro e instancio la capa que va a contener la imagen de fondo");
        CapaDeFondo MiCapaFondo=new CapaDeFondo();
        CapaFrente MiCapaFrente =new CapaFrente();

        Log.d("EscenaDelJuego", "Declaro e instancio la capa que va a contener el jugador y a los enemigos");
        EscenaADevolver.addChild(MiCapaFondo, -10);
        EscenaADevolver.addChild(MiCapaFrente, 10);

        Log.d("EscenaDelJuego", "Devuelvo la escena ya armada");
        return EscenaADevolver;
    }

    private class CapaDeFondo extends Layer {
    }

    private class CapaFrente extends Layer {

    }
    class CapaDelFrente extends Layer {


    }
}
