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


import org.greenrobot.eventbus.EventBus;

/**
 * @author 彭鸿儒
 * @date 2018/11/16
 * 邮箱:peng_hongru@163.com
 */
public class HomeEvent {

		private String msg;

		public String getMsg() {
				return msg;
		}

		public HomeEvent(String msg) {
				this.msg = msg;
		}

		public static void postEvent(String message) {
				EventBus.getDefault().post(new HomeEvent(message));
		}


}
