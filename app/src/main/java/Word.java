package com.example.android.miwok;

/**
 * {@link Word} represents the vocabulary the user wants to learn/
 * It contains the two translations of the word *
 */

public class Word {

    // default language translation
    private String mDefaultTranslation;

    // miwok language translation
    private String mMiwokTranslation;

    // class contstructor
    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    // get the default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // set the default translation
    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    // get the miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // set the miwok translation
    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }
}
