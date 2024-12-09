package icu.sd.trade.exception;

import java.util.Map;

/**
 * 参数异常
 *
 * @author: YouGan
 * @date: 2024/12-8
 */
public class ParamException extends RuntimeException{
    private Map map;

    public ParamException(Map map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
    }
}
