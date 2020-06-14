package com.wu.springboot.mapper;

import com.wu.springboot.pojo.MsgLog;

import java.util.List;

public interface MsgLogMapper {

    void insert(MsgLog msgLog);

    void updateStatus(MsgLog msgLog);

    List<MsgLog> selectTimeoutMsg();

    void updateTryCount(MsgLog msgLog);

    MsgLog selectByPrimaryKey(String msgId);

}
