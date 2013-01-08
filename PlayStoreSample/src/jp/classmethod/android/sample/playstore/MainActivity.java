package jp.classmethod.android.sample.playstore;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        
        // PagerTitleStrip �̃J�X�^�}�C�Y
        PagerTabStrip strip = (PagerTabStrip) findViewById(R.id.strip);
        strip.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        strip.setTextColor(Color.WHITE);
        strip.setTextSpacing(50);
        strip.setNonPrimaryAlpha(0.3f);
        strip.setDrawFullUnderline(true);
        strip.setTabIndicatorColor(Color.GREEN);
        
        // ViewPager �� Adapter
        GridViewPagerAdapter adapter = new GridViewPagerAdapter(getSupportFragmentManager());
        // GridView �� Adapter
        AppListAdapter appListAdapter = new AppListAdapter(getApplication(), R.layout.item_app);
        for (int i = 0; i < 30; i++) {
            App item = new App();
            item.title = "App" + i;
            item.description = "This app is " + i + ".";
            appListAdapter.add(item);
        }
        
        // �e�y�[�W�A�C�e��(�l�C�A�v��)
        PageItem popular = new PageItem();
        popular.title = "Popular App";
        popular.fragment = new GridViewFragment();
        popular.fragment.setAdapter(appListAdapter);
        adapter.addItem(popular);
        
        // �e�y�[�W�A�C�e��(�l�C�A�v��)
        PageItem recommend = new PageItem();
        recommend.title = "Recommend App";
        recommend.fragment = new GridViewFragment();
        recommend.fragment.setAdapter(appListAdapter);
        adapter.addItem(recommend);
        
        // �e�y�[�W�A�C�e��(�����A�v��)
        PageItem free = new PageItem();
        free.title = "Free App";
        free.fragment = new GridViewFragment();
        free.fragment.setAdapter(appListAdapter);
        adapter.addItem(free);
        
        // �e�y�[�W�A�C�e��(�L���A�v��)
        PageItem paid = new PageItem();
        paid.title = "Paid App";
        paid.fragment = new GridViewFragment();
        paid.fragment.setAdapter(appListAdapter);
        adapter.addItem(paid);
        
        pager.setAdapter(adapter);
    }
}
