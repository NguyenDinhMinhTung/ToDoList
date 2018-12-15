package com.example.megas.todolist.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    public static final String TB_EVEN="EVEN";
    public static final String TB_SYNCQUEUE="SYNCQUEUE";

    public static final String TB_EVEN_ID="id";
    public static final String TB_EVEN_EVENID="evenid";
    public static final String TB_EVEN_EVENNAME="evenname";
    public static final String TB_EVEN_TYPE="type";
    public static final String TB_EVEN_DAYTIME="daytime";
    public static final String TB_EVEN_NOTIDAY="notiday";
    public static final String TB_EVEN_STATUS="status";
    public static final String TB_EVEN_COLOR="color";
    public static final String TB_EVEN_OBJECTID="objectid";
    public static final String TB_EVEN_COMMENT="comment";

    public static final String TB_SYNCQUEUE_ID="id";
    public static final String TB_SYNCQUEUE_EVENID="evenid";
    public static final String TB_SYNCQUEUE_STATUS="status";

    public Database(Context context){
        super(context,"TODOLISTDB",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
String tbEven="CREATE TABLE "+TB_EVEN+"("+TB_EVEN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+TB_EVEN_EVENID+" INTEGER, "+TB_EVEN_EVENNAME+" TEXT, "+
        TB_EVEN_TYPE+" INTEGER, "+TB_EVEN_DAYTIME+" TEXT, "+TB_EVEN_NOTIDAY+" INTEGER, "+TB_EVEN_STATUS+" INTEGER, "+TB_EVEN_COLOR+" INTEGER, "+TB_EVEN_OBJECTID+" INTEGER, "+
        TB_EVEN_COMMENT+" TEXT)";
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
