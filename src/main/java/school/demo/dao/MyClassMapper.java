package school.demo.dao;

import org.apache.ibatis.annotations.Param;
import school.demo.entity.MyClass;
import school.demo.entity.MyClassExample;

import java.util.List;

public interface MyClassMapper {
    long countByExample(MyClassExample example);

    int deleteByExample(MyClassExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(MyClass record);

    int insertSelective(MyClass record);

    List<MyClass> selectByExample(MyClassExample example);

    MyClass selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") MyClass record, @Param("example") MyClassExample example);

    int updateByExample(@Param("record") MyClass record, @Param("example") MyClassExample example);

    int updateByPrimaryKeySelective(MyClass record);

    int updateByPrimaryKey(MyClass record);
}