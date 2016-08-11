package com.otherhshe.niceread.presenter;


import rx.Subscription;

/**
 * Author: Othershe
 * Time:  2016/8/11 11:17
 */
public class BasePresenter<V> {
    public V mView;
    public Subscription mSubscription;

    public void attach(V view) {
        mView = view;
    }

    public void detach() {
        mView = null;
        mSubscription.unsubscribe();
    }
}
