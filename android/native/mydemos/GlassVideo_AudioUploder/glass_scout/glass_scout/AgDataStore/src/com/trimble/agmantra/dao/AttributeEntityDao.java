package com.trimble.agmantra.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.SqlUtils;

import com.trimble.agmantra.entity.AttributeInfoEntity;
import com.trimble.agmantra.entity.Feature;

import com.trimble.agmantra.entity.AttributeEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ATTRIBUTE_ENTITY.
*/
public class AttributeEntityDao extends AbstractDao<AttributeEntity, Long> {

    public static final String TABLENAME = "ATTRIBUTE_ENTITY";

    /**
     * Properties of entity AttributeEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Value = new Property(1, String.class, "value", false, "VALUE");
        public final static Property FeatureId = new Property(2, Long.class, "featureId", false, "FEATURE_ID");
        public final static Property AttributeInfoId = new Property(3, Long.class, "attributeInfoId", false, "ATTRIBUTE_INFO_ID");
    };

    private DaoSession daoSession;


    public AttributeEntityDao(DaoConfig config) {
        super(config);
    }
    
    public AttributeEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ATTRIBUTE_ENTITY' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'VALUE' TEXT," + // 1: value
                "'FEATURE_ID' INTEGER," + // 2: featureId
                "'ATTRIBUTE_INFO_ID' INTEGER);"); // 3: attributeInfoId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ATTRIBUTE_ENTITY'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, AttributeEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String value = entity.getValue();
        if (value != null) {
            stmt.bindString(2, value);
        }
 
        Long featureId = entity.getFeatureId();
        if (featureId != null) {
            stmt.bindLong(3, featureId);
        }
 
        Long attributeInfoId = entity.getAttributeInfoId();
        if (attributeInfoId != null) {
            stmt.bindLong(4, attributeInfoId);
        }
    }

    @Override
    protected void attachEntity(AttributeEntity entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public AttributeEntity readEntity(Cursor cursor, int offset) {
        AttributeEntity entity = new AttributeEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // value
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // featureId
            cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3) // attributeInfoId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, AttributeEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setValue(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setFeatureId(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setAttributeInfoId(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(AttributeEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(AttributeEntity entity) {
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
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getFeatureDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getAttributeInfoEntityDao().getAllColumns());
            builder.append(" FROM ATTRIBUTE_ENTITY T");
            builder.append(" LEFT JOIN FEATURE T0 ON T.'FEATURE_ID'=T0.'_id'");
            builder.append(" LEFT JOIN ATTRIBUTE_INFO_ENTITY T1 ON T.'ATTRIBUTE_INFO_ID'=T1.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected AttributeEntity loadCurrentDeep(Cursor cursor, boolean lock) {
        AttributeEntity entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Feature feature = loadCurrentOther(daoSession.getFeatureDao(), cursor, offset);
        entity.setFeature(feature);
        offset += daoSession.getFeatureDao().getAllColumns().length;

        AttributeInfoEntity attributeInfoEntity = loadCurrentOther(daoSession.getAttributeInfoEntityDao(), cursor, offset);
        entity.setAttributeInfoEntity(attributeInfoEntity);

        return entity;    
    }

    public AttributeEntity loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<AttributeEntity> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<AttributeEntity> list = new ArrayList<AttributeEntity>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<AttributeEntity> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<AttributeEntity> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
