package com.gus.temp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.OvershootInterpolator;


import com.gus.temp.R;
import com.gus.temp.adapter.MediaAdapter;
import com.gus.temp.common.BaseFragment;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by gus on 2018/4/19.
 */

public class LocalMediaFragment extends BaseFragment {
    private static final String BUNDLE_ALBUM = "album";
    @BindView(R.id.srl_refresh)
    SwipeRefreshLayout mRefreshLayout;
    @BindView(R.id.rv_img)
    RecyclerView mRecyclerView;
    private MediaAdapter mAdapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int setContentView() {
        return R.layout.fragment_local_media;
    }

    @Override
    protected void initView() {
        initAdapter();
        initRefreshLayout();
        initRecyclerView();
    }

    private void initRefreshLayout() {
        mRefreshLayout.setOnRefreshListener(() -> {
            mAlbum = Album.getAllMediaAlbum();
            display();

        });
    }

    private void initAdapter() {

    }

    private void initRecyclerView() {
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        mRecyclerView.setAdapter(mAdapter);
        display();
    }

    private void display() {
        Observable.create(new )
    }
}
