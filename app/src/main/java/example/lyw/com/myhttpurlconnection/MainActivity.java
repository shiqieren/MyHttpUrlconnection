package example.lyw.com.myhttpurlconnection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //一旦获取网络请求后在UI线程的消息处理
        /*private Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what) {
                    case 0x001:
                        showImage.setImageBitmap(bitmap);
                        break;
                }
            }
        };*/

        //按钮点击发送网络请求事件设置
       /* public void onClick() {
            HttpUtil.sendGetRequest(
                    "https://pic3.zhimg.com/2585173a01d52b49d9714e2c50801d15.jpg",
                    new HttpCallbackListener() {
                        @Override
                        public void onFinish(byte[] response) {
                            bitmap = BitmapFactory.decodeByteArray(response, 0, response.length);
                            handler.sendEmptyMessage(0x001);
                        }

                        @Override
                        public void onError(Exception e) {
                            // 在这里对异常情况进行处理
                            Logger.e(e.getMessage());
                        }
                    });
        }*/
    }
}
