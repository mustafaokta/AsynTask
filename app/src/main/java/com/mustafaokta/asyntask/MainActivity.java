package com.mustafaokta.asyntask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
    class Arkaplan extends AsyncTask<Void, Void, Void>{

        @Override
        protected void onPreExecute() {//arkaplan işlemleri baslamadan once yapılacaklar
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            //sınıfın ilk değişkeni parametre olarak alınır, 3. donus tıpı olarak

            publishProgress();//ilerlemeyi onprogres update metoduna gonderiyoruz
            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {//sınıfın 2. parametresini alır, işlem durumunu takip edilir
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Void aVoid) {//arkaplan işlemleri bittikten sonra yapılacaklar
            super.onPostExecute(aVoid);
        }
    }


