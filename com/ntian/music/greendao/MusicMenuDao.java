package com.ntian.music.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.ntian.music.greendao.MusicMenu;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table MUSIC_MENU.
*/
public class MusicMenuDao extends AbstractDao<MusicMenu, Long> {

    public static final String TABLENAME = "MUSIC_MENU";

    /**
     * Properties of entity MusicMenu.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property MenuName = new Property(1, String.class, "MenuName", false, "MENU_NAME");
        public final static Property AddTime = new Property(2, java.util.Date.class, "AddTime", false, "ADD_TIME");
        public final static Property MusicItems = new Property(3, Integer.class, "MusicItems", false, "MUSIC_ITEMS");
    };


    public MusicMenuDao(DaoConfig config) {
        super(config);
    }
    
    public MusicMenuDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'MUSIC_MENU' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'MENU_NAME' TEXT," + // 1: MenuName
                "'ADD_TIME' INTEGER," + // 2: AddTime
                "'MUSIC_ITEMS' INTEGER);"); // 3: MusicItems
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'MUSIC_MENU'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, MusicMenu entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String MenuName = entity.getMenuName();
        if (MenuName != null) {
            stmt.bindString(2, MenuName);
        }
 
        java.util.Date AddTime = entity.getAddTime();
        if (AddTime != null) {
            stmt.bindLong(3, AddTime.getTime());
        }
 
        Integer MusicItems = entity.getMusicItems();
        if (MusicItems != null) {
            stmt.bindLong(4, MusicItems);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public MusicMenu readEntity(Cursor cursor, int offset) {
        MusicMenu entity = new MusicMenu( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // MenuName
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // AddTime
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3) // MusicItems
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, MusicMenu entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setMenuName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAddTime(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setMusicItems(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(MusicMenu entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(MusicMenu entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}