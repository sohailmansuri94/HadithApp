package com.mansuribros.randomhadith;
/* Things need to FIX
some variables are repeating
Clean up code
add a method to check online way
a better way to get a random hadith on startup and on click
May be a share Button??
*/


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RandomHadithActivity extends AppCompatActivity {

    //Declare Variables
    private TextView mShowHadithChapterName;
    private TextView mShowHadith;
    private TextView mShowSource;
    private TextView mShowBookNumber;
    private Button mRandomHadith;
    private Button mNextHadith;
    private RandomOfflineHadithBook mRandomOfflineHadithBookObj = new RandomOfflineHadithBook();//RandomOfflineHadithBook Object
    private NextOfflineHadithBook mNextOfflineHadithBookObj = new NextOfflineHadithBook();//RandomOfflineHadithBook Object
    int num;

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

        mShowHadithChapterName.setText(mRandomOfflineHadithBookObj.getHadithChapterName());
        mShowHadith.setText(mRandomOfflineHadithBookObj.getHadith());
        mShowSource.setText(mRandomOfflineHadithBookObj.getHadithSource());
        mShowBookNumber.setText(mRandomOfflineHadithBookObj.getBookNumber());


        mRandomHadith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show another Hadith
                mRandomOfflineHadithBookObj = new RandomOfflineHadithBook();//RandomOfflineHadithBook Object
                String hadithChapterName = mRandomOfflineHadithBookObj.getHadithChapterName(); //Hadith Chapter
                String hadith = mRandomOfflineHadithBookObj.getHadith(); //Hadith
                String hadithSource = mRandomOfflineHadithBookObj.getHadithSource(); //Hadith Collector
                String BookNumber = mRandomOfflineHadithBookObj.getBookNumber(); //Hadith Book number and Hadith Number
                int randomNum = mRandomOfflineHadithBookObj.randomNumber();

                //set the display result
                mShowHadithChapterName.setText(hadithChapterName);
                mShowHadith.setText(hadith);
                mShowSource.setText(hadithSource);
                mShowBookNumber.setText(BookNumber);
                num = randomNum;
            }
        });

        mNextHadith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show next Hadith
                mNextOfflineHadithBookObj = new NextOfflineHadithBook();//RandomOfflineHadithBook Object
                String hadithChapterName = mNextOfflineHadithBookObj.getHadithChapterName(num); //Hadith Chapter
                String hadith = mNextOfflineHadithBookObj.getHadith(num); //Hadith
                String hadithSource = mNextOfflineHadithBookObj.getHadithSource(num); //Hadith Collector
                String BookNumber = mNextOfflineHadithBookObj.getBookNumber(num); //Hadith Book number and Hadith Number
                int arrayLength = mNextOfflineHadithBookObj.getHadithArrayLength();

                //set the display result
                mShowHadithChapterName.setText(hadithChapterName);
                mShowHadith.setText(hadith);
                mShowSource.setText(hadithSource);
                mShowBookNumber.setText(BookNumber);
                num = num+1;

                if(num == arrayLength){
                    num = 0;
                }

            }
        });

    }
}