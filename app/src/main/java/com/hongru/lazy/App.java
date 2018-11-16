package com.hongru.lazy;
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


import android.app.Application;

import me.yokeyword.fragmentation.Fragmentation;

/**
 * @author 彭鸿儒
 * @date 2018/11/16
 * 邮箱:peng_hongru@163.com
 */
public class App extends Application {

		@Override
		public void onCreate() {
				super.onCreate();
				Fragmentation.builder()
								// 显示悬浮球 ; 其他Mode:SHAKE: 摇一摇唤出   NONE：隐藏
								.stackViewMode(Fragmentation.BUBBLE)
								.debug(BuildConfig.DEBUG)
								.install();
		}
}
