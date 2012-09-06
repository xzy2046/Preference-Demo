package xzy.android.example.preferencedemo;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;

import java.util.List;

public class DemoMainActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
    }

    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preference_headers, target);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public static class FragmentAActivity extends DemoMainActivity { /* empty */ }
    public static class FragmentBActivity extends DemoMainActivity { /* empty */ }
    public static class FragmentCActivity extends DemoMainActivity { /* empty */ }

}
