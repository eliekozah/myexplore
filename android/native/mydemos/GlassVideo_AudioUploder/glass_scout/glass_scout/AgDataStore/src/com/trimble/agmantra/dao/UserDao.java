package com.trimble.agmantra.dao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.Query;
import de.greenrobot.dao.QueryBuilder;

import com.trimble.agmantra.entity.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table USER.
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Userid = new Property(0, Long.class, "userid", true, "USERID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property OrgId = new Property(2, String.class, "orgId", false, "ORG_ID");
    };

    private Query<User> organization_OrganizationQuery;

    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'USER' (" + //
                "'USERID' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: userid
                "'NAME' TEXT," + // 1: name
                "'ORG_ID' TEXT NOT NULL );"); // 2: orgId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'USER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long userid = entity.getUserid();
        if (userid != null) {
            stmt.bindLong(1, userid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindString(3, entity.getOrgId());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // userid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getString(offset + 2) // orgId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setUserid(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setOrgId(cursor.getString(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setUserid(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getUserid();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "Organization" to-many relationship of Organization. */
    public synchronized List<User> _queryOrganization_Organization(String orgId) {
        if (organization_OrganizationQuery == null) {
            QueryBuilder<User> queryBuilder = queryBuilder();
            queryBuilder.where(Properties.OrgId.eq(orgId));
            organization_OrganizationQuery = queryBuilder.build();
        } else {
            organization_OrganizationQuery.setParameter(0, orgId);
        }
        return organization_OrganizationQuery.list();
    }

}
