package com.londonappbrewery.destini;

/**
 * Created by bruceburgess on 4/9/18.
 */

public class StoryFlow {

    private int[] mStoryStrings;
    private int[] mTopButtonStrings;
    private int[] mBottomButtonStrings;
    private int[] mEndStrings;

    public StoryFlow() {
        setupStringsArrays();
    }

    private void setupStringsArrays() {
        mStoryStrings = new int[] {
                R.string.T1_Story,
                R.string.T2_Story,
                R.string.T3_Story
        };
        mTopButtonStrings = new int[] {
                R.string.T1_Ans1,
                R.string.T2_Ans1,
                R.string.T3_Ans1
        };
        mBottomButtonStrings = new int[] {
                R.string.T1_Ans2,
                R.string.T2_Ans2,
                R.string.T3_Ans2
        };
        mEndStrings = new int[] {
                R.string.T4_End,
                R.string.T5_End,
                R.string.T6_End
        };
    }

    public int[] checkStroyState(int state) {
        int[] updateStory;
        if (state == 0) {
            updateStory = new int[]{mStoryStrings[0], mTopButtonStrings[0], mBottomButtonStrings[0]};
        }
        else if(state == 1) {
            updateStory = new int[]{mStoryStrings[1], mTopButtonStrings[1], mBottomButtonStrings[1]};
        }
        else if (state == 2) {
            updateStory = new int[]{mStoryStrings[2], mTopButtonStrings[2], mBottomButtonStrings[2]};
        }
        else if (state == 3) {
            updateStory = new int[]{mEndStrings[0], R.string.TButton_End , R.string.TButton_End};
        }
        else if (state == 4) {
            updateStory = new int[]{mEndStrings[1], R.string.TButton_End , R.string.TButton_End};
        }
        else if (state == 5) {
            updateStory = new int[]{mEndStrings[2], R.string.TButton_End , R.string.TButton_End};
        }
        else
            updateStory = new int[]{R.string.TError , R.string.TButton_End, R.string.TButton_End};

        return updateStory;
    }

}
