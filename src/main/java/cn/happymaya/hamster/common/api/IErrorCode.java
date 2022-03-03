package cn.happymaya.hamster.common.api;

/**
 * 封装 API 的错误码
 * Created by superhsc on 2019/4/19.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
