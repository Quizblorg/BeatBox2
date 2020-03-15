package com.bignerdranch.android.beatbox2;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BeatBox {
	private static final String TAG = "com.bignerdranch.android.beatbox2.BeatBox";

	private static final String SOUNDS_FOLDER = "sample_sounds";
	private static final int MAX_SOUNDS = 5;
	private List<Sound> mSounds = new ArrayList<>();
	private AssetManager mAssets;

	public BeatBox(Context context) {
		mAssets = context.getAssets();
		loadSounds();
	}

	private void loadSounds() {
		String[] soundNames;
		try {
			soundNames = mAssets.list(SOUNDS_FOLDER);
			Log.i(TAG, "Found " + soundNames.length + " sounds");
		} catch (IOException ioe) {
			Log.e(TAG, "Could not list assets", ioe);
			return;
		}
		for (String filename : soundNames) {
			String assetPath = SOUNDS_FOLDER + "/" + filename;
			Sound sound = new Sound(assetPath);
			mSounds.add(sound);
		}
	}

	public List<Sound> getSounds() {
		return mSounds;
	}
}
