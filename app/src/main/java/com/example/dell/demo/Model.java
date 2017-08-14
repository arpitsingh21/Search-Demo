package com.example.dell.demo;

/**
 * Created by dell on 14-08-2017.
 */


    public class Model {
        public static final int TEXT_TYPE=0;
        public static final int IMAGE_TYPE=1;
        public static final int AUDIO_TYPE=2;

        public String s;
        public  String data;
        public String text;

        public Model(String text, String data, String s)
        {
            this.s=s;
            this.data=data;
            this.text=text;
        }
    }

