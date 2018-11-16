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


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hongru.lazy.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 彭鸿儒
 * @date 2018/11/16
 * 邮箱:peng_hongru@163.com
 */
public class HomeEventAdapter extends RecyclerView.Adapter<HomeEventAdapter.LogEventViewHolder> {

		private List<HomeEvent> datas = new ArrayList<>();

		public HomeEventAdapter(List<HomeEvent> datas) {
				this.datas = datas;
		}

		@NonNull
		@Override
		public LogEventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
				View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main_log_event, null);
				return new LogEventViewHolder(inflate);
		}

		@Override
		public void onBindViewHolder(@NonNull LogEventViewHolder logEventViewHolder, int i) {
				logEventViewHolder.msg.setText(datas.get(i).getMsg());
		}

		@Override
		public int getItemCount() {
				return datas.size();
		}

		public static class LogEventViewHolder extends RecyclerView.ViewHolder {
				public TextView msg;


				public LogEventViewHolder(@NonNull View itemView) {
						super(itemView);
						msg = (TextView) itemView;
				}
		}

}
