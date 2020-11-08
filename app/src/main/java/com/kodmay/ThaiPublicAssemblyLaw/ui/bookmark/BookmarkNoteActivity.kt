package com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback
import com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse
import kotlinx.android.synthetic.main.activity_bookmark_note.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.okButton
import org.jetbrains.anko.toast

class BookmarkNoteActivity : AppCompatActivity(), HttpCallback<AddBookmarkResponse> {

    var lawId: Int = 0
    var note: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark_note)
        lawId = intent.getIntExtra("lawId",0)
        note = intent.getStringExtra("note")

        edt_note.setText(note)

        tv_cancel.setOnClickListener {
            finish()
        }

        tv_ok.setOnClickListener {
            LawRepository.getInstance().addBookmarkNote(lawId,edt_note.text.toString(),this)
        }


    }

    override fun onSuccess(data: AddBookmarkResponse) {
        alert(message = "เพิ่มบันทึกเรียบร้อยแล้ว"){
            okButton { finish() }
        }.show()
    }

    override fun onFailure(error: String) {
        toast(error).show()
    }
}
