package com.mansuribros.randomhadith;
/*
Things need to FIX
some variables are repeating
Clean up code
add a method to check online way
a better way to get a random hadith on startup and on click
May be a share Button??
*/


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RandomHadithActivity extends AppCompatActivity {

    private static final String KEY_HADITHCHAPTERNAME = "KEY_HADITHCHAPTERNAME";
    private static final String KEY_HADITH = "KEY_HADITH";
    private static final String KEY_HADITHSOURCE = "KEY_HADITHSOURCE";
    private static final String KEY_HADITHBOOKNUMBER = "KEY_HADITHBOOKNUMBER";
    private static final String KEY_RANDOMNUMBER = "KEY_RANDOMNUMBER";

    //Declare Variables
    private TextView mShowHadithChapterName;
    private TextView mShowHadith;
    private TextView mShowSource;
    private TextView mShowBookNumber;
    private Button mRandomHadith;
    private Button mNextHadith;
    private RandomOfflineHadithBook mRandomOfflineHadithBookObj = new RandomOfflineHadithBook();//RandomOfflineHadithBook Object
    private NextOfflineHadithBook mNextOfflineHadithBookObj = new NextOfflineHadithBook();//RandomOfflineHadithBook Object

    private String mHadithChapterName;
    private String mHadith;
    private String mHadithSource;
    private String mHadithBookNumber;
    private int mRandomNumber;
    private int num;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_HADITHCHAPTERNAME, mHadithChapterName);
        outState.putString(KEY_HADITH, mHadith);
        outState.putString(KEY_HADITHSOURCE, mHadithSource);
        outState.putString(KEY_HADITHBOOKNUMBER, mHadithBookNumber);
        outState.putInt(KEY_RANDOMNUMBER, num);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mHadithChapterName = savedInstanceState.getString(KEY_HADITHCHAPTERNAME);
        mHadith = savedInstanceState.getString(KEY_HADITH);
        mHadithSource = savedInstanceState.getString(KEY_HADITHSOURCE);
        mHadithBookNumber = savedInstanceState.getString(KEY_HADITHBOOKNUMBER);
        mRandomNumber = savedInstanceState.getInt(KEY_RANDOMNUMBER);

        mShowHadithChapterName.setText(mHadithChapterName);
        mShowHadith.setText(mHadith);
        mShowSource.setText(mHadithSource);
        mShowBookNumber.setText(mHadithBookNumber);
        num=mRandomNumber;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_hadith);

        mShowHadithChapterName = (TextView) findViewById(R.id.hadithChapterNameTextView);
        mShowHadith = (TextView) findViewById(R.id.hadithTextView);
        mShowSource = (TextView) findViewById(R.id.hadithSourceTextView);
        mShowBookNumber = (TextView) findViewById(R.id.hadithNumberTextView);
        mRandomHadith = (Button) findViewById(R.id.randomHadithButton);
        mNextHadith = (Button) findViewById(R.id.nextHadithButton);

        num = mRandomOfflineHadithBookObj.getRandomNumber();
        mHadithChapterName = mNextOfflineHadithBookObj.getHadithChapterName(num); //Hadith Chapter
        mHadith = mNextOfflineHadithBookObj.getHadith(num); //Hadith
        mHadithSource = mNextOfflineHadithBookObj.getHadithSource(num); //Hadith Collector
        mHadithBookNumber = mNextOfflineHadithBookObj.getBookNumber(num); //Hadith Book number and Hadith Number

        /*mShowHadithChapterName.setText(mNextOfflineHadithBookObj.getHadithChapterName(num));
        mShowHadith.setText(mNextOfflineHadithBookObj.getHadith(num));
        mShowSource.setText(mNextOfflineHadithBookObj.getHadithSource(num));
        mShowBookNumber.setText(mNextOfflineHadithBookObj.getBookNumber(num));*/

        mShowHadithChapterName.setText(mHadithChapterName);
        mShowHadith.setText(mHadith);
        mShowSource.setText(mHadithSource);
        mShowBookNumber.setText(mHadithBookNumber);


//        savedInstanceState.putString(KEY_HADITH,mHadith);

        num=num+1;

        //RANDOM BUTTON
        mRandomHadith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show another Hadith
                mRandomOfflineHadithBookObj = new RandomOfflineHadithBook();//RandomOfflineHadithBook Object
                mHadithChapterName = mRandomOfflineHadithBookObj.getHadithChapterName(); //Hadith Chapter
                mHadith = mRandomOfflineHadithBookObj.getHadith(); //Hadith
                mHadithSource = mRandomOfflineHadithBookObj.getHadithSource(); //Hadith Collector
                mHadithBookNumber = mRandomOfflineHadithBookObj.getBookNumber(); //Hadith Book number and Hadith Number
                int randomNum = mRandomOfflineHadithBookObj.getRandomNumber();

                //set the display result
                mShowHadithChapterName.setText(mHadithChapterName);
                mShowHadith.setText(mHadith);
                mShowSource.setText(mHadithSource);
                mShowBookNumber.setText(mHadithBookNumber);
//                mRandomNumber.setText(mRandomHadith);
                num = randomNum;
                /*Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "num " + num + " rand Num: "+randomNum, Toast.LENGTH_SHORT);
                toast.show();*/

            }
        });
//        num = mRandomNumber;

        //NEXT BUTTON
        mNextHadith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show next Hadith
                mNextOfflineHadithBookObj = new NextOfflineHadithBook();//RandomOfflineHadithBook Object
                mHadithChapterName = mNextOfflineHadithBookObj.getHadithChapterName(num); //Hadith Chapter
                mHadith = mNextOfflineHadithBookObj.getHadith(num); //Hadith
                mHadithSource = mNextOfflineHadithBookObj.getHadithSource(num); //Hadith Collector
                mHadithBookNumber = mNextOfflineHadithBookObj.getBookNumber(num); //Hadith Book number and Hadith Number
                int arrayLength = mNextOfflineHadithBookObj.getHadithArrayLength();

                //set the display result
                mShowHadithChapterName.setText(mHadithChapterName);
                mShowHadith.setText(mHadith);
                mShowSource.setText(mHadithSource);
                mShowBookNumber.setText(mHadithBookNumber);
                num = num+1;
                if(num == arrayLength){
                    num = 0;
                }

                /*Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "num " + num, Toast.LENGTH_SHORT);
                toast.show();*/

            }
        });

    }
}