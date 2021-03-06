package com.ntian.greendaodb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.ntian.greendaodb.VideoScanRecords;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table VIDEO_SCAN_RECORDS.
*/
public class VideoScanRecordsDao extends AbstractDao<VideoScanRecords, Long> {

    public static final String TABLENAME = "VIDEO_SCAN_RECORDS";

    /**
     * Properties of entity VideoScanRecords.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Base_ID = new Property(1, Long.class, "Base_ID", false, "BASE__ID");
        public final static Property Is_Scanned = new Property(2, Boolean.class, "Is_Scanned", false, "IS__SCANNED");
        public final static Property PlayedPosition = new Property(3, Long.class, "PlayedPosition", false, "PLAYED_POSITION");
        public final static Property Last_Played = new Property(4, java.util.Date.class, "Last_Played", false, "LAST__PLAYED");
    };


    public VideoScanRecordsDao(DaoConfig config) {
        super(config);
    }
    
    public VideoScanRecordsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'VIDEO_SCAN_RECORDS' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'BASE__ID' INTEGER," + // 1: Base_ID
                "'IS__SCANNED' INTEGER," + // 2: Is_Scanned
                "'PLAYED_POSITION' INTEGER," + // 3: PlayedPosition
                "'LAST__PLAYED' INTEGER);"); // 4: Last_Played
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'VIDEO_SCAN_RECORDS'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, VideoScanRecords entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long Base_ID = entity.getBase_ID();
        if (Base_ID != null) {
            stmt.bindLong(2, Base_ID);
        }
 
        Boolean Is_Scanned = entity.getIs_Scanned();
        if (Is_Scanned != null) {
            stmt.bindLong(3, Is_Scanned ? 1l: 0l);
        }
 
        Long PlayedPosition = entity.getPlayedPosition();
        if (PlayedPosition != null) {
            stmt.bindLong(4, PlayedPosition);
        }
 
        java.util.Date Last_Played = entity.getLast_Played();
        if (Last_Played != null) {
            stmt.bindLong(5, Last_Played.getTime());
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public VideoScanRecords readEntity(Cursor cursor, int offset) {
        VideoScanRecords entity = new VideoScanRecords( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // Base_ID
            cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0, // Is_Scanned
            cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3), // PlayedPosition
            cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)) // Last_Played
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, VideoScanRecords entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBase_ID(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setIs_Scanned(cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0);
        entity.setPlayedPosition(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
        entity.setLast_Played(cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(VideoScanRecords entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(VideoScanRecords entity) {
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
