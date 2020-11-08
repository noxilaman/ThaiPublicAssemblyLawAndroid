package com.kodmay.ThaiPublicAssemblyLaw.ui.changepassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.avalue.phsc.data.preferences.LawPrefs
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.common.Contextor
import com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback
import com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.ChangePasswordResponse
import kotlinx.android.synthetic.main.activity_change_password.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.okButton

class ChangePasswordActivity : AppCompatActivity(), HttpCallback<ChangePasswordResponse> {

    private val lawPref by lazy { LawPrefs(Contextor.getInstance().context) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        tv_cancel.setOnClickListener { finish() }

        tv_cancel2.setOnClickListener { finish() }

        btn_ok.setOnClickListener { changePassword() }
    }

    private fun changePassword() {
        var valid = true

        if (edt_password_old.text.toString().isBlank()) {
            edt_password_old.error = "ต้องกรอกรหัสผ่านเดิม"
            edt_password_old.requestFocus()
            valid = false
        }

        if (edt_password_new.text.toString().isBlank()) {
            edt_password_new.error = "ต้องกรอกรหัสผ่านใหม่"
            if (valid) {
                edt_password_new.requestFocus()
            }
            valid = false
        }

        if (!edt_password_new.text.toString().equals(edt_confirm_password.text.toString())) {
            edt_confirm_password.error = "ยืนยันรหัสผ่านไม่ตรงกัน"
            if (valid) {
                edt_confirm_password.requestFocus()
            }
            valid = false
        }

        if (valid) {
            LawRepository.getInstance().changePassword(
                lawPref.userId,
                edt_password_old.text.toString(),
                edt_password_new.text.toString(),
                this
            )
        }
    }

    override fun onSuccess(data: ChangePasswordResponse) {
        alert(data.message){
            if (data.result) {
                okButton { finish() }
            }
        }.show()
    }

    override fun onFailure(error: String) {
        alert(message = error){ okButton { it.dismiss() }}.show()
    }
}
