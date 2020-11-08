package com.kodmay.ThaiPublicAssemblyLaw.repository.dao;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppData;
import io.reactivex.Flowable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDataDao_Impl implements AppDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfAppData;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfAppData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfAppData;

  private final SharedSQLiteStatement __preparedStmtOfClearAllAppData;

  public AppDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAppData = new EntityInsertionAdapter<AppData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `app_data`(`id`,`app_desc`,`app_img`,`app_id`,`name`,`store_id`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppData value) {
        stmt.bindLong(1, value.getId());
        if (value.getApp_desc() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getApp_desc());
        }
        if (value.getApp_img() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getApp_img());
        }
        if (value.getApp_id() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getApp_id());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        stmt.bindLong(6, value.getStore_id());
      }
    };
    this.__deletionAdapterOfAppData = new EntityDeletionOrUpdateAdapter<AppData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `app_data` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppData value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfAppData = new EntityDeletionOrUpdateAdapter<AppData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `app_data` SET `id` = ?,`app_desc` = ?,`app_img` = ?,`app_id` = ?,`name` = ?,`store_id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppData value) {
        stmt.bindLong(1, value.getId());
        if (value.getApp_desc() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getApp_desc());
        }
        if (value.getApp_img() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getApp_img());
        }
        if (value.getApp_id() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getApp_id());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        stmt.bindLong(6, value.getStore_id());
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfClearAllAppData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM app_data";
        return _query;
      }
    };
  }

  @Override
  public void insertAppData(final AppData appData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAppData.insert(appData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAppData(final AppData appData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfAppData.handle(appData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateAppData(final AppData appData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfAppData.handle(appData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearAllAppData() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearAllAppData.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearAllAppData.release(_stmt);
    }
  }

  @Override
  public Flowable<List<AppData>> getAppData() {
    final String _sql = "SELECT * FROM app_data";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"app_data"}, new Callable<List<AppData>>() {
      @Override
      public List<AppData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAppDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "app_desc");
          final int _cursorIndexOfAppImg = CursorUtil.getColumnIndexOrThrow(_cursor, "app_img");
          final int _cursorIndexOfAppId = CursorUtil.getColumnIndexOrThrow(_cursor, "app_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfStoreId = CursorUtil.getColumnIndexOrThrow(_cursor, "store_id");
          final List<AppData> _result = new ArrayList<AppData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AppData _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpApp_desc;
            _tmpApp_desc = _cursor.getString(_cursorIndexOfAppDesc);
            final String _tmpApp_img;
            _tmpApp_img = _cursor.getString(_cursorIndexOfAppImg);
            final String _tmpApp_id;
            _tmpApp_id = _cursor.getString(_cursorIndexOfAppId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpStore_id;
            _tmpStore_id = _cursor.getInt(_cursorIndexOfStoreId);
            _item = new AppData(_tmpId,_tmpApp_desc,_tmpApp_img,_tmpApp_id,_tmpName,_tmpStore_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<Integer> getAppDataCount() {
    final String _sql = "SELECT count(*) FROM app_data";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
