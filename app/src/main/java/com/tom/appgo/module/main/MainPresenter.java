package com.tom.appgo.module.main;

import com.tom.appgo.ui.base.BasePresenter;

import javax.inject.Inject;

/*
* add by tom at 2016/12/26
*/
class MainPresenter extends BasePresenter<MainMvpView> {

    @Inject
    MainPresenter() {

    }

    void clickFab() {
        getMvpView().showFabClick();
    }
}
