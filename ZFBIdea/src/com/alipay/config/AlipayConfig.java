package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016080900196522";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCtRuaS91+No8t7ZquV2koXBVw3su0J0YfQ7DshizqzCYoznu/dziQn3IHlyF8SwhGkJGapdcAXhBoahJ7xpS6wgi9/YxKQWdPwU/hbJM9Jd4DzRmRYOV3Zc9+Rcozq40xlpi/SDb+Ufr0xMsbmwIrdp92ZCMVgkHIVTxTOQS0JllU5oafPqTvB2VpmitmDDjHiv2CBJjKZ8dSgnlSjG3495GiMcopBzQuk21uecHhZmdVJbh5DFHygGO8pS+iAg7iivUI0ORvRc0A7mnziQxT9chT0rg8ya2FM/xFD/aI2W84mswnEmi1nxAxIozKhk3hh6cK3gYzxAvKReL661GJlAgMBAAECggEBAKwxZBsydyODXUfxPJx7Q9tiuUSkq4hxT52f1Bc+jAO1fEBWNppeK3HtYKzflRNIBk3u2pKWcGEuJt6pYmZSt3YyuU7HPoBys/oFCC5TAydH+b5H+pnt0ESzML4SbtVRMe9l2enNPdAsrohApIZVWupw0fctTy/p+2UPpGZfQIlf0gfR0rWC3Ux5+GkIlY9iSNew1aELR3vzgsw0O+3ULDrvi7Oqh1a0X/9C6/+SrkZB/jxOFouWb3ppanIoWP1mS+lVQ6pZ9kMer/ic6A9RSHtacLZo2F5fpvcY9gU1WLj/ffTWXI6U8cl6WNv+vO2q8sd61jeIEMG1bsuuCduqYsECgYEA+Y3UURpr/qxmeE+emE0M1y1pBCmFW5M6OzHauOf9DDAE78zroTed+RCXQysf+GZQck20LiqkCFENyssmDEz5MMzv9AZkYNWlVKscAqTJGo5NbWb5PeAMSD0vQDL+Ji3/9DCtaNzarU/LeJ8Ka0rrFLE4wqW2vFlHw1E01FUzt5ECgYEAscCw261YDRx20n8BjKOLhDet7Ou8jsgQgbotDxJUraP2fOHroPLF9PBGLILerD8eRZt+3uBAtPV8KhSzubSukRj4cRkA09Jn1F4iJAuK25o/mYl2evMo9jtqjiryk3p483998LpVcUfh/TztkOA9Ui9Lp3TZyzxmE8ZBJnDaW5UCgYEAiYMm2J4Xnlk/idJN0Ry8E6I5OQrsKl8BenbpUHS9UsbvIXio6shr6z/CKkgMMOOoNqQswjfK9a48TGAPEj4kHkj/fFc9XsK7fOFg6PAGxPRfJAbXFspr2i6k59pxg3ZbkSJ1m8//S/spYsk4g5Df4yIY5eFMxZLo4W7RDqP4gJECgYAKyhFyJCF2GkY0HLVxXfP4AJE0ElMNr6Mg3LYjdg9hwtQRXH069cGCTptT1FXDyskBnKCk0qPa2BPDUiJeoVL/R6683rGoKdtXjqcv3Ot+zOwTW76vU9cmqxCatIyo2wRAc3qnhAfvqldTUcFxy8qtFGXZMkSOC4p+pMgLl0oJyQKBgHr/O+6bQoriuOSS4FblMc4F4JJL/ApLLs7gPKVRp0CMentpV9IYB8RrjoUqeZSz7ztNEkkDh8fFoLWTqbVafKBYYrNksYAGesunRoHfGlxI00psK7DWRoO1urIDuRgbiPv/FVKZS8cdyomDRKUk7TmeHm9p59fSrbbk0U1XDr3h";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3gjRBiZJYWFL+m9SDxOaOmAi5z4tcm/RdpRvB85K1WadINPQchmZAxNzSCj2d3VX2AkAhshkNKg8S/dYP/gSzbLzcNnjgeYpsPzBYvbiPAlDWtCrPBrFKN/d6P0N3oKzzRcX1GOpWDsrdyJKxwx5RpPJiT7qR9khcLb1rB+uwfqnbciEWHqRsR9fy+TqhkV9v6ypMXI05JPP8754O16jQfmLcM70DihmS/x/cGb39DtDqvySGGgxQRmI50TXzDidRLYFttjaNd7ZMUgtwpYj8KH5fY6NoDjctmCnnRF1pT7y8R29tiT6X73EdPb1PSjkrgBFG9kpunoYzFR0SPe7BwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问（扫码付款页面return_url ）
    public static String return_url = "http://localhost:8080/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

