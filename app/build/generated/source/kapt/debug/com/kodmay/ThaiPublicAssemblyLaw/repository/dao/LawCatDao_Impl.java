package com.kodmay.ThaiPublicAssemblyLaw.repository.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LawCatDao_Impl implements LawCatDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCatData;

  private final EntityInsertionAdapter __insertionAdapterOfCatData_1;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCatData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfCatData;

  private final SharedSQLiteStatement __preparedStmtOfClearAllCatData;

  public LawCatDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCatData = new EntityInsertionAdapter<CatData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `law_cat`(`i_id`,`app_id`,`c_desc`,`c_law_code`,`c_name`,`i_level`,`i_parent_id`,`i_seq`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CatData value) {
        stmt.bindLong(1, value.getI_id());
        stmt.bindLong(2, value.getApp_id());
        if (value.getC_desc() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getC_desc());
        }
        if (value.getC_law_code() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getC_law_code());
        }
        if (value.getC_name() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getC_name());
        }
        stmt.bindLong(6, value.getI_level());
        stmt.bindLong(7, value.getI_parent_id());
        stmt.bindLong(8, value.getI_seq());
      }
    };
    this.__insertionAdapterOfCatData_1 = new EntityInsertionAdapter<CatData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `law_cat`(`i_id`,`app_id`,`c_desc`,`c_law_code`,`c_name`,`i_level`,`i_parent_id`,`i_seq`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CatData value) {
        stmt.bindLong(1, value.getI_id());
        stmt.bindLong(2, value.getApp_id());
        if (value.getC_desc() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getC_desc());
        }
        if (value.getC_law_code() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getC_law_code());
        }
        if (value.getC_name() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getC_name());
        }
        stmt.bindLong(6, value.getI_level());
        stmt.bindLong(7, value.getI_parent_id());
        stmt.bindLong(8, value.getI_seq());
      }
    };
    this.__deletionAdapterOfCatData = new EntityDeletionOrUpdateAdapter<CatData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `law_cat` WHERE `i_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CatData value) {
        stmt.bindLong(1, value.getI_id());
      }
    };
    this.__updateAdapterOfCatData = new EntityDeletionOrUpdateAdapter<CatData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `law_cat` SET `i_id` = ?,`app_id` = ?,`c_desc` = ?,`c_law_code` = ?,`c_name` = ?,`i_level` = ?,`i_parent_id` = ?,`i_seq` = ? WHERE `i_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CatData value) {
        stmt.bindLong(1, value.getI_id());
        stmt.bindLong(2, value.getApp_id());
        if (value.getC_desc() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getC_desc());
        }
        if (value.getC_law_code() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getC_law_code());
        }
        if (value.getC_name() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getC_name());
        }
        stmt.bindLong(6, value.getI_level());
        stmt.bindLong(7, value.getI_parent_id());
        stmt.bindLong(8, value.getI_seq());
        stmt.bindLong(9, value.getI_id());
      }
    };
    this.__preparedStmtOfClearAllCatData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM law_cat";
        return _query;
      }
    };
  }

  @Override
  public void insertCatData(final CatData catData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCatData.insert(catData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllCatData(final List<CatData> catData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCatData_1.insert(catData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCatData(final CatData catData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCatData.handle(catData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCatData(final CatData catData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCatData.handle(catData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearAllCatData() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearAllCatData.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearAllCatData.release(_stmt);
    }
  }

  @Override
  public Flowable<List<CatData>> getCatData() {
    final String _sql = "SELECT * FROM law_cat order by i_seq asc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"law_cat"}, new Callable<List<CatData>>() {
      @Override
      public List<CatData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIId = CursorUtil.getColumnIndexOrThrow(_cursor, "i_id");
          final int _cursorIndexOfAppId = CursorUtil.getColumnIndexOrThrow(_cursor, "app_id");
          final int _cursorIndexOfCDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "c_desc");
          final int _cursorIndexOfCLawCode = CursorUtil.getColumnIndexOrThrow(_cursor, "c_law_code");
          final int _cursorIndexOfCName = CursorUtil.getColumnIndexOrThrow(_cursor, "c_name");
          final int _cursorIndexOfILevel = CursorUtil.getColumnIndexOrThrow(_cursor, "i_level");
          final int _cursorIndexOfIParentId = CursorUtil.getColumnIndexOrThrow(_cursor, "i_parent_id");
          final int _cursorIndexOfISeq = CursorUtil.getColumnIndexOrThrow(_cursor, "i_seq");
          final List<CatData> _result = new ArrayList<CatData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CatData _item;
            final int _tmpI_id;
            _tmpI_id = _cursor.getInt(_cursorIndexOfIId);
            final int _tmpApp_id;
            _tmpApp_id = _cursor.getInt(_cursorIndexOfAppId);
            final String _tmpC_desc;
            _tmpC_desc = _cursor.getString(_cursorIndexOfCDesc);
            final String _tmpC_law_code;
            _tmpC_law_code = _cursor.getString(_cursorIndexOfCLawCode);
            final String _tmpC_name;
            _tmpC_name = _cursor.getString(_cursorIndexOfCName);
            final int _tmpI_level;
            _tmpI_level = _cursor.getInt(_cursorIndexOfILevel);
            final int _tmpI_parent_id;
            _tmpI_parent_id = _cursor.getInt(_cursorIndexOfIParentId);
            final int _tmpI_seq;
            _tmpI_seq = _cursor.getInt(_cursorIndexOfISeq);
            _item = new CatData(_tmpI_id,_tmpApp_id,_tmpC_desc,_tmpC_law_code,_tmpC_name,_tmpI_level,_tmpI_parent_id,_tmpI_seq);
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
}
