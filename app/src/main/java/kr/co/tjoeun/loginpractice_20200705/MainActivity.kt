package kr.co.tjoeun.loginpractice_20200705

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        버튼 눌렀을때
        loginBtn.setOnClickListener {
            val email = emailEdt.toString()
            val pw = pwdEdt.toString()

//            if문으로 확인
            if(email == "admin@test.com" && pw == "qwer1234"){
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }else{Toast.makeText(this, "로그인 실패.", Toast.LENGTH_SHORT).show()}

        }
    }
}