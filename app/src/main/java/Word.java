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

    public int getmAudioResourceID() {
        return mAudioResourceID;
    }

    public void setmAudioResourceID(int mAudioResourceID) {
        this.mAudioResourceID = mAudioResourceID;
    }

    private int mAudioResourceID;

    // word image name
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;




    // return true or false if an image is set
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceID=" + mAudioResourceID +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

    // class contstructor
    public Word(String mDefaultTranslation, String mMiwokTranslation, int audioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceID = audioResourceId;
    }

    // class contstructor with Image
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageName, int audioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageName;
        this.mAudioResourceID = audioResourceId;
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

    // get the word id
    public int getWordImageID() {
        return mImageResourceId;
    }

    // set the word id
    public void setWordImageID(int wordImageID) {
        this.mImageResourceId = wordImageID;
    }
}
