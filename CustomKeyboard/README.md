# 自定义键盘

https://github.com/futabooo/Markey

https://github.com/AnkitDroidGit/Android-Custom-Keyboard


KeyboardView
KeyboardView 一个用于呈现虚拟键盘的 view，同时处理着每一个键盘所对应的点击、触摸等事件。

Keyboard 的样式是以 XML 文件的形式存在的，由多个 Row 和 Key 组成，我们可以直接在 XML 定义键盘的行、键、以及键大小


Keyboard 表示整个键盘， Row 表示其中一行，Key 表示某一个具体按键

android:keyWidth="10.000002%p"　键的默认宽度，以像素为单位或显示宽度的百分比。％后缀总是表示基本大小的百分比;可选的％p后缀提供相对于某个父容器的大小.

单位可以是sp,dp,px,in,mm.

android:keyHeight="50dp"　　　　　表示每一个键的高度

android:horizontalGap="1.0px"表示行间距

android:verticalGap="1.0px"表示列间距


//收银机屏幕信息

{
density:1.3312501,
densityDpi:213,
widthPixels:1280, heightPixels:736,
widthDpi:962.0023, heightDpi:553.36383,
ststusHeightPix:32, statusHeightDp:24,
orientation:"横屏", systemVersion:"6.0.1",
systemModel:"S1", deviceBrand:"Allwinner",
facturer:"Allwinner", product:"tulip_zf101s",
sdkLevel:23
}


//vivo
{
density:3.0,
densityDpi:480,
widthPixels:1920, heightPixels:1080,
widthDpi:640.5, heightDpi:360.5,
ststusHeightPix:69,
statusHeightDp:23,
orientation:"横屏",
systemVersion:"5.0.2",
systemModel:"vivo X5Pro V",
deviceBrand:"vivo",
facturer:"vivo",
product:"PD1421V",
sdkLevel:21
}

//华为
{density:2.0,
 densityDpi:320,
  widthPixels:1280,heightPixels:720,
  widthDpi:640.5, heightDpi:360.5,
  ststusHeightPix:50,
  statusHeightDp:25,
  orientation:"横屏",
  systemVersion:"5.0.2",
  systemModel:"CHE-TL00",
  deviceBrand:"Honor",
  facturer:"HUAWEI",
  product:"CHE-TL00",
  sdkLevel:21}


  420dpi  density=2.625
  width:1920  1080

  1920:731.92dp

  1080:411.92dp

  3: 411,最小宽度
  2019-07-02 16:36:45.822 8186-8186/com.cdc.Keyboard E/123: 387,高度
  2019-07-02 16:36:45.822 8186-8186/com.cdc.Keyboard E/123: 683,宽度


<item android:color="?textColorError" />  这种写法？？？

V void (只能用于返回值类型)
Z boolean
B byte
S short
C char
I int
J long（64位）
F float
D double（64位）


基本指令
smali字节码是类似于汇编的，如果你有汇编基础，理解起来是非常容易的。
move v0, v3 把v3寄存器的值移动到寄存器v0上
const-string v0, “MainActivity” 把字符串”MainActivity”赋值给v0寄存器
invoke-super　　调用父函数
return-void　　函数返回void
new-instance　　创建实例
iput-object　　对象赋值
iget-object　　调用对象
invoke-static　　调用静态函数
invoke-direct　　调用函数


adb 报错

https://blog.csdn.net/gufenchen/article/details/91383397

pos_activity-->main
PosActivity -->MainActivity
pos_main_takeout.xml--->外面  订单管理

PosActivityMoreSettingsFragment  更多

PosActivitySettingFragment  设置页面父

main_setting_10500.xml  设置页面布局

com.laiqian.pos.industry.setting.MainSetting  设置页面
com.laiqian.pos.settings.ShopInfoSettingsActivity  店铺管理  activity_shop_infos_setting

com.laiqian.auth.UserManagement  员工管理

订单管理
pos_wechat_titlebar_right
wei_order_list

接单
takeout_receiver
pos_wechat_titlebar_left

退款
print_content_return_suffix
dialog_pay_return_title
pos_return_pay_amount


pos_wechat_titlebar_center  pos_wechat_titlebar_left pos_wechat_titlebar_right

pos_main_more_10500.xml

//单例模式
https://www.jianshu.com/p/829a523c32aa