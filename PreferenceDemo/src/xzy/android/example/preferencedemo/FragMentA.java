/**
 *
 */
package xzy.android.example.preferencedemo;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

/**
 * (C) 2012 zhengyang.xu
 *
 * @author zhengyang.xu
 * @version 0.1
 * @since 2:27:22 PM Sep 6, 2012
 */
public class FragMentA extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PreferenceManager.setDefaultValues(this.getActivity(), R.xml.fragment_a_preference, false);

        addPreferencesFromResource(R.xml.fragment_a_preference);
    }


}
