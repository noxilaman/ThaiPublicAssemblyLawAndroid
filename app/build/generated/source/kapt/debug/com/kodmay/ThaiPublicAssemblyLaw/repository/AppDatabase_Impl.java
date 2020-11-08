package com.kodmay.ThaiPublicAssemblyLaw.repository;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.kodmay.ThaiPublicAssemblyLaw.repository.dao.AppDataDao;
import com.kodmay.ThaiPublicAssemblyLaw.repository.dao.AppDataDao_Impl;
import com.kodmay.ThaiPublicAssemblyLaw.repository.dao.LawCatDao;
import com.kodmay.ThaiPublicAssemblyLaw.repository.dao.LawCatDao_Impl;
import com.kodmay.ThaiPublicAssemblyLaw.repository.dao.LawDataDao;
import com.kodmay.ThaiPublicAssemblyLaw.repository.dao.LawDataDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AppDataDao _appDataDao;

  private volatile LawDataDao _lawDataDao;

  private volatile LawCatDao _lawCatDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `law_data` (`i_id` INTEGER NOT NULL, `c_comment` TEXT, `app_id` INTEGER NOT NULL, `c_desc` TEXT, `c_name` TEXT NOT NULL, `c_url` TEXT, `i_lawcat` INTEGER NOT NULL, `i_lawno` INTEGER NOT NULL, `i_no` INTEGER NOT NULL, `i_subno` INTEGER NOT NULL, `note` TEXT, PRIMARY KEY(`i_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `law_cat` (`i_id` INTEGER NOT NULL, `app_id` INTEGER NOT NULL, `c_desc` TEXT NOT NULL, `c_law_code` TEXT NOT NULL, `c_name` TEXT NOT NULL, `i_level` INTEGER NOT NULL, `i_parent_id` INTEGER NOT NULL, `i_seq` INTEGER NOT NULL, PRIMARY KEY(`i_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `app_data` (`id` INTEGER NOT NULL, `app_desc` TEXT NOT NULL, `app_img` TEXT NOT NULL, `app_id` TEXT NOT NULL, `name` TEXT NOT NULL, `store_id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf0747d4c3da917872c833036cac5899')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `law_data`");
        _db.execSQL("DROP TABLE IF EXISTS `law_cat`");
        _db.execSQL("DROP TABLE IF EXISTS `app_data`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsLawData = new HashMap<String, TableInfo.Column>(11);
        _columnsLawData.put("i_id", new TableInfo.Column("i_id", "INTEGER", true, 1));
        _columnsLawData.put("c_comment", new TableInfo.Column("c_comment", "TEXT", false, 0));
        _columnsLawData.put("app_id", new TableInfo.Column("app_id", "INTEGER", true, 0));
        _columnsLawData.put("c_desc", new TableInfo.Column("c_desc", "TEXT", false, 0));
        _columnsLawData.put("c_name", new TableInfo.Column("c_name", "TEXT", true, 0));
        _columnsLawData.put("c_url", new TableInfo.Column("c_url", "TEXT", false, 0));
        _columnsLawData.put("i_lawcat", new TableInfo.Column("i_lawcat", "INTEGER", true, 0));
        _columnsLawData.put("i_lawno", new TableInfo.Column("i_lawno", "INTEGER", true, 0));
        _columnsLawData.put("i_no", new TableInfo.Column("i_no", "INTEGER", true, 0));
        _columnsLawData.put("i_subno", new TableInfo.Column("i_subno", "INTEGER", true, 0));
        _columnsLawData.put("note", new TableInfo.Column("note", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLawData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLawData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLawData = new TableInfo("law_data", _columnsLawData, _foreignKeysLawData, _indicesLawData);
        final TableInfo _existingLawData = TableInfo.read(_db, "law_data");
        if (! _infoLawData.equals(_existingLawData)) {
          throw new IllegalStateException("Migration didn't properly handle law_data(com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData).\n"
                  + " Expected:\n" + _infoLawData + "\n"
                  + " Found:\n" + _existingLawData);
        }
        final HashMap<String, TableInfo.Column> _columnsLawCat = new HashMap<String, TableInfo.Column>(8);
        _columnsLawCat.put("i_id", new TableInfo.Column("i_id", "INTEGER", true, 1));
        _columnsLawCat.put("app_id", new TableInfo.Column("app_id", "INTEGER", true, 0));
        _columnsLawCat.put("c_desc", new TableInfo.Column("c_desc", "TEXT", true, 0));
        _columnsLawCat.put("c_law_code", new TableInfo.Column("c_law_code", "TEXT", true, 0));
        _columnsLawCat.put("c_name", new TableInfo.Column("c_name", "TEXT", true, 0));
        _columnsLawCat.put("i_level", new TableInfo.Column("i_level", "INTEGER", true, 0));
        _columnsLawCat.put("i_parent_id", new TableInfo.Column("i_parent_id", "INTEGER", true, 0));
        _columnsLawCat.put("i_seq", new TableInfo.Column("i_seq", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLawCat = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLawCat = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLawCat = new TableInfo("law_cat", _columnsLawCat, _foreignKeysLawCat, _indicesLawCat);
        final TableInfo _existingLawCat = TableInfo.read(_db, "law_cat");
        if (! _infoLawCat.equals(_existingLawCat)) {
          throw new IllegalStateException("Migration didn't properly handle law_cat(com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData).\n"
                  + " Expected:\n" + _infoLawCat + "\n"
                  + " Found:\n" + _existingLawCat);
        }
        final HashMap<String, TableInfo.Column> _columnsAppData = new HashMap<String, TableInfo.Column>(6);
        _columnsAppData.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsAppData.put("app_desc", new TableInfo.Column("app_desc", "TEXT", true, 0));
        _columnsAppData.put("app_img", new TableInfo.Column("app_img", "TEXT", true, 0));
        _columnsAppData.put("app_id", new TableInfo.Column("app_id", "TEXT", true, 0));
        _columnsAppData.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsAppData.put("store_id", new TableInfo.Column("store_id", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAppData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAppData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAppData = new TableInfo("app_data", _columnsAppData, _foreignKeysAppData, _indicesAppData);
        final TableInfo _existingAppData = TableInfo.read(_db, "app_data");
        if (! _infoAppData.equals(_existingAppData)) {
          throw new IllegalStateException("Migration didn't properly handle app_data(com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppData).\n"
                  + " Expected:\n" + _infoAppData + "\n"
                  + " Found:\n" + _existingAppData);
        }
      }
    }, "cf0747d4c3da917872c833036cac5899", "23d0a70547b42e1f231baebcba31abbc");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "law_data","law_cat","app_data");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `law_data`");
      _db.execSQL("DELETE FROM `law_cat`");
      _db.execSQL("DELETE FROM `app_data`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public AppDataDao appDataDao() {
    if (_appDataDao != null) {
      return _appDataDao;
    } else {
      synchronized(this) {
        if(_appDataDao == null) {
          _appDataDao = new AppDataDao_Impl(this);
        }
        return _appDataDao;
      }
    }
  }

  @Override
  public LawDataDao lawDataDao() {
    if (_lawDataDao != null) {
      return _lawDataDao;
    } else {
      synchronized(this) {
        if(_lawDataDao == null) {
          _lawDataDao = new LawDataDao_Impl(this);
        }
        return _lawDataDao;
      }
    }
  }

  @Override
  public LawCatDao lawCatDao() {
    if (_lawCatDao != null) {
      return _lawCatDao;
    } else {
      synchronized(this) {
        if(_lawCatDao == null) {
          _lawCatDao = new LawCatDao_Impl(this);
        }
        return _lawCatDao;
      }
    }
  }
}
