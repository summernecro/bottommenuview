package com.summer.demo;

//by summer on 2018-04-16.

import com.summer.base.ope.BaseUIOpe;
import com.summer.bottommenuview.BottomMenuBean;
import com.summer.demo.databinding.ActMainaBinding;

import java.util.ArrayList;

public class MainUIOpe extends BaseUIOpe<ActMainaBinding> {

    ArrayList<BottomMenuBean> bottomMenuBeans = new ArrayList<>();

    @Override
    public void initUI() {
        super.initUI();
        bottomMenuBeans.add(new BottomMenuBean("视频", R.drawable.ic_launcher_background,null,null,getBaseUIAct().getResources().getColorStateList(R.color.black)));
        bottomMenuBeans.add(new BottomMenuBean("图片", R.drawable.ic_launcher_background,null,null,getBaseUIAct().getResources().getColorStateList(R.color.black)));
        bottomMenuBeans.add(new BottomMenuBean("文字", R.drawable.ic_launcher_background,null,null,getBaseUIAct().getResources().getColorStateList(R.color.black)));
        bottomMenuBeans.add(new BottomMenuBean("设置", R.drawable.ic_launcher_background,null,null,getBaseUIAct().getResources().getColorStateList(R.color.black)));
        getBind().bmv.initItems(bottomMenuBeans);
    }
}
