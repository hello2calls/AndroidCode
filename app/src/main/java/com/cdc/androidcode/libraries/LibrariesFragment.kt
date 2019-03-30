package com.cdc.androidcode.libraries
import afollestad.AfollestadDialogActivity
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.cdc.androidcode.BaseFragment
import com.cdc.androidcode.R
import com.cdc.androidcode.application.RecycleViewDivider
import com.cdc.androidcode.libraries.camera.CameraMainActivity
import com.cdc.androidcode.libraries.cityPicker.CityPickerMainActivity
import com.cdc.androidcode.libraries.glide.GlideMainActivity
import com.cdc.androidcode.libraries.immersionbar.ImmersionbarMainActivity
import com.cdc.androidcode.libraries.jpush.JpushMainActivity
import com.cdc.androidcode.libraries.materialDesign.MaterialDesignMainActivity
import com.cdc.androidcode.libraries.okhttp.OkHttpMainActivity
import com.cdc.androidcode.libraries.recy_divider.RecyDividerMainActivity
import com.cdc.androidcode.libraries.retrofit.RetrofitMainActivity
import com.cdc.androidcode.libraries.rxjava.RxJavaMainActivity
import com.cdc.androidcode.libraries.statusbarColor.StatusBarColorMainActivity
import com.cdc.androidcode.libraries.update.UpdateMainActivity
import com.cdc.androidcode.ui.UIItemAdapter
import com.cdc.androidcode.ui.UIItemBean
import com.cdc.autosize.DefaultErrorActivity
import com.cdc.dialog.FragmentDialogActivity
import com.cdc.mapsearchlocation.MapSearchLocationMainActivity
import com.cdc.okhttp3.Okhttp3MainActivity
import com.chad.baserecyclerviewadapterhelper.BaseRecyclerViewAdapterHelperActivity
import kotlinx.android.synthetic.main.fragment_library.*

/**
 * ProjectName：AndroidCode
 * DESC: (类描述)
 * Created by chendongchu 2019\1\18 0018
 * updateName:(修改人名称)
 * updateTime:(修改时间)11:58
 * updateDesc:(修改内容)
 */
class LibrariesFragment : BaseFragment() {
    private lateinit var uiAdapter: UIItemAdapter


    override fun layoutId(): Int {
        return R.layout.fragment_library
    }

    override fun initView() {
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.addItemDecoration(
            RecycleViewDivider(
                activity,
                LinearLayoutManager.VERTICAL,
                R.drawable.shape_recycleview_divider
            )
        )
    }

    override fun initData() {
        var list: MutableList<UIItemBean> = ArrayList()
        list.add(UIItemBean("Immersionbar", "https://github.com/gyf-dev/ImmersionBar", ImmersionbarMainActivity::class.java))
        list.add(UIItemBean("StatusBarColor", "https://github.com/laobie/StatusBarUtil", StatusBarColorMainActivity::class.java))
        list.add(UIItemBean("Retrofit", "Retrofit", RetrofitMainActivity::class.java))
        list.add(UIItemBean("RxJava", "RxJava", RxJavaMainActivity::class.java))
        list.add(UIItemBean("MaterialDesign", "MaterialDesign", MaterialDesignMainActivity::class.java))
        list.add(UIItemBean("Glide", "Glide1", GlideMainActivity::class.java))
        list.add(UIItemBean("Jpush", "Jpush", JpushMainActivity::class.java))
        list.add(
            UIItemBean(
                "Update",
                "https://github.com/Lee465357793/AppUpdateDialog",
                UpdateMainActivity::class.java
            )
        )
        list.add(
            UIItemBean(
                "baserecyclerviewadapterhelper",
                "https://github.com/CymChad/BaseRecyclerViewAdapterHelper",
                BaseRecyclerViewAdapterHelperActivity::class.java
            )
        )
        list.add(
            UIItemBean(
                "RecyclerView 分割线",
                "https://github.com/yqritc/RecyclerView-FlexibleDivider",
                RecyDividerMainActivity::class.java
            )
        )

        list.add(
            UIItemBean(
                "高德地图搜索定位",
                "https://lbs.amap.com",
                MapSearchLocationMainActivity::class.java
            )
        )

//        list.add(
//            UIItemBean(
//                "Toasty",
//                "https://github.com/GrenderG/Toasty",
//                ToastyMainActivity::class.java
//            )
//        )

//        list.add(
//            UIItemBean(
//                "StyleableToast",
//                "https://github.com/Muddz/StyleableToast",
//                ToastSyleActivity::class.java
//            )
//        )

        list.add(
            UIItemBean(
                "afollestad Dialog",
                "https://github.com/afollestad/material-dialogs",
                AfollestadDialogActivity::class.java
            )
        )

        list.add(
            UIItemBean(
                "AutoSize",
                "https://github.com/JessYanCoding/AndroidAutoSize",
                DefaultErrorActivity::class.java
            )
        )

        list.add(
            UIItemBean(
                "OkHttp3",
                "https://github.com/square/okhttp",
                OkHttpMainActivity::class.java
            )
        )


        list.add(
            UIItemBean(
                "Custom  Dialog by Fragment",
                "https://github.com/nidhinvv/BubbleAlert",
                FragmentDialogActivity::class.java
            )
        )


        list.add(
            UIItemBean(
                "Camera",
                "多个Camera Library",
                CameraMainActivity::class.java
            )
        )

        list.add(
            UIItemBean(
                "CityPicker",
                "https://github.com/zaaach/CityPicker",
                CityPickerMainActivity::class.java
            )
        )






        uiAdapter = UIItemAdapter(R.layout.ui_item, list)
        recyclerView.adapter = uiAdapter
        uiAdapter.setOnItemClickListener { adapter, view, position ->
            run {
                var intent = Intent(view.context, list[position].clas)
                view.context.startActivity(intent)
            }

        }
    }


}