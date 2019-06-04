package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;

    /**
     * Construct new Word object initialized with
     * @param defaultTranslation is the word in the user's system language
     * @param miwokTranslation is the Miwok translation of the word
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Overload constructor with
     * @param defaultTranslation is the word in the user's system language
     * @param miwokTranslation is the Miwok translation of the word
     * @param imageResourceID is an integer that ID's the image
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }

    /**
     * Get the default (system language) translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() { return mImageResourceID; }
}
