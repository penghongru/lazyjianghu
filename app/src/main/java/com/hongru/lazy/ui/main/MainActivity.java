package com.hongru.lazy.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hongru.lazy.R;
import com.hongru.lazy.ui.home.HomeFragment;

import me.yokeyword.fragmentation.SupportActivity;


public class MainActivity extends SupportActivity {


		@Override
		protected void onCreate(@Nullable Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.activity_main);
				if (null == findFragment(HomeFragment.class)) {
						loadRootFragment(R.id.fl_main_content, HomeFragment.newInstance());  // 加载根Fragment
				}
		}


}
