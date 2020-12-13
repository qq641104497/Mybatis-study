package com.xin.mybatis3study.mapper;

import com.xin.mybatis3study.entity.ChannelEntity;

public interface ChannelMapper {

    ChannelEntity selectChannel(String id);
}
