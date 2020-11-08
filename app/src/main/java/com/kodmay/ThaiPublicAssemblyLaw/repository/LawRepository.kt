package com.kodmay.ThaiPublicAssemblyLaw.repository

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import com.avalue.phsc.data.preferences.LawPrefs
import com.kodmay.ThaiPublicAssemblyLaw.api.ApiEndpoint
import com.kodmay.ThaiPublicAssemblyLaw.api.NetService
import com.kodmay.ThaiPublicAssemblyLaw.common.Contextor
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.*
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class LawRepository : LawDataSource {

    private val api by lazy { NetService.getRetrofit().create(ApiEndpoint::class.java)}
    private val lawPref by lazy { LawPrefs(Contextor.getInstance().context) }
    private val appDatabase by lazy { AppDatabase.getAppDatabase(Contextor.getInstance().context) }

    @SuppressLint("CheckResult")
    override fun register(email: String, password: String, appId: Int, callback: HttpCallback<UserResponse>) {
        api.registerUser(email,password,appId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    lawPref.userId = it.body()!!.userId
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun login(email: String, password: String, appId: Int, callback: HttpCallback<UserResponse>) {
        api.login(email,password,appId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    if (it.body()!!.result) {
                        lawPref.userId = it.body()!!.userId
                        callback.onSuccess(it.body()!!)
                    }else{
                        callback.onFailure(it.body()!!.message)
                    }
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun changePassword(
        userId: Int,
        oldPassword: String,
        newPassword: String,
        callback: HttpCallback<ChangePasswordResponse>
    ) {
        api.changePassword(userId,oldPassword,newPassword)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun forgotPassword(email: String, callback: HttpCallback<UserResponse>) {
        api.forgotPassword(email)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    if(it.body()!!.result) {
                        callback.onSuccess(it.body()!!)
                    }else{
                        callback.onFailure(it.body()!!.message)
                    }
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadAppData(packageName: String, callback: HttpCallback<AppDataResponse>) {
        api.loadAppData(packageName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    lawPref.appId = it.body()!!.dataList.first().id
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadLawData(appID: Int, callback: HttpCallback<LawDataResponse>) {
        api.loadLawData(appID)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadLawByCat(appID: Int, callback: HttpCallback<LawByCatResponse>) {
        api.loadLawByCate(appID)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadCatLawItem(catId: Int, appID: Int, callback: HttpCallback<LawByCatResponse>) {
        api.loadCateLawItem(catId,appID)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadLawDataByCat(catId: Int, appID: Int, callback: HttpCallback<LawByCatResponse>) {
        api.loadLawDataByCat(catId,appID)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadLawDetail(lawID: Int, appID: Int, callback: HttpCallback<LawDataResponse>) {
        api.loadLawDetail(lawID,appID)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadDekaByLawId(lawId: Int, callback: HttpCallback<DekaLawResponse>) {
        api.loadDekaListByLawId(lawId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadAppStoreList(callback: HttpCallback<AppListResponse>) {
        api.loadAppStoreList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun addBookmark(lawId: Int, callback: HttpCallback<AddBookmarkResponse>) {
        api.addBookmark(lawId, lawPref.userId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun addBookmarkNote(lawId: Int, note: String, callback: HttpCallback<AddBookmarkResponse>) {
        api.addBookmarkNote(lawId, lawPref.userId, note)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadBookmark(callback: HttpCallback<BookmarkResponse>) {
        api.loadBookmark(lawPref.userId, lawPref.appId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadBookmarkNote(lawId: Int,callback: HttpCallback<BookmarkNoteResponse>) {
        api.loadBookmarkNote(lawPref.userId, lawId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun deleteBookmark(lawId: Int, callback: HttpCallback<AddBookmarkResponse>) {
        api.deleteBookmark(lawPref.userId, lawId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    callback.onSuccess(it.body()!!)
                } else {
                    callback.onFailure(it.errorBody()!!.string())
                }
            }, {
                it.printStackTrace()
                callback.onFailure("Connection Error.")
            })
    }

    @SuppressLint("CheckResult")
    override fun loadInitial(context: Context, callback: HttpVoidCallback) {

        Flowable.fromCallable { appDatabase.appDataDao().getAppDataCount().blockingGet() }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                if (it > 0){
                    callback.onSuccess()
                    loadData(context,null)
                }else{
                    loadData(context,callback)
                }
            }

    }

    private fun loadData(context: Context, callback: HttpVoidCallback?){

        loadAppData(context.packageName, object : HttpCallback<AppDataResponse>{
            @SuppressLint("CheckResult")
            override fun onSuccess(appData: AppDataResponse) {
                Flowable.fromCallable { appDatabase.appDataDao().insertAppData(appData.dataList.first()) }
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe { Log.d("Room", "Insert AppData")
                        loadLawData(appData.dataList.first().id,object :HttpCallback<LawDataResponse>{
                            override fun onSuccess(lawData: LawDataResponse) {
                                Flowable.fromCallable { appDatabase.lawDataDao().insertAllLawData(lawData.dataList) }
                                    .subscribeOn(Schedulers.io())
                                    .observeOn(AndroidSchedulers.mainThread())
                                    .subscribe {
                                        loadLawByCat(appData.dataList.first().id, object :HttpCallback<LawByCatResponse>{

                                            override fun onSuccess(catRes: LawByCatResponse) {
                                                Flowable.fromCallable { appDatabase.lawCatDao().insertAllCatData(catRes.dataList) }
                                                    .subscribeOn(Schedulers.io())
                                                    .observeOn(AndroidSchedulers.mainThread())
                                                    .subscribe {
                                                        callback?.onSuccess()
                                                    }
                                            }

                                            override fun onFailure(error: String) {
                                                callback?.onFailure(error)
                                            }
                                        })
                                    }
                            }

                            override fun onFailure(error: String) {
                                callback?.onFailure(error)
                            }
                        })
                    }
            }

            override fun onFailure(error: String) {

            }
        })
    }

    @SuppressLint("CheckResult")
    override fun loadCacheLawDetail(lawId: Int, callback: HttpCallback<LawData>) {
        Flowable.fromCallable { appDatabase.lawDataDao().getLawDataById(lawId).blockingFirst() }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                callback.onSuccess(it)
            }
    }

    @SuppressLint("CheckResult")
    override fun loadCacheLaw(callback: HttpCallback<List<LawData>>) {
        Flowable.fromCallable { appDatabase.lawDataDao().getLawData().blockingFirst() }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                callback.onSuccess(it)
            }
    }

    companion object {

        private var INSTANCE: LawRepository? = null

        @JvmStatic
        fun getInstance(): LawRepository {
            return INSTANCE ?: LawRepository()
                .apply { INSTANCE = this }
        }

        @JvmStatic
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}