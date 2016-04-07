package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import utils.Dbutils;
import entity.Person;

public class PersonDao {
	private QueryRunner runner=null;
	public PersonDao(){
		runner=new QueryRunner();
	}

	
	public void add(Person p) throws SQLException {
		String sql="insert into person(name,age,description) values(?,?,?)";
		runner.update(Dbutils.getConnection(), sql, p.getName(),p.getAge(),p.getDescription());

	}

	
	public void update(Person p) throws SQLException {
		String sql = "update person set name=?,age=?,description=? where id=?";
		runner.update(Dbutils.getConnection(),sql, p.getName(),p.getAge(),p.getDescription(),p.getId());
	}

	
	public void delete(int id) throws SQLException {
		String sql = "delete from person where id=?";
		runner.update(Dbutils.getConnection(), sql, id);
	}

	
	public Person findById(int id) throws SQLException {
		String sql = "select name,age,description from person where id=?";
		Person p = runner.query(Dbutils.getConnection(), sql, new BeanHandler<Person>(Person.class),id);
		
		return p;
	}

	
	public List<Person> findAll() throws SQLException {
		String sql = "select name,age,description from person";
		List<Person> persons = runner.query(Dbutils.getConnection(), sql, new BeanListHandler<Person>(Person.class));
		return persons;
	}

	
	public long personCount()throws SQLException{
		String sql = "select count(id) from person";
		return runner.query(Dbutils.getConnection(),sql, new ScalarHandler<Long>());
	}

}
