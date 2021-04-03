package com.neppplus.pizzaorderapp_20210403

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.neppplus.pizzaorderapp_20210403.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {
//        버튼 클릭

    }

    override fun setValues() {
//        데이터 뿌려주는 곳

        mStore = intent.getSerializableExtra("store") as Store

        Glide.with(mContext).load(mStore.logoURL).into(logoImg)

        storeNameTxt.text = mStore.name
        phoneNumTxt.text = mStore.phoneNum


    }


}