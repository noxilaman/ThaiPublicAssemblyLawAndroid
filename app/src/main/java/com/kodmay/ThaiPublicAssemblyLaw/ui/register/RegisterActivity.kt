package com.kodmay.ThaiPublicAssemblyLaw.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import com.avalue.phsc.data.preferences.LawPrefs
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.common.Contextor
import com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback
import com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse
import com.kodmay.ThaiPublicAssemblyLaw.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.okButton
import org.jetbrains.anko.startActivity

class RegisterActivity : AppCompatActivity(), HttpCallback<UserResponse> {

    private val lawPref by lazy { LawPrefs(Contextor.getInstance().context) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        tv_cancel.setOnClickListener { finish() }

        btn_ok.setOnClickListener { register() }

        tv_login.setOnClickListener {
            startActivity<LoginActivity>()
            finish()
        }
    }

    private fun register() {
        var valid = true
        if (!edt_email.text.toString().isValidEmail()){
            edt_email.error = "รูปแบบอีเมลไม่ถูกต้อง"
            edt_email.requestFocus()
            valid = false
        }

        if (edt_password.text.toString().isBlank()){
            edt_password.error = "ต้องกรอกรหัสผ่าน"
            if(valid){
                edt_password.requestFocus()
            }
            valid = false
        }

        if (!edt_password.text.toString().equals(edt_confirm_password.text.toString())){
            edt_confirm_password.error = "ยืนยันรหัสผ่านไม่ตรงกัน"
            if (valid){
                edt_confirm_password.requestFocus()
            }
            valid = false
        }

        if (valid){
            LawRepository.getInstance().register(edt_email.text.toString(),
                edt_password.text.toString(),
                lawPref.appId, this)
        }
    }

    override fun onSuccess(data: UserResponse) {
        alert("สมัครสมาชิกเรียบร้อยแล้ว") {
            okButton { finish() }
        }.show()
    }

    override fun onFailure(error: String) {
        alert(message = error) { okButton { it.dismiss() } }.show()
    }

    private fun String.isValidEmail(): Boolean = this.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
}
