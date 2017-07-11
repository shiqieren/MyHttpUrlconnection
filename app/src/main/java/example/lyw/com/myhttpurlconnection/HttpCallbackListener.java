package example.lyw.com.myhttpurlconnection;

/**
 * Created by lyw on 2017/7/11.
 */

public interface HttpCallbackListener {
    // 网络请求成功
    void onFinish(byte[] response);

    // 网络请求失败
    void onError(Exception e);
}
