package com.example.xiaohan_lh.qiongyouapp.presenter;

/**
 * Created by xiaohan-lh on 16/3/14.
 */
public interface TabPresenter {
    public void getRecommend();
    public void getDestination();
    public void getCommunity();
    public void getHotListRecommend(String page);
    public void getCountryDetail(String countryid);
    public void getCityDetail(String cityid);
}
