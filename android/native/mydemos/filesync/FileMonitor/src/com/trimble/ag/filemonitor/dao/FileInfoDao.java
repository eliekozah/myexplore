package com.trimble.ag.filemonitor.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.trimble.ag.filemonitor.entity.FileInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table FILE_INFO.
*/
public class FileInfoDao extends AbstractDao<FileInfo, Long> {

    public static final String TABLENAME = "FILE_INFO";

    /**
     * Properties of entity FileInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property FilePath = new Property(1, String.class, "filePath", false, "FILE_PATH");
        public final static Property Appname = new Property(2, String.class, "appname", false, "APPNAME");
        public final static Property DescFilePath = new Property(3, String.class, "descFilePath", false, "DESC_FILE_PATH");
        public final static Property RegisteredTime = new Property(4, java.util.Date.class, "registeredTime", false, "REGISTERED_TIME");
        public final static Property LastZipTime = new Property(5, java.util.Date.class, "lastZipTime", false, "LAST_ZIP_TIME");
        public final static Property LastFileSize = new Property(6, Long.class, "lastFileSize", false, "LAST_FILE_SIZE");
        public final static Property AwsFileId = new Property(7, String.class, "awsFileId", false, "AWS_FILE_ID");
        public final static Property Flag = new Property(8, Long.class, "flag", false, "FLAG");
        public final static Property Status = new Property(9, Long.class, "status", false, "STATUS");
    };


    public FileInfoDao(DaoConfig config) {
        super(config);
    }
    
    public FileInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'FILE_INFO' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'FILE_PATH' TEXT," + // 1: filePath
                "'APPNAME' TEXT," + // 2: appname
                "'DESC_FILE_PATH' TEXT," + // 3: descFilePath
                "'REGISTERED_TIME' INTEGER," + // 4: registeredTime
                "'LAST_ZIP_TIME' INTEGER," + // 5: lastZipTime
                "'LAST_FILE_SIZE' INTEGER," + // 6: lastFileSize
                "'AWS_FILE_ID' TEXT," + // 7: awsFileId
                "'FLAG' INTEGER," + // 8: flag
                "'STATUS' INTEGER);"); // 9: status
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'FILE_INFO'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, FileInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String filePath = entity.getFilePath();
        if (filePath != null) {
            stmt.bindString(2, filePath);
        }
 
        String appname = entity.getAppname();
        if (appname != null) {
            stmt.bindString(3, appname);
        }
 
        String descFilePath = entity.getDescFilePath();
        if (descFilePath != null) {
            stmt.bindString(4, descFilePath);
        }
 
        java.util.Date registeredTime = entity.getRegisteredTime();
        if (registeredTime != null) {
            stmt.bindLong(5, registeredTime.getTime());
        }
 
        java.util.Date lastZipTime = entity.getLastZipTime();
        if (lastZipTime != null) {
            stmt.bindLong(6, lastZipTime.getTime());
        }
 
        Long lastFileSize = entity.getLastFileSize();
        if (lastFileSize != null) {
            stmt.bindLong(7, lastFileSize);
        }
 
        String awsFileId = entity.getAwsFileId();
        if (awsFileId != null) {
            stmt.bindString(8, awsFileId);
        }
 
        Long flag = entity.getFlag();
        if (flag != null) {
            stmt.bindLong(9, flag);
        }
 
        Long status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(10, status);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public FileInfo readEntity(Cursor cursor, int offset) {
        FileInfo entity = new FileInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // filePath
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // appname
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // descFilePath
            cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)), // registeredTime
            cursor.isNull(offset + 5) ? null : new java.util.Date(cursor.getLong(offset + 5)), // lastZipTime
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6), // lastFileSize
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // awsFileId
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // flag
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9) // status
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, FileInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFilePath(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAppname(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDescFilePath(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRegisteredTime(cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)));
        entity.setLastZipTime(cursor.isNull(offset + 5) ? null : new java.util.Date(cursor.getLong(offset + 5)));
        entity.setLastFileSize(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
        entity.setAwsFileId(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setFlag(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setStatus(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(FileInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(FileInfo entity) {
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
