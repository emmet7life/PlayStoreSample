package jp.classmethod.android.sample.playstore;

import java.util.ArrayList;

/**
 * �y�[�W�̃A�C�e��.
 */
public class PageItem {
    
    /** GridView �� Fragment �� Id. */
    public static final int GRID = 0;
    /** RelativeLayout �� Fragment �� Id. */
    public static final int RELATIVE = 1;
    
    /** �y�[�W��. */
    public String title;
    /** Fragment �̎��. */
    public int fragmentKind;
    /** �A�v���P�[�V�����̃��X�g. */
    public ArrayList<App> appList;

}
