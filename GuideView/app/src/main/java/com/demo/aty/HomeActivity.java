package com.demo.aty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.demo.coordinate.CoordinateActivity;
import com.demo.guide.R;

public class HomeActivity extends Activity implements View.OnClickListener {
  private Button mBtnAty, mBtnFrag, mBtnList, mBtnView, mBtnFragView, mBtnMore,btn_coordinate;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    mBtnAty = (Button) findViewById(R.id.btn_aty);
    mBtnFrag = (Button) findViewById(R.id.btn_frag);
    mBtnFragView = (Button) findViewById(R.id.btn_frag_view);
    mBtnList = (Button) findViewById(R.id.btn_list);
    mBtnMore = (Button) findViewById(R.id.btn_more);
    mBtnView = (Button) findViewById(R.id.btn_view);
    btn_coordinate = (Button) findViewById(R.id.btn_coordinate);
    mBtnAty.setOnClickListener(this);
    mBtnFrag.setOnClickListener(this);
    mBtnFragView.setOnClickListener(this);
    mBtnList.setOnClickListener(this);
    mBtnMore.setOnClickListener(this);
    mBtnView.setOnClickListener(this);
    btn_coordinate.setOnClickListener(this);
  }

  @Override public void onClick(View view) {
    switch (view.getId()) {
      case R.id.btn_aty://遮罩整个activity
        startActivity(new Intent(HomeActivity.this, FullActivity.class));
        break;
      case R.id.btn_frag://遮罩整个fragment
        startActivity(new Intent(HomeActivity.this, FragActivity.class).putExtra("fragmentId",0));
        break;
      case R.id.btn_frag_view://遮罩fragment中的某个view
        startActivity(new Intent(HomeActivity.this, FragActivity.class).putExtra("fragmentId",1));
        break;
      case R.id.btn_list://遮罩listview
        startActivity(new Intent(HomeActivity.this, MyListActivity.class));
        break;
      case R.id.btn_more://单个页面多个遮罩
        startActivity(new Intent(HomeActivity.this, SimpleGuideViewActivity.class));
        break;
      case R.id.btn_view://遮罩某个view
        startActivity(new Intent(HomeActivity.this, ViewActivity.class));
        break;
        //测试获取View的坐标
      case R.id.btn_coordinate:
        startActivity(new Intent(HomeActivity.this, CoordinateActivity.class));
        break;
    }
  }
}
