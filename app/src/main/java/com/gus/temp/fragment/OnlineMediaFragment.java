package com.gus.temp.fragment;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.OvershootInterpolator;


import com.gus.temp.R;
import com.gus.temp.common.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by gus on 2018/4/19.
 */

public class OnlineMediaFragment extends BaseFragment {
//    @BindView(R.id.srl_refresh)
//    SwipeRefreshLayout mRefreshLayout;
//    @BindView(R.id.rv_img)
//    RecyclerView mRecyclerView;
//    private AlbumsAdapter mAdapter;
//    private GridSpacingItemDecoration mItemDecoration;

    @Override
    protected int setContentView() {
        return R.layout.fragment_online_media;
    }

    @Override
    protected void initView() {
//        initAdapter();
//        initRefreshLayout();
//        initRecyclerView();
    }

//    private void initRefreshLayout() {
//        initAdapter();
//        initRecyclerView();
//    }
//
//    private void initAdapter() {
//        mAdapter = new AlbumsAdapter(getContext(), new ActionsListener() {
//            @Override
//            public void onItemSelected(int position) {
//                Intent intent = new Intent(getContext(), OnlineMediaActivity.class);
//                startActivity(intent);
//            }
//
//            @Override
//            public void onSelectMode(boolean selectMode) {
//
//            }
//
//            @Override
//            public void onSelectionCountChanged(int selectionCount, int totalCount) {
//
//            }
//        });
//    }
//
//    private void initRecyclerView() {
//        mItemDecoration = new GridSpacingItemDecoration(3, Measure.pxToDp(3, getContext()), true);
//        mRecyclerView.setHasFixedSize(true);
//        mRecyclerView.addItemDecoration(mItemDecoration);
//        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
//        mRecyclerView.setItemAnimator(
//                AnimationUtils.getItemAnimator(
//                        new LandingAnimator(new OvershootInterpolator(1f))
//                ));
//
//        mRecyclerView.setAdapter(mAdapter);
//        displayAlbums();
//    }
//
//    private void displayAlbums() {
//        ArrayList<String> excludedFolders = HandlingAlbums.getInstance(getContext().getApplicationContext()).getExcludedFolders(getContext());
//        mAdapter.clear();
//        SQLiteDatabase db = HandlingAlbums.getInstance(getContext().getApplicationContext()).getReadableDatabase();
//        CPHelper.getAlbums(getContext(), false, excludedFolders, mAdapter.sortingMode(), mAdapter.sortingOrder())
//                .subscribeOn(Schedulers.io())
//                .map(album -> album.withSettings(HandlingAlbums.getSettings(db, album.getPath())))
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(
//                        album -> mAdapter.add(album),
//                        Throwable::printStackTrace,
//                        db::close);
//    }
}
