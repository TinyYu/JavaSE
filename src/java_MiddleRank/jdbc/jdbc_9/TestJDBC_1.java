package java_MiddleRank.jdbc.jdbc_9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestJDBC_1 implements HeroDAO{
    static TestJDBC_1 testJDBC_1 = new TestJDBC_1();
    public static void main(String[] args) {
         Hero hero1 = new Hero();
         hero1.setName("hero_add");
         hero1.setHp(444);
         hero1.setDamage(300);
         testJDBC_1.add(hero1);

         Hero hero2 = testJDBC_1.get(300);
         System.out.println(hero2);

         hero2.setId(300);
         hero2.setName("hero_update");
         hero2.setHp(1);
         hero2.setDamage(2);
         testJDBC_1.update(hero2);

         testJDBC_1.delete(502);

         List<Hero> list = new ArrayList<>();
         list = testJDBC_1.list();
         for (Hero h : list){
             System.out.println(h);
         }

         List<Hero> heroList = new ArrayList<>();
         heroList = testJDBC_1.list(0,5);
         for (Hero hero : heroList){
             System.out.println(hero);
         }
    }

    public TestJDBC_1(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException{
        return DriverManager
                .getConnection("jdbc:mysql://127.0.0.1:3306/test_jdbc?characterEncoding=UTF-8","admin","1999");
    }
    @Override
    public void add(Hero hero) {
        PreparedStatement ps = null;
        Connection c = null;
        try {
            c = testJDBC_1.getConnection();
            String sql = "insert into hero values(null,?,?,?)";
            ps = c.prepareStatement(sql);
            ps.setString(1,hero.getName());
            ps.setFloat(2,hero.getHp());
            ps.setInt(3,hero.getDamage());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void update(Hero hero) {
        PreparedStatement ps = null;
        Connection c = null;
        try {
            c = testJDBC_1.getConnection();
            String sql = "update hero set name = ?,hp = ?,damage = ? where id = ?";
            ps = c.prepareStatement(sql);
            ps.setString(1,hero.getName());
            ps.setFloat(2,hero.getHp());
            ps.setInt(3,hero.getDamage());
            ps.setInt(4,hero.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement ps = null;
        Connection c = null;
        try {
            c = testJDBC_1.getConnection();
            String sql = "delete from hero where id = ?";
            ps = c.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public Hero get(int id) {
        Statement s = null;
        Connection c = null;
        Hero hero = new Hero();
        try {
            c = testJDBC_1.getConnection();
            String sql = "select * from hero where id = id";
            s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                hero.setId(rs.getInt("id"));
                hero.setName(rs.getString("name"));
                hero.setHp(rs.getFloat("hp"));
                hero.setDamage(rs.getInt("damage"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (s != null){
                try {
                    s.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return hero;
    }

    @Override
    public List<Hero> list() {
        Statement s = null;
        Connection c = null;
        List<Hero> heroList = new ArrayList<>();
        try {
            c = testJDBC_1.getConnection();
            String sql = "select * from hero";
            s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                Hero hero = new Hero();
                hero.setId(rs.getInt("id"));
                hero.setName(rs.getString("name"));
                hero.setHp(rs.getFloat("hp"));
                hero.setDamage(rs.getInt("damage"));
                heroList.add(hero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (s != null){
                try {
                    s.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return heroList;
    }

    @Override
    public List<Hero> list(int start, int count) {
        Statement s = null;
        Connection c = null;
        List<Hero> heroList = new ArrayList<>();
        try {
            c = testJDBC_1.getConnection();
            String sql = String.format("select * from hero limit %d,%d",start,count);
            s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                Hero hero = new Hero();
                hero.setId(rs.getInt("id"));
                hero.setName(rs.getString("name"));
                hero.setHp(rs.getFloat("hp"));
                hero.setDamage(rs.getInt("damage"));
                heroList.add(hero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (s != null){
                try {
                    s.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return heroList;
    }
}
