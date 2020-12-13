package com.xin.mybatis3study;

import com.xin.mybatis3study.entity.ChannelEntity;
import com.xin.mybatis3study.mapper.ChannelMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class mybatisSingleTest {

    @Test
    public void mybatisXmlTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Object o = sqlSession.selectOne("com.xin.mybatis3study.mapper.ChannelMapper.selectChannel", 1);

        ChannelMapper mapper = sqlSession.getMapper(ChannelMapper.class);
        ChannelEntity channelEntity = mapper.selectChannel("1");
        System.out.println(channelEntity);
    }

}
