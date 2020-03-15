package com.bignerdranch.android.beatbox2;

import android.support.v4.app.Fragment;

import com.bignerdranch.android.beatbox2.BeatBoxFragment;
import com.bignerdranch.android.beatbox2.SingleFragmentActivity;

public class BeatBoxActivity extends SingleFragmentActivity {
	@Override
	protected Fragment createFragment() {
		return BeatBoxFragment.newInstance();
	}
}