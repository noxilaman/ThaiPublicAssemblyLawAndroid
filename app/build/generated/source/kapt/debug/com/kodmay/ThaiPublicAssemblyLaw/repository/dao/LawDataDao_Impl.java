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
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LawDataDao_Impl implements LawDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfLawData;

  private final EntityInsertionAdapter __insertionAdapterOfLawData_1;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfLawData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfLawData;

  private final SharedSQLiteStatement __preparedStmtOfClearAllLawData;

  public LawDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLawData = new EntityInsertionAdapter<LawData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `law_data`(`i_id`,`c_comment`,`app_id`,`c_desc`,`c_name`,`c_url`,`i_lawcat`,`i_lawno`,`i_no`,`i_subno`,`note`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LawData value) {
        stmt.bindLong(1, value.getI_id());
        if (value.getC_comment() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getC_comment());
        }
        stmt.bindLong(3, value.getApp_id());
        if (value.getC_desc() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getC_desc());
        }
        if (value.getC_name() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getC_name());
        }
        if (value.getC_url() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getC_url());
        }
        stmt.bindLong(7, value.getI_lawcat());
        stmt.bindLong(8, value.getI_lawno());
        stmt.bindLong(9, value.getI_no());
        stmt.bindLong(10, value.getI_subno());
        if (value.getNote() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getNote());
        }
      }
    };
    this.__insertionAdapterOfLawData_1 = new EntityInsertionAdapter<LawData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `law_data`(`i_id`,`c_comment`,`app_id`,`c_desc`,`c_name`,`c_url`,`i_lawcat`,`i_lawno`,`i_no`,`i_subno`,`note`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LawData value) {
        stmt.bindLong(1, value.getI_id());
        if (value.getC_comment() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getC_comment());
        }
        stmt.bindLong(3, value.getApp_id());
        if (value.getC_desc() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getC_desc());
        }
        if (value.getC_name() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getC_name());
        }
        if (value.getC_url() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getC_url());
        }
        stmt.bindLong(7, value.getI_lawcat());
        stmt.bindLong(8, value.getI_lawno());
        stmt.bindLong(9, value.getI_no());
        stmt.bindLong(10, value.getI_subno());
        if (value.getNote() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getNote());
        }
      }
    };
    this.__deletionAdapterOfLawData = new EntityDeletionOrUpdateAdapter<LawData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `law_data` WHERE `i_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LawData value) {
        stmt.bindLong(1, value.getI_id());
      }
    };
    this.__updateAdapterOfLawData = new EntityDeletionOrUpdateAdapter<LawData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `law_data` SET `i_id` = ?,`c_comment` = ?,`app_id` = ?,`c_desc` = ?,`c_name` = ?,`c_url` = ?,`i_lawcat` = ?,`i_lawno` = ?,`i_no` = ?,`i_subno` = ?,`note` = ? WHERE `i_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LawData value) {
        stmt.bindLong(1, value.getI_id());
        if (value.getC_comment() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getC_comment());
        }
        stmt.bindLong(3, value.getApp_id());
        if (value.getC_desc() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getC_desc());
        }
        if (value.getC_name() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getC_name());
        }
        if (value.getC_url() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getC_url());
        }
        stmt.bindLong(7, value.getI_lawcat());
        stmt.bindLong(8, value.getI_lawno());
        stmt.bindLong(9, value.getI_no());
        stmt.bindLong(10, value.getI_subno());
        if (value.getNote() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getNote());
        }
        stmt.bindLong(12, value.getI_id());
      }
    };
    this.__preparedStmtOfClearAllLawData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM law_data";
        return _query;
      }
    };
  }

  @Override
  public void insertLawData(final LawData lawData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLawData.insert(lawData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllLawData(final List<LawData> lawData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLawData_1.insert(lawData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteLawData(final LawData lawData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfLawData.handle(lawData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLawData(final LawData lawData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfLawData.handle(lawData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearAllLawData() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearAllLawData.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearAllLawData.release(_stmt);
    }
  }

  @Override
  public Flowable<List<LawData>> getLawData() {
    final String _sql = "select * FROM law_data order by i_no asc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"law_data"}, new Callable<List<LawData>>() {
      @Override
      public List<LawData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIId = CursorUtil.getColumnIndexOrThrow(_cursor, "i_id");
          final int _cursorIndexOfCComment = CursorUtil.getColumnIndexOrThrow(_cursor, "c_comment");
          final int _cursorIndexOfAppId = CursorUtil.getColumnIndexOrThrow(_cursor, "app_id");
          final int _cursorIndexOfCDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "c_desc");
          final int _cursorIndexOfCName = CursorUtil.getColumnIndexOrThrow(_cursor, "c_name");
          final int _cursorIndexOfCUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "c_url");
          final int _cursorIndexOfILawcat = CursorUtil.getColumnIndexOrThrow(_cursor, "i_lawcat");
          final int _cursorIndexOfILawno = CursorUtil.getColumnIndexOrThrow(_cursor, "i_lawno");
          final int _cursorIndexOfINo = CursorUtil.getColumnIndexOrThrow(_cursor, "i_no");
          final int _cursorIndexOfISubno = CursorUtil.getColumnIndexOrThrow(_cursor, "i_subno");
          final int _cursorIndexOfNote = CursorUtil.getColumnIndexOrThrow(_cursor, "note");
          final List<LawData> _result = new ArrayList<LawData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final LawData _item;
            final int _tmpI_id;
            _tmpI_id = _cursor.getInt(_cursorIndexOfIId);
            final String _tmpC_comment;
            _tmpC_comment = _cursor.getString(_cursorIndexOfCComment);
            final int _tmpApp_id;
            _tmpApp_id = _cursor.getInt(_cursorIndexOfAppId);
            final String _tmpC_desc;
            _tmpC_desc = _cursor.getString(_cursorIndexOfCDesc);
            final String _tmpC_name;
            _tmpC_name = _cursor.getString(_cursorIndexOfCName);
            final String _tmpC_url;
            _tmpC_url = _cursor.getString(_cursorIndexOfCUrl);
            final int _tmpI_lawcat;
            _tmpI_lawcat = _cursor.getInt(_cursorIndexOfILawcat);
            final int _tmpI_lawno;
            _tmpI_lawno = _cursor.getInt(_cursorIndexOfILawno);
            final int _tmpI_no;
            _tmpI_no = _cursor.getInt(_cursorIndexOfINo);
            final int _tmpI_subno;
            _tmpI_subno = _cursor.getInt(_cursorIndexOfISubno);
            final String _tmpNote;
            _tmpNote = _cursor.getString(_cursorIndexOfNote);
            _item = new LawData(_tmpI_id,_tmpC_comment,_tmpApp_id,_tmpC_desc,_tmpC_name,_tmpC_url,_tmpI_lawcat,_tmpI_lawno,_tmpI_no,_tmpI_subno,_tmpNote);
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
  public Flowable<LawData> getLawDataById(final int id) {
    final String _sql = "select * FROM law_data where i_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createFlowable(__db, false, new String[]{"law_data"}, new Callable<LawData>() {
      @Override
      public LawData call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIId = CursorUtil.getColumnIndexOrThrow(_cursor, "i_id");
          final int _cursorIndexOfCComment = CursorUtil.getColumnIndexOrThrow(_cursor, "c_comment");
          final int _cursorIndexOfAppId = CursorUtil.getColumnIndexOrThrow(_cursor, "app_id");
          final int _cursorIndexOfCDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "c_desc");
          final int _cursorIndexOfCName = CursorUtil.getColumnIndexOrThrow(_cursor, "c_name");
          final int _cursorIndexOfCUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "c_url");
          final int _cursorIndexOfILawcat = CursorUtil.getColumnIndexOrThrow(_cursor, "i_lawcat");
          final int _cursorIndexOfILawno = CursorUtil.getColumnIndexOrThrow(_cursor, "i_lawno");
          final int _cursorIndexOfINo = CursorUtil.getColumnIndexOrThrow(_cursor, "i_no");
          final int _cursorIndexOfISubno = CursorUtil.getColumnIndexOrThrow(_cursor, "i_subno");
          final int _cursorIndexOfNote = CursorUtil.getColumnIndexOrThrow(_cursor, "note");
          final LawData _result;
          if(_cursor.moveToFirst()) {
            final int _tmpI_id;
            _tmpI_id = _cursor.getInt(_cursorIndexOfIId);
            final String _tmpC_comment;
            _tmpC_comment = _cursor.getString(_cursorIndexOfCComment);
            final int _tmpApp_id;
            _tmpApp_id = _cursor.getInt(_cursorIndexOfAppId);
            final String _tmpC_desc;
            _tmpC_desc = _cursor.getString(_cursorIndexOfCDesc);
            final String _tmpC_name;
            _tmpC_name = _cursor.getString(_cursorIndexOfCName);
            final String _tmpC_url;
            _tmpC_url = _cursor.getString(_cursorIndexOfCUrl);
            final int _tmpI_lawcat;
            _tmpI_lawcat = _cursor.getInt(_cursorIndexOfILawcat);
            final int _tmpI_lawno;
            _tmpI_lawno = _cursor.getInt(_cursorIndexOfILawno);
            final int _tmpI_no;
            _tmpI_no = _cursor.getInt(_cursorIndexOfINo);
            final int _tmpI_subno;
            _tmpI_subno = _cursor.getInt(_cursorIndexOfISubno);
            final String _tmpNote;
            _tmpNote = _cursor.getString(_cursorIndexOfNote);
            _result = new LawData(_tmpI_id,_tmpC_comment,_tmpApp_id,_tmpC_desc,_tmpC_name,_tmpC_url,_tmpI_lawcat,_tmpI_lawno,_tmpI_no,_tmpI_subno,_tmpNote);
          } else {
            _result = null;
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
