package com.text.lg.myapplication.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by lg on 2018/2/2.
 */
@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION)
public class AppDatabase {
    //此处改为自己APP的名称
    public static final String NAME = "myAppName-db";

    public static final int VERSION = 1;
}
