package school.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyScoreMapper {
    long countByExample(MyScoreExample example);

    int deleteByExample(MyScoreExample example);

    int deleteByPrimaryKey(MyScoreKey key);

    int insert(MyScoreKey record);

    int insertSelective(MyScoreKey record);

    List<MyScoreKey> selectByExample(MyScoreExample example);

    int updateByExampleSelective(@Param("record") MyScoreKey record, @Param("example") MyScoreExample example);

    int updateByExample(@Param("record") MyScoreKey record, @Param("example") MyScoreExample example);
}