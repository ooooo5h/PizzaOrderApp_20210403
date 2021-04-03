package com.neppplus.pizzaorderapp_20210403.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.pizzaorderapp_20210403.EditNicknameActivity
import com.neppplus.pizzaorderapp_20210403.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : Fragment() {

//    닉네임을 가지러 간다는 구별을 하기 위한 고유 숫자

    val REQUEST_FOR_NICKNAME = 1564

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile,container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        editNicknameBtn.setOnClickListener {

//            닉네임을 받아오기 위한 별도의 행동
//            startActivityForResult

           val myIntent = Intent(activity, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_FOR_NICKNAME) {

            if (resultCode == Activity.RESULT_OK) {

                val newNickname = data?.getStringExtra("nick")

                nicknameTxt.text = newNickname

            }

        }
    }
}