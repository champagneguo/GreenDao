package com.ntian.videoplayer.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.ntian.videoplayer.greendao.VideoScanRecords;

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
        public final static Property Video_path = new Property(5, String.class, "Video_path", false, "VIDEO_PATH");
        public final static Property Time_Flag = new Property(6, Long.class, "Time_Flag", false, "TIME__FLAG");
        public final static Property Title = new Property(7, String.class, "Title", false, "TITLE");
        public final static Property Duration = new Property(8, Long.class, "Duration", false, "DURATION");
        public final static Property DateModified = new Property(9, Long.class, "DateModified", false, "DATE_MODIFIED");
        public final static Property IsDrm = new Property(10, Boolean.class, "IsDrm", false, "IS_DRM");
        public final static Property Support3D = new Property(11, Boolean.class, "Support3D", false, "SUPPORT3_D");
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
                "'LAST__PLAYED' INTEGER," + // 4: Last_Played
                "'VIDEO_PATH' TEXT," + // 5: Video_path
                "'TIME__FLAG' INTEGER," + // 6: Time_Flag
                "'TITLE' TEXT," + // 7: Title
                "'DURATION' INTEGER," + // 8: Duration
                "'DATE_MODIFIED' INTEGER," + // 9: DateModified
                "'IS_DRM' INTEGER," + // 10: IsDrm
                "'SUPPORT3_D' INTEGER);"); // 11: Support3D
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
 
        String Video_path = entity.getVideo_path();
        if (Video_path != null) {
            stmt.bindString(6, Video_path);
        }
 
        Long Time_Flag = entity.getTime_Flag();
        if (Time_Flag != null) {
            stmt.bindLong(7, Time_Flag);
        }
 
        String Title = entity.getTitle();
        if (Title != null) {
            stmt.bindString(8, Title);
        }
 
        Long Duration = entity.getDuration();
        if (Duration != null) {
            stmt.bindLong(9, Duration);
        }
 
        Long DateModified = entity.getDateModified();
        if (DateModified != null) {
            stmt.bindLong(10, DateModified);
        }
 
        Boolean IsDrm = entity.getIsDrm();
        if (IsDrm != null) {
            stmt.bindLong(11, IsDrm ? 1l: 0l);
        }
 
        Boolean Support3D = entity.getSupport3D();
        if (Support3D != null) {
            stmt.bindLong(12, Support3D ? 1l: 0l);
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
            cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)), // Last_Played
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // Video_path
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6), // Time_Flag
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // Title
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // Duration
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // DateModified
            cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0, // IsDrm
            cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0 // Support3D
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
        entity.setVideo_path(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTime_Flag(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
        entity.setTitle(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setDuration(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setDateModified(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setIsDrm(cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0);
        entity.setSupport3D(cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0);
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
