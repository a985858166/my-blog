package xin.inote.my.blog.commons.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 自定义返回结果
 */
public class BaseResult {
    //正确代码
    public static final int STATUS_SUCCESS = 200;
    //错误代码
    public static final int STATUS_FAIL= 500;
    //状态码
    @Getter
    @Setter
    private int status;
    //用来储存自定义消息
    @Getter
    @Setter
    private String message;
    //用来储存自定义数据
    @Getter
    @Setter
    private Object data;

    /**
     * 默认的成功消息
     * message = "成功"
     * @return
     */
    public static BaseResult success(){
        return createResult(STATUS_SUCCESS,"成功",null);
    }

    /**
     * @param message 自定义消息
     * @return
     */
    public static BaseResult success(String message){
        return createResult(STATUS_SUCCESS,message,null);
    }

    /**
     * @param message 自定义消息
     * @param data 需要存储的数据
     * @return
     */
    public static BaseResult success(String message,Object data){
        return createResult(STATUS_SUCCESS,message,data);
    }

    /**
     * 默认的失败消息
     * message = "失败"
     * @return
     */
    public static BaseResult fail(){
        return createResult(STATUS_FAIL,"失败",null);
    }

    /**
     * @param message 自定义失败消息
     * @return
     */
    public static BaseResult fail(String message){
        return createResult(STATUS_FAIL,message,null);
    }

    /**
     * @param status 自定义错误代码
     * @param message 自定义错误消息
     * @return
     */
    public static BaseResult fail(int status,String message){
        return createResult(status,message,null);
    }

    /**
     * 仅供该类内部使用，用来创建BaseResult
     * @param status
     * @param message
     * @param data
     * @return
     */
    private static BaseResult createResult(int status,String message,Object data){
        BaseResult baseResult = new BaseResult();
        baseResult.setStatus(status);
        baseResult.setMessage(message);
        baseResult.setData(data);
        return baseResult;
    }

}
