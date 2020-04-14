package java_MiddleRank.jdbc.jdbc_9;

import java_MiddleRank.jdbc.test.test_8.Hero;

import java.util.List;

public interface HeroDAO {
    //添加
    public void add(Hero hero);
    //修改
    public void update(Hero hero);
    //删除
    public void delete(int id);
    //获取
    public Hero get(int id);
    //查询
    public List<Hero> list();
    //分页查询
    public List<Hero> list(int start,int count);

}
