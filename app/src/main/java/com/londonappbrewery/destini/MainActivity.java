package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryTextView;
    Button mTopButton;
    Button mBottomButton;
    private int mState;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);;
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "mState before: " + mState);
                mState = setStoryState(mState, true);
                Log.d("MainActivity", "mState after: " + mState);
                updateStory(mState);
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "mState before: " + mState);
                mState = setStoryState(mState, false);
                Log.d("MainActivity", "mState after: " + mState);
                updateStory(mState);
            }
        });

    }

    private int setStoryState(int currentState, boolean isTopButton) {
        if(isTopButton) {
            switch(currentState){
                case 0:
                    return 2;
                case 1:
                    return 2;
                case 2:
                    return 5;
                case 3:
                    return 0;
                case 4:
                    return 0;
                case 5:
                    return 0;
                default:
                    Log.d("MainActivity", "Issues of non-existant state, reset state to 0");
                    return 0;
            }
        } else {
            switch(currentState){
                case 0:
                    return 1;
                case 1:
                    return 3;
                case 2:
                    return 4;
                case 3:
                    return 0;
                case 4:
                    return 0;
                case 5:
                    return 0;
                default:
                    Log.d("MainActivity", "Issues of non-existant state, reset state to 0");
                    return 0;
            }
        }

    }

    private void updateStory(int state) {
        StoryFlow flow = new StoryFlow();
        int[] updateText = flow.checkStroyState(state);
        mStoryTextView.setText(updateText[0]);
        mTopButton.setText(updateText[1]);
        mBottomButton.setText(updateText[2]);
    }


}
