package com.example.myagriapp;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBName = "FarmerLogin.db";

    public DBHelper(Context context) {
        super(context, "FarmerLogin.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase Logindb) {
        Logindb.execSQL("create Table farmers(deviceid TEXT primary key,password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase Logindb, int oldVersion, int newVersion) {
        Logindb.execSQL("drop table if exists farmers");
    }

    public Boolean insertData(String deviceid, String password) {
        SQLiteDatabase Logindb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("deviceid", deviceid);
        contentValues.put("password", password);
        long result = Logindb.insert("farmers", null, contentValues);
        if (result == -1) return false;
        else return true;
    }

    public Boolean checkid(String deviceid) {
        SQLiteDatabase Logindb = this.getWritableDatabase();
        Cursor cursor= Logindb.rawQuery("Select * from farmers where username = ?",new String[] {deviceid});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public Boolean checkpassword(String deviceid, String password)
    {
        SQLiteDatabase Logindb=this.getWritableDatabase();
        Cursor cursor=Logindb.rawQuery("Select * from farmers where username = ? and password = ?", new String[]{deviceid,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}

