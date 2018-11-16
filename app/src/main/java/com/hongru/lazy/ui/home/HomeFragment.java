package com.hongru.lazy.ui.home;
//<pre>
//                       _oo0oo_
//                      o8888888o
//                      88" . "88
//                      (| -_- |)
//                      0\  =  /0
//                    ___/`---'\___
//                  .' \\|     |// '.
//                 / \\|||  :  |||// \
//                / _||||| -:- |||||- \
//               |   | \\\  -  /// |   |
//               | \_|  ''\---/''  |_/ |
//               \  .-\__  '-'  ___/-. /
//             ___'. .'  /--.--\  `. .'___
//          ."" '<  `.___\_<|>_/___.' >' "".
//         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
//         \  \ `_.   \_ __\ /__ _/   .-` /  /
//     =====`-.____`.___ \_____/___.-`___.-'=====
//                       `=---='
//
//
//     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//
//               佛祖保佑         永无BUG
//</pre>


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hongru.lazy.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import me.yokeyword.fragmentation.ISupportFragment;
import me.yokeyword.fragmentation.SupportFragment;

/**
 * @author 彭鸿儒
 * @date 2018/11/16
 * 邮箱:peng_hongru@163.com
 */
public class HomeFragment extends SupportFragment {


		private List<HomeEvent>     mLogEvents = new ArrayList<>();
		private HomeEventAdapter    mLogEventAdapter;
		private LinearLayoutManager mLogEventLayoutManager;
		private RecyclerView        mEventList;


		@Nullable
		@Override
		public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
				View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_home, null);
				EventBus.getDefault().register(this);
				mEventList = inflate.findViewById(R.id.rv_home_event);
				mLogEventLayoutManager = new LinearLayoutManager(getContext());
				mEventList.setLayoutManager(mLogEventLayoutManager);
				mLogEventAdapter = new HomeEventAdapter(mLogEvents);
				mEventList.setAdapter(mLogEventAdapter);
				return inflate;
		}

		@Subscribe(threadMode = ThreadMode.MAIN)
		public void onLogEventReceive(HomeEvent event) {
				mLogEvents.add(event);
				mLogEventAdapter.notifyItemInserted(mLogEvents.size() - 1);
				mLogEventLayoutManager.smoothScrollToPosition(mEventList, null, mLogEvents.size() - 1);
		}

		@Override
		public void onDestroy() {
				EventBus.getDefault().unregister(this);
				super.onDestroy();
		}

		public static ISupportFragment newInstance() {
				return new HomeFragment();
		}


}
