package com.kodmay.ThaiPublicAssemblyLaw.ui.forgotpassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback
import com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse
import kotlinx.android.synthetic.main.activity_forgot_password.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.okButton

class ForgotPasswordActivity : AppCompatActivity(), HttpCallback<UserResponse> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        tv_cancel.setOnClickListener { finish() }

        btn_ok.setOnClickListener { forgotPassword() }

        tv_login.setOnClickListener {
            //startActivity<LoginActivity>()
            finish()
        }
    }

    private fun forgotPassword() {
        if (!edt_email.text.toString().isValidEmail()){
            edt_email.error = "รูปแบบอีเมลไม่ถูกต้อง"
            edt_email.requestFocus()
            return
        }

        LawRepository.getInstance().forgotPassword(edt_email.text.toString(),this)
    }

    override fun onSuccess(data: UserResponse) {
        alert(data.message){
            okButton { it.dismiss() }
        }.show()
    }

    override fun onFailure(error: String) {
        alert(error){
            okButton { it.dismiss() }
        }.show()
    }

    private fun String.isValidEmail(): Boolean = this.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

}
