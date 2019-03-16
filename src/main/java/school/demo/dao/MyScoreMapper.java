package school.demo.dao;

import org.apache.ibatis.annotations.Param;
import school.demo.entity.MyScore;
import school.demo.entity.MyScoreExample;

import java.util.List;

public interface MyScoreMapper {
    long countByExample(MyScoreExample example);

    int deleteByExample(MyScoreExample example);

    int deleteByPrimaryKey(@Param("courseid") Integer courseid, @Param("studentid") Integer studentid, @Param("score") Integer score);

    int insert(MyScore record);

    int insertSelective(MyScore record);

    List<MyScore> selectByExample(MyScoreExample example);

    int updateByExampleSelective(@Param("record") MyScore record, @Param("example") MyScoreExample example);

    int updateByExample(@Param("record") MyScore record, @Param("example") MyScoreExample example);
}