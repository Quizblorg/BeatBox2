package com.bignerdranch.android.beatbox2;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class SoundViewModel extends BaseObservable {
	private Sound mSound;
	private BeatBox mBeatBox;

	public SoundViewModel(BeatBox beatBox) {
		mBeatBox = beatBox;
	}

	public Sound getSound() {
		return mSound;
	}

	@Bindable
	public String getTitle() {
		return getSound().getName();
	}

	public void setSound(Sound sound) {
		mSound = sound;
		notifyChange();
	}
}
